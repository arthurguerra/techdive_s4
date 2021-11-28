package modulo1.s4;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        /*Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora de P.A. e P.G.
        Peça para o usuário inserir um “valor inicial”, que deve ser um número inteiro.
        Em seguida, peça ao usuário para inserir um valor para a raiz.
        Depois, pergunte ao usuário se ele deseja calcular os 10 primeiros valores de uma P.A. ou de uma P.G.
        para os números inseridos anteriormente. Então, calcule os 10 primeiros valores de uma P.A. ou P.G.
        utilizando os números inseridos pelo usuário,
        e escreva essa sequência de valores na tela para o usuário visualizar o resultado.
        Relembrando: P.A. (Progressão Aritmética) é uma sequência numérica em que cada termo,
        a partir do segundo, é igual à soma do termo anterior com a raiz.
        Exemplo: Valor inicial = 1; raiz = 3; P.A. = 1, 4, 7, 10, 13, 16, 19, 22, 25, 28.
        P.G. (Progressão Geométrica) é como uma P.A., mas em vez de somar, multiplica-se a raiz.
        Exemplo: Valor inicial = 1; raiz = 3; P.G. = 1, 3, 9, 27, 81...*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        int inicial = Integer.parseInt(sc.nextLine());

        System.out.print("Valor da raiz: ");
        int raiz = Integer.parseInt(sc.nextLine());

        System.out.println("Gostaria de calular os dez primeiros valores de uma P.A. (Progressão Aritmética) ou de uma P.G. (Progressão Geométrica)?");
        String opcao;
        do {
            System.out.print("[PA] / [PG]: ");
            opcao = sc.nextLine();
        } while (!opcao.trim().toLowerCase().equals("pa") && !opcao.trim().toLowerCase().equals("pg"));

        opcao = opcao.trim().toLowerCase();

        if (opcao.equals("pa")) {

            System.out.printf("Valor inicial: %d%nValor da raiz: %d%nPA = ", inicial, raiz);

            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    System.out.print(inicial);
                } else {
                    System.out.printf(", %d", inicial);
                }
                inicial += raiz;
            }
        } else {

            System.out.printf("Valor inicial: %d%nValor da raiz: %d%nPG = ", inicial, raiz);

            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    System.out.print(inicial);
                } else {
                    System.out.printf(", %d", inicial);
                }
                inicial *= raiz;
            }
        }
    }
}
