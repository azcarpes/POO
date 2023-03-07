package com.aulasdepoo.aula6;

public class Carro {

    //atributos
    private String marca;
    private String modelo;
    private Integer ano; // pode ser int também
    private Double consumo; // pode ser float

    //construtor

    public Carro(String marca, String modelo, Integer ano, Double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.consumo = consumo;
    }

    //metodo com return e com parametro
    public Boolean ligar(Boolean temBateria){
        if(temBateria == true){
            return true;
        }else{
            return false;
        }
    }

    //metodo sem retorno
    public void buzinar(){
        System.out.println("O carro da marca " + this.marca + " está buzinando");
    }

    //get e set

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }
}
