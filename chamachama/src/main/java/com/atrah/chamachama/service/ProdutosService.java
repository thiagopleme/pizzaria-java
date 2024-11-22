package com.atrah.chamachama.service;

import com.atrah.chamachama.model.Produtos;
import com.atrah.chamachama.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public Produtos novoProdutos(Produtos produtos) {
        return produtosRepository.save(produtos);
    }

    public List<Produtos> listarProdutos() {
        return produtosRepository.findAll();
    }
}
