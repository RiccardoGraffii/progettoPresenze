package com.riccardo.classe.model;
import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.Data;

@Entity
@Data
public class Presenza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data", nullable = false)
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "VARCHAR(15) DEFAULT 'ASSENTE'")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "studente_id")
    private Studente studente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public enum Status {
        ASSENTE, PRESENTE, GIUSTIFICATO
    }
}
