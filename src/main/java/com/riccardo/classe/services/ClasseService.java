package com.riccardo.classe.services;

import lombok.NonNull;

import com.riccardo.classe.repository.ClasseRepository;
import com.riccardo.classe.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ClasseService{
    @Autowired
    private ClasseRepository classeRepo;

    public Set<Studente> getStudentiByClasseId(@NonNull Long classeId){

            return classeRepo.findAllByClasseId(classeId);

    }

    public Set<Classe> getClassiByProfessoreId(@NonNull Long professoreId) {

        return classeRepo.findByProfessoreId(professoreId);
    }
}