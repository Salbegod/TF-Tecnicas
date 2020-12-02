

package com.bcopstein;

public class FactoryDesconto {

    private Produto produto;

    public FactoryDesconto(Produto produto){
        this.produto = produto;
    }

    
    public Desconto getDesconto(){

        if (produto.getDesconto().toUpperCase().equals("BLACKFRIDAY")){
            return new DescontoBlackFriday();
        }
        else if (produto.getDesconto().toUpperCase().equals("NATAL")) {
            return new DescontoNatal();
        }
        return new DescontoPadrao();

    }
}
