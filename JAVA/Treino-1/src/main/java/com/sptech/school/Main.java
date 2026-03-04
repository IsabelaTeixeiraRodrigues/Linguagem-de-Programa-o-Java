package com.sptech.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: \n");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: \n");
        double numero2 = scanner.nextDouble();

        System.out.println("""
        Qual operação deseja realizar?
        1 - Soma
        2 - Divisão
        3 - Subtração
        4 - Multiplicação
        """);

        int resposta = scanner.nextInt();

        if (resposta == 1){
            System.out.println(soma(numero1, numero2));
        } else if (resposta == 2) {
            System.out.println(Divisao(numero1, numero2));
        }else if (resposta == 3) {
            System.out.println(Subtracao(numero1, numero2));
        }else {
            System.out.println(Multiplicacao(numero1, numero2));
        }
    }

    public static double soma (double numero1, double numero2){

        return numero1 + numero2;
    }

    public static double Divisao (double numero1, double numero2){

        return numero1 / numero2;
    }

    public static double Subtracao (double numero1, double numero2){

        return numero1 - numero2;
    }

    public static double Multiplicacao (double numero1, double numero2){

        return numero1 * numero2;
    }
}
