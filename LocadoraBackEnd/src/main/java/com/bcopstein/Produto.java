package com.bcopstein;

public class Produto {
    
    private String chave;
    private String tipoSeguro;
    private String tipoDesconto;
    private double custoDiario;

    public Produto(String chave, String tipoSeguro, String tipoDesconto, double custoDiario){
        this.chave = chave;
        this.tipoSeguro = tipoSeguro;
        this.tipoDesconto = tipoDesconto;
        this.custoDiario = custoDiario;
    }

    public String getChave(){
        return chave;
    }

    public String getSeguro(){
        return tipoSeguro;
    }

    public String getDesconto(){
        return tipoDesconto;
    }
    
    public double custoTotal(){
        CustoLocacao aux = new CustoLocacao(this, custoDiario);
        return aux.custoTotal();
    }
}
