package com.atrah.chamachama.controller;

import com.atrah.chamachama.model.Estoque;
import com.atrah.chamachama.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @PostMapping
    public Estoque novoEstoque(@RequestBody Estoque estoque) {
        return estoqueService.novoEstoque(estoque);
    }

    @GetMapping
    public List<Estoque> listarEstoque() {
        return estoqueService.listarEstoque();
    }
}
