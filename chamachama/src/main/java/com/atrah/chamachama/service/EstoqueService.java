package com.atrah.chamachama.service;

import com.atrah.chamachama.model.Estoque;
import com.atrah.chamachama.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public Estoque novoEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public List<Estoque> listarEstoque() {
        return estoqueRepository.findAll();
    }
}

