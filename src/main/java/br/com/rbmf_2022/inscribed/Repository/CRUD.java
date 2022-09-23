package br.com.rbmf_2022.inscribed.Repository;

import br.com.rbmf_2022.inscribed.Model.inscrebed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRUD extends JpaRepository <inscrebed, Long> {
}
