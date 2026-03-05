package com.sptech.school;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite o nome do seu cofrinho: ");
        String dono = Scanner.nextLine();

        Cofrinho cofre = new Cofrinho(dono);

        menu(cofre);
    }

    public static void menu(Cofrinho cofre){
        System.out.println("""
                Digite o que deseja fazer:
                
                1- Depositar
                2- Sacar dinheiro
                3- Quebrar cofrinho (monstro!!)
                4- Sacudir cofrinho
                """);

        int resposta = Scanner.nextInt();

        if (resposta == 1){
            System.out.println("Qual valor gostaria de depositar?");
            double valor = Scanner.nextDouble();
            Cofrinho.depositar(cofre, valor);
            menu(cofre);
        } else if (resposta == 2) {
            System.out.println("Qual valor gostaria de sacar?");
            double valor = Scanner.nextDouble();
            Cofrinho.sacar(cofre, valor);
            menu(cofre);
        } else if (resposta == 3) {
            Cofrinho.quebrar(cofre);
            menu(cofre);
        } else if (resposta == 4) {
            Cofrinho.sacudir(cofre);
            menu(cofre);
        }else {
            System.out.println("Essa opção não existe");
            menu(cofre);
        }
    }
}
