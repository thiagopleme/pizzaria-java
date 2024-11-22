package com.atrah.chamachama.repository;

import com.atrah.chamachama.model.Produtos;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutosRepository extends MongoRepository<Produtos, String> {
    List<Produtos> findByProduto(String produto);
}

