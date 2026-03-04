package com.sptech.school;

public class BilheteUnico {
    int cpf;
    double saldo;
    String titular;


    public double recarregar(double recarga,double saldo) {
        if (saldo > 250) {
            System.out.println("Seu saldo atual não pode ser maior que R$250");
        } else if (recarga <= 0) {
            System.out.println("Sua recarga não pode ser menor que R$1,00");
        }
        return saldo + recarga;
    }

    public double passagemComumOnibus(double saldo){
        return saldo - 5;
    }

    public double passagemComumMetroTrem(double saldo){
        return saldo - 5.20;
    }

    public double passagemIntegracao(int resposta, double saldo, int guardar_resposta){
        if (resposta == 5){
            if (guardar_resposta == 3){
                return saldo - 3.90;
            } else if (guardar_resposta == 4) {
                return saldo - 3.70;
            }
        }
        return saldo;
    }
}


