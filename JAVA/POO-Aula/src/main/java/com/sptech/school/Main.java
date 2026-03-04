package com.sptech.school;


public class Main {
    public static void main(String[] args) {
    Carro carro1 = new Carro();
        carro1.ano = 2021;
        carro1.marca = "Renault";
        System.out.println(carro1.marca + carro1.ano + carro1.modelo);
    Carro carro2 = new Carro();
        carro2.ano = 2022;
        carro2.modelo = "Uno";
        carro2.marca = "Fiat";
    }
}
