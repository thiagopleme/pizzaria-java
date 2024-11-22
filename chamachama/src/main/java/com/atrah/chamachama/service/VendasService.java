package com.atrah.chamachama.service;

import com.atrah.chamachama.model.Vendas;
import com.atrah.chamachama.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VendasService {

    @Autowired
    private VendasRepository vendasRepository;

    public Vendas novoVendas(Vendas vendas) {
        return vendasRepository.save(vendas);
    }

    public List<Vendas> listarVendas() {
        return vendasRepository.findAll();
    }
}