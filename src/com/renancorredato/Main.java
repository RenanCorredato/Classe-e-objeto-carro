package com.renancorredato;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro(4);
        carro.setModelo(Carro.HATCH);
        carro.setQuantidadePortas(2);
        carro.setCor(Carro.PRETO);



        carro.imprimeValores();
    }
}
