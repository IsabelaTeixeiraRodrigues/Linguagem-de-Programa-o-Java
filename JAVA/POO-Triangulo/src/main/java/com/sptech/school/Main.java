package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        Triangulo tri = new Triangulo();

        tri.altura = 3;
        tri.base = 4;

        Triangulo tri2 = new Triangulo(5, 8);

        System.out.println(tri2.altura);

        float resultado = tri.calculaArea();
        System.out.println(resultado);

        System.out.println(tri.imprimirDados());
    }
}

