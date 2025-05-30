package com.riccardo.classe.repository;


import com.riccardo.classe.model.Presenza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface PresenzaRepository extends JpaRepository<Presenza, Long>, JpaSpecificationExecutor<Presenza> {
    boolean existsByStudenteIdAndData(Long studenteId, LocalDate data);

    @Query("SELECT p FROM Presenza p WHERE p.studente.id = :studenteId" )
    List<Presenza> findByStudenteId(@Param("studenteId") Long studente0);
}
