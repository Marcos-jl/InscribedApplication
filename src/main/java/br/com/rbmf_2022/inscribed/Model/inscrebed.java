package br.com.rbmf_2022.inscribed.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class inscrebed {

    @Id
    private Long id;
    private String name;
    private String subscription;
    private Instant date;
}
