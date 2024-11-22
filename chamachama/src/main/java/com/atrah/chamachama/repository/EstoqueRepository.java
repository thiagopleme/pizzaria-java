package com.atrah.chamachama.repository;

import com.atrah.chamachama.model.Estoque;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstoqueRepository extends MongoRepository<Estoque, String> {
    List<Estoque> findByIngrediente(String ingrediente);
}

