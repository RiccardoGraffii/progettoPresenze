package com.riccardo.classe.repository;


import com.riccardo.classe.model.Professore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProfessoreRepository extends JpaRepository<Professore, Long>, JpaSpecificationExecutor<Professore> {
    Professore findByUsername(String username);
}
