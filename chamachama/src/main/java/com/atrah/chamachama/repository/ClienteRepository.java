package com.atrah.chamachama.repository;

import com.atrah.chamachama.model.Cliente;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    List<Cliente> findByTelefone(String telefone);
}
