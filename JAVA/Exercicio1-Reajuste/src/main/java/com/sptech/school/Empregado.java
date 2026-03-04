package com.sptech.school;

public class Empregado {
    String Nome;
    String Cargo;
    float Salario;
    float Reajuste;

    float reajustarSalario(){
        float decimal = (Salario * (Reajuste/100));

        return Salario + decimal;
    }

    public Empregado(){
        Nome = "João";
        Cargo = "Analista de Sistemas";
        Salario = 5.350F;
        Reajuste = 15;
    }

    float PretencaoSalarial(){
        float decimal = (Salario * ((float) 50 /100));
        return Salario + decimal;
    }



    public String imprimirDados(){
        return "\nNome:" + Nome + "\nCargo:" + Cargo + "\nSalario:" + Salario + "\nReajuste:" + Reajuste + "%";
    }
}
