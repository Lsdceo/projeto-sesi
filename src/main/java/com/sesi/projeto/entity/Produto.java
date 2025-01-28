package com.sesi.projeto.entity;

import com.sesi.projeto.dto.ProdutoDto;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String NOME;
    private double preço;
    private String descricao;

    public Produto(ProdutoDto d){
        this.NOME = d.NOME();
        this.preço = d.preço();
        this.descricao = d.descricao();

    }

    public Produto(long id, String NOME, double preço, String descricao) {
        this.id = id;
        this.NOME = NOME;
        this.preço = preço;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
