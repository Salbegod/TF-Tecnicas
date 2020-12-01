package com.bcopstein;

public class CustoLocacao {
    
    private Produto produto;
    private double custoDiario;
    
    public CustoLocacao(Produto produto, double custoDiario){
        this.produto = produto;
        this.custoDiario = custoDiario;
    }

    public double custoTotal(){

        //chama FactoryDesconto

        //chama FactorySeguro

        //soma custoDiario ao custo do seguro e aplica desconto
        return 0;

    }
}
