package com.fatec.produto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private String categaria;

    private double custo;
    private int quantidadeNoEstoque;
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao==null || descricao.isBlank()){
            throw new IllegalArgumentException("A descrição não deve ser nula");
        } else {
        this.descricao = descricao;
    }
    }
    public String getCategaria() {
        return categaria;
    }

    public void setCategaria(String categoria) {
        if(categoria==null || categoria.isBlank()){
            throw new IllegalArgumentException("A categoria não deve ser nula");
        } else {
            this.categaria = categoria;
    }}

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        try{
            if(custo<=0){
                throw new IllegalArgumentException("O custo deve ser maior que zero");
            }else{
                this.custo = custo;
            }
        }catch(Exception e){
            throw new IllegalArgumentException("O custo deve ser maior que zero");
        }

    }

    public int getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        try{
            if(quantidadeNoEstoque<=0){
                throw new IllegalArgumentException("A quantidade no estoque deve ser maior que zero");
            }else{
                this.quantidadeNoEstoque = quantidadeNoEstoque;
            }
        }catch(Exception e){
            throw new IllegalArgumentException("A quantidade no estoque deve ser maior que zero");
        }
    }

    public Produto(String descricao, String categaria, double custo, int quantidadeNoEstoque) {
        this.descricao = descricao;
        this.categaria = categaria;
        this.custo = custo;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public  Produto(){
    }
}
