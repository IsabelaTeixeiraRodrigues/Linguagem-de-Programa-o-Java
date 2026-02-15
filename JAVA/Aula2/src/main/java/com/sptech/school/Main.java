 package com.sptech.school;

public class Main {

    public static void main(String[] args){
        // duas barras fazem um comentario :) (em uma unica linha)
        /*
        Comentario grandao é com barra e asterisco :)
         */
        System.out.println("Aula de java, olá mundo!");

        Calcular_imc();
        mensagem("Linguagem de programação");
        int resultado = somar(5, 5);
        System.out.println(resultado);
        int multiplicacao = multiplicar(7,4);
        System.out.println(multiplicacao);

        boolean resultado2 = PARouImpar(5);
        if (resultado2){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }


        // System = sistema, out = fora, print
        // metodo = função

        // Declaração de variaveis
        int idade = 30;
        double salario = 1500.50;
        String nome = "isa"; // Sempre com S maiusculo e aspas duplas
        boolean ativo = true;

        /*
        Tipo:
        Int, double, boolean = Tipos primitivos, variaveis que ja existiam antes e quando o java foi criado
        String = tipo por referencia
         */

        System.out.println("idade: " + idade);

        /*
        Estrutura de seleção

        Simples: if
        Composta: if, else
         */

        /*
        Estruturas de repetição
        while (valida primeiro dps executa),
        dowhile (primeiro executa o comando e dps valida, uso sempre que quero executar uma vez primeiro e dps validar),
        for (faz até o limite)
         */

       /*
       Função: public static void mensagem(){
       system.out.println(mensagem);
       }

       void = a função não possui return (retorno)
        */


    }

    public static void Calcular_imc(){
        String nome_imc = "fulano";
        double altura_imc = 1.70;
        double peso_imc = 67;

        double calculo_imc = peso_imc/(altura_imc * altura_imc); // math.pow(altura, 2)

        System.out.println("Seu IMC " + nome_imc + " é: " + calculo_imc);
    }

    public static void mensagem(String mensagem){

        System.out.println(mensagem);
    }

    public static int somar(int a, int b){
        return a + b;
    };

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static boolean PARouImpar(int a){

        boolean resultado2;

        if (a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
