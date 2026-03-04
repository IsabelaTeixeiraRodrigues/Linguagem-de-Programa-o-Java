package  com.sptech.school;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

    Scanner Scanner = new Scanner(System.in);

    System.out.println("Digite a distancia percorrida em km:");
    double distancia_percorrida = Scanner.nextDouble();
        System.out.println("Digite a quantidade consumida em Litros :");
    double quantidade_consumida = Scanner.nextDouble();

    double calculo = distancia_percorrida/quantidade_consumida;

    System.out.println("Seu gasto médio é: " + calculo);
    }
}
