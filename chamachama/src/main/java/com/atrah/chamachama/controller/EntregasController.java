package com.atrah.chamachama.controller;

import com.atrah.chamachama.model.Entregas;
import com.atrah.chamachama.service.EntregasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/entregas")
public class EntregasController {

    @Autowired
    private EntregasService entregasService;

    @PostMapping
    public Entregas novoEntregas(@RequestBody Entregas entregas) {
        return entregasService.novoEntregas(entregas);
    }

    @GetMapping
    public List<Entregas> listarEntregas() {
        return entregasService.listarEntregas();
    }
}
