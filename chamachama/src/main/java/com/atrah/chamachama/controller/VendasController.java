package com.atrah.chamachama.controller;

import com.atrah.chamachama.model.Vendas;
import com.atrah.chamachama.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vendas")
public class VendasController {

    @Autowired
    private VendasService vendasService;

    @PostMapping
    public Vendas novoVendas(@RequestBody Vendas vendas) {
        return vendasService.novoVendas(vendas);
    }

    @GetMapping
    public List<Vendas> listarVendas() {
        return vendasService.listarVendas();
    }
}
