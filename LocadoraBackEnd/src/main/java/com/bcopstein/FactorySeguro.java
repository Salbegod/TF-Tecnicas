package com.bcopstein;

public class FactorySeguro {

        private Produto produto;

    public FactorySeguro(Produto produto){
        this.produto = produto;
    }

    
    public Seguro getSeguro(){

        if (produto.getSeguro().toUpperCase().equals("PREMIUM")){
            return new SeguroPremium();
        }
        return new SeguroBase();

    }
    
}
