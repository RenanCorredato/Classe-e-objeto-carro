package com.renancorredato;

public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";
    public static final String SEDAN = "sendan";
    public static final String HATCH = "hatch";

    private Integer quantidadePeneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer quantidadePortas;
    private String  modelo;
    private String cor;



    public Carro(Integer quantidadePneus){
        setQuantidadePenus(quantidadePneus);
        setQuantidadePortas(quantidadePortas);

    }


    public Integer getQuantidadePneus(){
        return quantidadePeneus + 1;
    }

    public void setQuantidadePenus(Integer quantidadePeneus){
        setQuantidadeCalotas(quantidadePeneus);
        quantidadeParafusosPneus = quantidadePeneus * 4;
        this.quantidadePeneus = quantidadePeneus;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas + 1;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {

        this.quantidadePortas = quantidadePortas;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public static String getVERMELHO() {
        return VERMELHO;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusosPneus() {
        return quantidadeParafusosPneus;
    }

    public void setQuantidadeParafusosPneus(Integer quantidadeParafusosPneus) {
        this.quantidadeParafusosPneus = quantidadeParafusosPneus;
    }

    public void imprimeValores(){
        System.out.println("Quantidade pneus " + getQuantidadePneus());
        System.out.println("Quantidade de calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos " + getQuantidadeParafusosPneus());
        System.out.println("Cor " + getCor());

        System.out.println("Modelo " +getModelo());
        System.out.println("Quantidade de portas " +getQuantidadePortas());


    }
}
