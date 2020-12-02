package com.bcopstein;

public class CustoLocacao {
    
    private Produto produto;
    private double custoDiario;
    
    public CustoLocacao(Produto produto, double custoDiario){
        this.produto = produto;
        this.custoDiario = custoDiario;
    }

    public double custoDiarioComDesconto(){

        FactoryDesconto carroDesconto = new FactoryDesconto(produto);
        FactorySeguro carroSeguro = new FactorySeguro(produto);

        return (custoDiario - (custoDiario*(carroDesconto.getDesconto().calcular())/100) + carroSeguro.getSeguro().calcular());

    }
}
