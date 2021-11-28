package modulo1.s4;

import java.util.Scanner;

public class Ex9 {

    /*Crie um programa em Java que, utilizando a classe Scanner,
     calcule o fatorial de um número inteiro de 0 a 10.
     O programa deve pedir para o usuário inserir um número inteiro,
     mas só deve aceitar valores de 0 a 10,
     e então deve calcular o fatorial desse número e escrever o resultado na tela.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        do {

            System.out.print("Digite um número de 1 a 10 para calcular o seu fatorial: ");
            numero = Integer.parseInt(sc.nextLine());

        } while(numero < 0 || numero > 10);

        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de !%d é: %d", numero, fatorial);
    }
}
