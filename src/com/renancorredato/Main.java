package com.renancorredato;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro(4 , 4, 2, 100);
        carro.setModelo(Carro.HATCH);
        carro.setCor(Carro.VERMELHO);
        carro.setAr(Carro.ARCONDICIONADO);
        carro.setRadio(Carro.NAORADIO);





        carro.imprimeValores();
    }
}
