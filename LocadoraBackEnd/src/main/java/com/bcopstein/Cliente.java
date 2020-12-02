package com.bcopstein;

public class Cliente {

    private String nome;
    private String cpf;
    private String contato;
    private int diasLocacao;
    private Produto produto;

    public Cliente(String nome, String cpf, String contato, int diasLocacao, Produto produto){

        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.diasLocacao = diasLocacao;
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }
   
    public String getContato() {
        return contato;
    }
   
    public int getDiasLocacao() {
        return diasLocacao;
    }

    public Produto getProduto() {
        return produto;
    }
   
   
   
   
}
