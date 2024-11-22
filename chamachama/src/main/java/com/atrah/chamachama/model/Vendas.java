package com.atrah.chamachama.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vendas")

public class Vendas {
    
    @Id
    private String id;
    private String vendasId;
    private Integer qtdVendas;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendasId() {
        return vendasId;
    }

    public void setVendasId(String vendasId) {
        this.vendasId = vendasId;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer produto) {
        this.qtdVendas = qtdVendas;
    }
    
}
