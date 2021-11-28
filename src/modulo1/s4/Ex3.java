package modulo1.s4;

import java.util.Scanner;

public class Ex3 {

    /*Crie um programa em Java que, utilizando a classe Scanner,
    peça ao usuário que digite sua altura (2 ou mais casas depois da vírgula),
    depois peça que o usuário digite sua altura,
    e então calcule o IMC e exiba essa informação ao usuário.
    Fórmula IMC = peso / (altura x altura).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());

        double imc = peso / (altura * altura);

        System.out.printf("Com %.2fm de altura e um peso de %.2fkg, o seu IMC é de: %.2f", altura, peso, imc);
    }
}
