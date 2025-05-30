package com.riccardo.classe.services;

import com.riccardo.classe.model.Classe;
import com.riccardo.classe.model.Professore;
import com.riccardo.classe.model.Studente;
import com.riccardo.classe.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.Set;

@RestController
@RequestMapping("/api/classe")
public class ClasseController {
    @Autowired
    private ClasseService classeService;

    @GetMapping("/{classeId}/studenti")
    public Set<Studente> getStudentiByClasse(@PathVariable Long classeId){
        return classeService.getStudentiByClasseId(classeId);
    }

    @GetMapping("/professore/{id}")
    public Set<Classe> getClasseByProfessore(@PathVariable Long id){
        return classeService.getClassiByProfessoreId(id);
    }
}
