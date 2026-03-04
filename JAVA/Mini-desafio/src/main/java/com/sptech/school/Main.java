package com.sptech.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Scanner = new Scanner(System.in);

        int soma = 0;
        int[] vetorA = new int[10];

        menu();

        if (Scanner.nextInt() == 1){
            alimentarVetor(vetorA);
            menu();
        } else if (Scanner.nextInt() == 2) {
            pares(vetorA);
            menu();
        } else if (Scanner.nextInt() == 3) {
            impares(vetorA);
            menu();
        } else if (Scanner.nextInt() == 4) {
            somaTotal(vetorA, soma);
            menu();
        } else {
            Somapares(vetorA, soma);
            menu();
        }


    }

    public static int menu(){

        Scanner Scanner = new Scanner(System.in);

        System.out.println("""
                Bem vindo ao menu! Digite a opção que deseja:
                1- Alimentar vetor
                2- exiba somente os pares do vetor.
                3- exiba somente os ímpares do vetor.
                4- exiba a soma de todos os números do vetor.
                5-  exiba a soma de todos os números pares do vetor.
                """);

        return Scanner.nextInt();
    }

    public static void alimentarVetor(int[]vetorA){

        Scanner Scanner = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o numero " + i);
            int num = Scanner.nextInt();

            vetorA[i] = num;
        }
    }

    public static void pares(int[]vetorA){
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2==0){
                System.out.println(vetorA[i]);
            }else {
                System.out.println();
            }
        }
    }

    public static void impares(int[]vetorA){
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2!=0){
                System.out.println(vetorA[i]);
            } else {
                System.out.println();
            }
        }

    }

    public static void somaTotal(int[]vetorA, int soma){
        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
        }

    }

    public static void Somapares(int[]vetorA, int soma){
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2==0){
                soma += vetorA[i];
            }
        }

    }

}
