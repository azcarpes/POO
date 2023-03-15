package com.aulasdepoo.aula6;

public class ObjetoCarro {

    public static void main(String[] args) {
        Carro carroUno = new Carro("Fiat", "Uno", 2000, 10.0);
        carroUno.buzinar();
        System.out.println(carroUno.ligar(false));

        System.out.println(carroUno.getAno());
        carroUno.setAno(2010);
        System.out.println(carroUno.getAno());

    }
}
