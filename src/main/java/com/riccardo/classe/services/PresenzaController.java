package com.riccardo.classe.services;

import com.riccardo.classe.model.Presenza;
import org.atmosphere.config.service.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/presenze")
public class PresenzaController{
    @Autowired
    private PresenzaService presenzaService;

    @PostMapping("/registraAssenza")
    public ResponseEntity<?> registraAssenza(@RequestParam Long studenteId, @RequestParam("data") @DateTimeFormat(pattern = "yyyy- MM- dd") LocalDate data){

        try{
            presenzaService.registraAssenza(studenteId, data);
            return ResponseEntity.ok().build();

        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }


    }

    @GetMapping("/assenze/{studenteId}")
    public List<Presenza> getAssenze(@PathVariable Long studenteId){
        return presenzaService.findByStudenteId(studenteId);
    }

}
