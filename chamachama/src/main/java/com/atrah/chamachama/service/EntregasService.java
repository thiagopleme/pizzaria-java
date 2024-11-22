package com.atrah.chamachama.service;

import com.atrah.chamachama.model.Entregas;
import com.atrah.chamachama.repository.EntregasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntregasService {

    @Autowired
    private EntregasRepository entregasRepository;

    public Entregas novoEntregas(Entregas entregas) {
        return entregasRepository.save(entregas);
    }

    public List<Entregas> listarEntregas() {
        return entregasRepository.findAll();
    }
}
