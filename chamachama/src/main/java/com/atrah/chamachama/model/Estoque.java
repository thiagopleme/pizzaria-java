package com.atrah.chamachama.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estoque")

public class Estoque {
 
    @Id
    private String id;
    private String estoqueId;
    private String ingrediente;
    private String statusEstoque;
    private Integer qtd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(String estoqueId) {
        this.estoqueId = estoqueId;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getStatusEstoque() {
        return statusEstoque;
    }

    public void setStatusEstoque(String statusEstoque) {
        this.statusEstoque = statusEstoque;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

}
    


