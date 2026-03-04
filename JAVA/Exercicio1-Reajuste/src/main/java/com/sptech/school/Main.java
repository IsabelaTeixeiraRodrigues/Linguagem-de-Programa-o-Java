package com.sptech.school;

public class Main {

    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        System.out.println("Salario reajustado: "+ empregado.reajustarSalario());
        System.out.println("Dados: "+ empregado.imprimirDados());
        System.out.println("Pretenção salarial de 5 anos: "+ empregado.PretencaoSalarial());

        Empregado empregado1 = new Empregado();

        empregado1.Nome = "Isabela";
        empregado1.Cargo = "QA";
        empregado1.Salario = 10.350F;
        empregado1.Reajuste = 10;

        System.out.println("Salario reajustado: "+ empregado1.reajustarSalario());
        System.out.println("Dados: "+ empregado1.imprimirDados());
        System.out.println("Pretenção salarial de 5 anos: "+ empregado1.PretencaoSalarial());


    }
}
