package com.atrah.chamachama.controller;

import com.atrah.chamachama.model.Produtos;
import com.atrah.chamachama.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @PostMapping
    public Produtos novoProdutos(@RequestBody Produtos produtos) {
        return produtosService.novoProdutos(produtos);
    }

    @GetMapping
    public List<Produtos> listarProdutos() {
        return produtosService.listarProdutos();
    }
}
