package com.riccardo.classe.services;

import com.riccardo.classe.model.Studente;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.riccardo.classe.model.Studente;
import com.riccardo.classe.repository.*;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class StudenteControl extends CrudRepositoryService<Studente, Long, StudenteRepository> {
}