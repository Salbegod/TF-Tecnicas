package com.bcopstein;

public class Locadora {
    
    private Produto produto;
    private Cliente cliente;

    public Locadora(Produto produto, Cliente cliente){
        this.produto = produto;
        this.cliente = cliente;
    }

    public double getTotalDiarias(){
        if (produto.getChave().equals(cliente.getProduto().getChave())){
            
            return produto.totalcustoDiario()*cliente.getDiasLocacao();
        } 
        
        return 0;
    }

}
