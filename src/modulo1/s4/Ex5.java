package modulo1.s4;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {

    /*Crie um programa em Java que, utilizando a classe Scanner,
     pergunte ao usuário a seguinte frase: “Adivinhe qual número de 1 a 5 eu estou pensando”.
     Na sequência, o usuário deve inserir um número entre 1 e 5,
     e o seu programa deve gerar aleatoriamente outro número,
     também de 1 a 5. Se o número gerado for o mesmo que o usuário inseriu,
     o programa deve escrever na tela “Você acertou!”, mas se for diferente,
     o programa deve escrever “Você errou, o número correto era X”,
     onde X é o número gerado aleatoriamente pelo programa.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int palpite = Integer.parseInt(sc.nextLine());
        int rand = random.nextInt(5) + 1;

        if(palpite == rand) {
            System.out.println("Você acertou!");
        } else {
            System.out.printf("Você errou, o número correto era %d!", rand);
        }

        /*int palpite;
        do {
            System.out.print("Adivinhe qual número de 1 a 5 que eu estou pensando: ");
            palpite = Integer.parseInt(sc.nextLine());
        } while (palpite != rand);

        System.out.println("Você acertou!");*/
    }
}
