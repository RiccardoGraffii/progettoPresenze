package com.riccardo.classe.repository;

import com.riccardo.classe.model.Classe;
import com.riccardo.classe.model.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface StudenteRepository extends JpaRepository<Studente, Long>, JpaSpecificationExecutor<Studente> {
    List<Studente> findByClasse(Classe classe);
}
