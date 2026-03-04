package com.sptech.school;

public class Triangulo {
    float base;
    float altura;

    public Triangulo(){

    }

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    float calculaArea(){
        return (base*altura)/2;
    }

    public String imprimirDados(){
        return "altura\n" + altura + "base\n" + base;
    }
}
