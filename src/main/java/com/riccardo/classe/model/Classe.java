package com.riccardo.classe.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Set;

import java.util.List;
@Data
@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome classe obbligatio")
    private String nome;  // Es: "3A", "4B"

    @ManyToOne
    @JoinColumn(name = "professore_id", nullable = false)
    private Professore professore;

    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    @JsonManagedReference("classe-studente")
    private List<Studente> studenti;

    public Long getId() {
        return id;
    }

}
