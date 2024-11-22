package com.atrah.chamachama.repository;

import com.atrah.chamachama.model.Funcionarios;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionariosRepository extends MongoRepository<Funcionarios, String> {
    List<Funcionarios> findByCpf(String cpf);
}
