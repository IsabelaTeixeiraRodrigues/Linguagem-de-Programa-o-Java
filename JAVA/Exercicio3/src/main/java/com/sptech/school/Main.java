package com.sptech.school;

public class Main {
    public static void main(String[] args){
        String nome1 = "João";
        String nome2 = "Amelia";
        String nome3 = "Camilo";
        String nome4 = "Beltrao";
        String nome5 = "Adolberto";
        String nome6 = "Maria";
        String nome7 = "Cecilia";
        String nome8 = "Priscila";
        String nome9 = "Julia";
        String nome10 = "Nogueira";
        String nome11 = "Felicia";
        String nome12 = "Geraldo";
        String nome13 = "Wanderley";
        String nome14 = "Jarci";
        String nome15 = "otto";

        double compras = (math.random() * 100);

        if(compras <= 1000){
            double porcentagem = compras/10;
            compras = compras - porcentagem;
        }else{
            double porcentagem = compras/15;
            compras = compras - porcentagem;
        }

        System.out.println("");


    }
}
