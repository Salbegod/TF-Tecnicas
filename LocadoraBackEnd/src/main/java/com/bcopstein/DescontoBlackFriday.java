package com.bcopstein;

public class DescontoBlackFriday implements Desconto {
    @Override
    public double calcular() {
        return 50;
    }
}
