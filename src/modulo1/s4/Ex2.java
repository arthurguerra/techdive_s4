package modulo1.s4;

import java.util.Scanner;

public class Ex2 {

    /*Crie um programa em Java que, utilizando a classe Scanner,
    pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela,
    em uma única “string”, o nome completo do usuário.
    Informe também ao usuário quantas letras tem no nome dele.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("%s %s, seu nome possui %d letras.", nome, sobrenome, nome.length());
    }
}
