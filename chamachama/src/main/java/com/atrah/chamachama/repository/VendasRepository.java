package com.atrah.chamachama.repository;

import com.atrah.chamachama.model.Vendas;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendasRepository extends MongoRepository<Vendas, String> {
    List<Vendas> findByVendasId(String vendasId);
}
