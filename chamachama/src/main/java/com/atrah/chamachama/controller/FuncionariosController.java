package com.atrah.chamachama.controller;

import com.atrah.chamachama.model.Funcionarios;
import com.atrah.chamachama.service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionariosController {

    @Autowired
    private FuncionariosService funcionariosService;

    @PostMapping
    public Funcionarios novoFuncionarios(@RequestBody Funcionarios funcionarios) {
        return funcionariosService.novoFuncionarios(funcionarios);
    }

    @GetMapping
    public List<Funcionarios> listarFuncionarios() {
        return funcionariosService.listarFuncionarios();
    }
}