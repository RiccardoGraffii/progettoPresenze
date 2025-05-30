package com.riccardo.classe.services;

import java.time.LocalDate;
import java.util.List;

import com.riccardo.classe.model.Presenza;
import com.riccardo.classe.model.Studente;
import com.riccardo.classe.repository.PresenzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class PresenzaService {
    @Autowired
    private PresenzaRepository repo;

    public void registraAssenza(@NonNull Long studenteId, @NonNull LocalDate data){
        if(repo.existsByStudenteIdAndData(studenteId, data)){

            throw new IllegalArgumentException("Presenza gia registrata per questa data");
        }

        Presenza p = new Presenza();
        p.setData(data);
        p.setStatus(Presenza.Status.ASSENTE);
        p.setStudente(new Studente());
        p.getStudente().setId(studenteId);

        repo.save(p);
    }

}
