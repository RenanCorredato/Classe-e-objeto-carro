package com.renancorredato;

public class Carro {

    private static  Integer retrovisor = 3;

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";
    public static final String SEDAN = "sendan 5 portas";
    public static final String HATCH = "hatch 3 portas" ;
    public static final String ARCONDICIONADO = ",sim" ;
    public static final String NAOARCONDICIONADO = ",não" ;
    public static final String SRADIO = ",sim" ;
    public static final String NAORADIO = ",não" ;


    private Integer numeroChassi;
    private Integer quantidadePeneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer quantidadePinosPenus;

    private String  modelo;
    private String ar;
    private String cor;
    private String radio;



    public Carro(Integer quantidadePneus, Integer quantidadeCalotas,Integer retrovisor, Integer numeroChassi){
        setQuantidadePenus(quantidadePneus);
        setNumeroChassi(numeroChassi);




    }


    public Integer getQuantidadePneus(){
        return quantidadePeneus + 1;
    }

    public void setQuantidadePenus(Integer quantidadePeneus){
        setQuantidadeCalotas(quantidadePeneus);
        quantidadeParafusosPneus = quantidadePeneus * 4;
        quantidadePinosPenus = quantidadePeneus + 1;
        this.quantidadePeneus = quantidadePeneus;
    }

    public static Integer quantidadeRetrovisor(){

        return retrovisor;
    }

    public Integer getNumeroChassi() {
        return numeroChassi * 235;
    }

    public void setNumeroChassi(Integer numeroChassi) {
        this.numeroChassi = numeroChassi;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public static String getVERMELHO() {
        return VERMELHO;
    }

    public Integer getQuantidadePinosPenus() {
        return quantidadePinosPenus + 1;
    }

    public void setQuantidadePinosPenus(Integer quantidadePinosPenus) {
        this.quantidadePinosPenus = quantidadePinosPenus;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas + 1;
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
        System.out.println("Quantidade pinos " + quantidadePinosPenus);
        System.out.println("Quantidade de calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos " + getQuantidadeParafusosPneus());
        System.out.println("Numero do chassi " + getNumeroChassi());
        System.out.println("Cor " + getCor());
        System.out.println("Contém radio " + getRadio());
        System.out.println("Modelo " +getModelo());
        System.out.println("Arcondicionado " +getAr());
        System.out.println("Quantidade de retrovisor " +quantidadeRetrovisor());

    }
}
