package com.sptech.school;

public class Cofrinho{
    String dono;
    double saldo;
    boolean cofrinho_quebrado;


    public Cofrinho(String dono){
        cofrinho_quebrado = false;
        saldo = 0.0;
        this.dono = getDono(dono);
    }

    public static void depositar(Cofrinho cofre, double valor){
        if (cofre.cofrinho_quebrado){
            System.out.println("Não pode depositar num cofrinho quebrado");
        }else {
            cofre.saldo += valor;
        }
    }

    public static double sacar(Cofrinho cofre, double valor){
            if (cofre.saldo > valor){
                System.out.println("A quantidade digitada é maior que seu saldo atual");
            } else if (cofre.cofrinho_quebrado) {
                System.out.println("Não pode sacar de um cofrinho quebrado");
                System.out.println("Agora voçê tem R$ " + cofre.saldo);
            }
        return cofre.saldo -= valor;
    }

    public static boolean quebrar(Cofrinho cofre){
        if (cofre.cofrinho_quebrado){
            System.out.println("Esse cofrinho já foi quebrado");
        } else {
            System.out.println("Seu cofrinho foi quebrado");
            return cofre.cofrinho_quebrado ==  true;
        }
        return false;
    }

    public static double sacudir(Cofrinho cofre){
        double numero_aleatorio = Math.random() * (cofre.saldo + 1);
        if (cofre.cofrinho_quebrado){
            System.out.println("Não pode sacudir o cofrinho quebrado");
        } else {
            System.out.println("Você tirou R$" + numero_aleatorio + " do cofrinho");
            cofre.saldo -= numero_aleatorio;
        }
        return 0;
    }

    public String getDono(String dono){

        return setDono(dono);
    }

    public String setDono(String dono){
        this.dono =  dono;
        return dono;
    }

    public static double getSaldo(Cofrinho cofre){
        double saldo_atual = cofre.saldo;
        return saldo_atual;
    }

    public static boolean getQuebrado(Cofrinho cofre){
        if (cofre.cofrinho_quebrado){
            return true;
        }
        return false;
    }
}
