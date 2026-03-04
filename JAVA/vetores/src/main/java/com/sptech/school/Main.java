package com.sptech.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        vetores_com_soma();
    }

    public static void vetores_com_soma(){

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite o 1 numero");
        int n1 = Scanner.nextInt();
        System.out.println("Digite o 2 numero");
        int n2 = Scanner.nextInt();
        System.out.println("Digite o 3 numero");
        int n3 = Scanner.nextInt();
        System.out.println("Digite o 4 numero");
        int n4 = Scanner.nextInt(); /*Fazer for para colocar as inputs dentro do vetor*/

        int[]vetorA;
        vetorA = new int[4];

        vetorA[0] = n1;
        vetorA[1] = n2;
        vetorA[2] = n3;
        vetorA[3] = n4;

        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i]%2 == 1){
                soma += vetorA[i];
            }

        }
        System.out.println(soma);
    }
}
