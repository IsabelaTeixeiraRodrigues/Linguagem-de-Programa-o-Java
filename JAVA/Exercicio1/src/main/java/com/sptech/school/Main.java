package com.sptech.school;

public class Main {
    public static void main(String[] args){

        int a = 1000;

        while (a < 2000){
            if (a % 11 == 5){
                System.out.println(a);
            }else{
                System.out.println();
            }
            a++;
        }
    }

}
