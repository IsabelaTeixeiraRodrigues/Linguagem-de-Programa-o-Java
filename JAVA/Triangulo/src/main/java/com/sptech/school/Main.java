package com.sptech.school;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a area de um triangulo\n");
        System.out.println("Me informe a base dele: ");

        int base = Scanner.nextInt();

        System.out.println("Me informe a altura dele: ");

        int altura = Scanner.nextInt();

        int calculo = (base*altura)/2;

        System.out.println("A sua area é de :" + calculo);

    }
}
