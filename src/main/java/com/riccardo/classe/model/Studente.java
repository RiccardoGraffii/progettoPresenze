package com.riccardo.classe.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Entity
@Data
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotBlank(message = "Nome non obbligatorio")
    private String nome;
    @NotBlank(message = "Nome non obbligatorio")
    private String cognome;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;


    @OneToMany(mappedBy = "studente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Presenza> presenze;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

}
