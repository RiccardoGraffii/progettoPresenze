package com.riccardo.classe.services;

import com.riccardo.classe.model.Professore;
import com.riccardo.classe.repository.ProfessoreRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class ProfessoreControl   extends CrudRepositoryService<Professore, Long, ProfessoreRepository> {


}