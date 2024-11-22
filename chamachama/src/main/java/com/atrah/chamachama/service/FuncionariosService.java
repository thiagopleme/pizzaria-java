package com.atrah.chamachama.service;

import com.atrah.chamachama.model.Funcionarios;
import com.atrah.chamachama.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    public Funcionarios novoFuncionarios(Funcionarios funcionarios) {
        return funcionariosRepository.save(funcionarios);
    }

    public List<Funcionarios> listarFuncionarios() {
        return funcionariosRepository.findAll();
    }
}
