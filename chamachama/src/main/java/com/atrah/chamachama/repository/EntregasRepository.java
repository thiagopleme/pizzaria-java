package com.atrah.chamachama.repository;

import com.atrah.chamachama.model.Entregas;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntregasRepository extends MongoRepository<Entregas, String> {
    List<Entregas> findByCep(String cep);
}
