package modulo1.s4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

    /*
    * Crie um programa em Java que, utilizando a classe Scanner,
    *  peça ao usuário para inserir as notas do semestre, e deve retornar a média final.
    *  O programa deve pedir 3 notas, que devem ser números reais,
    *  e retornar um número real com 2 casas depois da vírgula,
    *  com o texto “Sua média final é:” seguido do valor.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 notas para calcular a média final.");

        System.out.print("Nota 1: ");
        double nota1 = Double.parseDouble(sc.nextLine());

        System.out.print("Nota 2: ");
        double nota2 = Double.parseDouble(sc.nextLine());

        System.out.print("Nota 3: ");
        double nota3 = Double.parseDouble(sc.nextLine());

        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média final é: %.2f", mediaFinal);
    }
}
