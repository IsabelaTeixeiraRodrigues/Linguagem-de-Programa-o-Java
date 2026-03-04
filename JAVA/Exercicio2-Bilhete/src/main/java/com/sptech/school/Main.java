package com.sptech.school;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        BilheteUnico bilhete = new BilheteUnico();

        System.out.println("Digite seu saldo atual");
        double saldo = Scanner.nextDouble();

        int guardar_resposta = 0;

        while (true){
            int resposta = menu();
            if (resposta == 1){
                System.out.println("Quanto gostaria de recarregar?");
                double recarga = Scanner.nextDouble();
                saldo = bilhete.recarregar(recarga, saldo);
            } else if (resposta == 2) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (resposta == 3) {
                saldo = bilhete.passagemComumOnibus(saldo);
                System.out.println("Seu pagamento de R$5,00 foi concluido");
                guardar_resposta = 3;
            }else if (resposta == 4) {
                saldo = bilhete.passagemComumMetroTrem(saldo);
                System.out.println("Seu pagamento de R$5,20 foi concluido");
                guardar_resposta = 4;
            } else if (resposta == 5) {
                saldo = bilhete.passagemIntegracao(resposta, saldo, guardar_resposta);
                System.out.println("Seu pagamento de integração foi concluido");
            }

        }
        }

    public static int menu(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("""
                Bem vindo(a) ao menu:
                
                1- Recarga
                2- Verificar saldo
                3- Comprar passagem onibus (a vulsa)
                4- comprar passagem metro (a vulsa)
                5- comprar integração 
                """);

        return Scanner.nextInt();
    }
}
