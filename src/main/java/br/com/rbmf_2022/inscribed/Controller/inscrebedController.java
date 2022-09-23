package br.com.rbmf_2022.inscribed.Controller;

import br.com.rbmf_2022.inscribed.Model.inscrebed;
import br.com.rbmf_2022.inscribed.Repository.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscritos")
public class inscrebedController {

    @Autowired
    private CRUD repository;

    @GetMapping
    public List<inscrebed> show(){
        return repository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody inscrebed inscrito) {repository.save(inscrito);
    }

    @PutMapping
    public void update(@RequestBody inscrebed inscrito) {
        repository.save(inscrito);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable Long id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void filter(@PathVariable Long id){
        repository.findById(id);
    }
}
