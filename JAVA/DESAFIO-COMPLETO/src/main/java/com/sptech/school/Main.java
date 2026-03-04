package com.sptech.school;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[]vetorA = new int[10];
            menu(vetorA);

    }

    public static void menu(int[]vetorA){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("""
                BEM VINDO(A) AO MENU:
                
                1- ALIMENTAR VETOR
                2- DESCOBRIR QUAIS SÃO OS PARES
                3- DESCOBRIR QUAIS SÃO OS IMPARES
                4- SOMA DE TODOS OS NUMEROS
                5- SOMA DE TODOS OS PARES
                """);
        int resposta = Scanner.nextInt();

        if (resposta == 1){
            CriacaoVetor(vetorA);
            menu(vetorA);
        } else if (resposta == 2) {
            pares(vetorA);
            menu(vetorA);
        } else if (resposta == 3) {
            impares(vetorA);
            menu(vetorA);
        } else if (resposta == 4) {
            System.out.println("Soma total: " + soma(vetorA));
            menu(vetorA);
        } else if (resposta == 5) {
            System.out.println("Soma total: " + somaPares(vetorA));
            menu(vetorA);
        } else {
            System.out.println("Numero invalido");
            menu(vetorA);
        }
    }


    public static int[] CriacaoVetor(int[]vetorA){

        Scanner Scanner = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o numero " + i);
            int num = Scanner.nextInt();
            vetorA[i] = num;
        }

        return vetorA;
    }

    public static void pares(int[]vetorA){
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2==0){
                System.out.println(vetorA[i]);
            }
        }
    }

    public static void impares(int[]vetorA){
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2!=0){
                System.out.println(vetorA[i]);
            } else {
                System.out.println("");
            }
        }
    }

    public static int soma(int[]vetorA){
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
        }
        return soma;
    }

    public static int somaPares(int[]vetorA){
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2==0){
                soma += vetorA[i];
            }
        }
        return soma;
    }
}
