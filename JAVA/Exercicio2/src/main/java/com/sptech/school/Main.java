package com.sptech.school;

public class Main {
    public static void main(String[] args){


        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + "x" + j + "=" + resultado);
            }
        }
    }
}
