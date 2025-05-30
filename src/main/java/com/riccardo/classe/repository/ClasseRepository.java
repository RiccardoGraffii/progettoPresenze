package com.riccardo.classe.repository;

import com.riccardo.classe.model.Classe;
import com.riccardo.classe.model.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import com.riccardo.classe.model.Professore;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

import java.util.List;


public interface ClasseRepository extends JpaRepository<Classe, Long>, JpaSpecificationExecutor<Classe> {

    Set<Studente> findAllByClasseId(Long classeId);

    @Query("SELECT c FROM Classe c WHERE c.professore.id == :professoereId")
    Set<Classe> findByProfessoreId(@Param("professoereId") Long professoreId);


}

