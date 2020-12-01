

package com.bcopstein;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class FactoryDesconto {

    private Produto produto;

    public FactoryDesconto(Produto produto){
        this.produto = produto;
    }

    
    
}
