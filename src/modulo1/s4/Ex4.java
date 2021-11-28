package modulo1.s4;

import java.util.Scanner;

public class Ex4 {

    /*Crie um programa em Java que, utilizando a classe Scanner,
    peça ao usuário para inserir um número inteiro.
    O programa deve verificar se o número é par ou ímpar,
    e exibir essa informação de volta ao usuário.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = Integer.parseInt(sc.nextLine());

        String resultado = numero % 2 == 0? "par" : "ímpar";
        System.out.printf("O número %d é %s!", numero, resultado);
    }
}
