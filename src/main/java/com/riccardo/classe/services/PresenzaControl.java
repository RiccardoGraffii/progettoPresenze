package com.riccardo.classe.services;


import com.riccardo.classe.model.Classe;
import com.riccardo.classe.model.Presenza;
import com.riccardo.classe.model.Studente;
import com.riccardo.classe.repository.PresenzaRepository;
import com.riccardo.classe.repository.StudenteRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import jakarta.transaction.Transactional;

import java.time.LocalDate;
import java.util.List;


@BrowserCallable
@AnonymousAllowed
public class PresenzaControl extends CrudRepositoryService<Presenza, Long, PresenzaRepository> {

    private final PresenzaRepository presenzaRepository;
    private final StudenteRepository studenteRepository;

    public PresenzaControl(PresenzaRepository presenzaRepository, StudenteRepository studenteRepository) {
        super(presenzaRepository);
        this.presenzaRepository = presenzaRepository;
        this.studenteRepository = studenteRepository;
    }

    public List<Presenza> getPresenzeByClasseAndDate(Long classeId, LocalDate data) {
        Classe classe = new Classe();
        classe.setId(classeId);
        return presenzaRepository.findByStudenteClasseAndData(classe, data);
    }

    @Transactional
    public void savePresenzeForDate(LocalDate data, List<Presenza> presenze) {
        presenzaRepository.saveAll(presenze);
    }

    public List<Studente> getStudentiByClasse(Long classeId) {
        Classe classe = new Classe();
        classe.setId(classeId);
        return studenteRepository.findByClasse(classe);
    }
}
