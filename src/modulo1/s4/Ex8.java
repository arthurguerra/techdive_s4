package modulo1.s4;

import java.util.Scanner;

public class Ex8 {

    /*Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora.
    O programa deve pedir um número, depois outro, e por último uma operação.
    O sistema deve aceitar como operação qualquer uma dessas 4 opções:
    “somar”, “subtrair”, “multiplicar” ou "dividir",
    e realizar a operação correspondente entre os 2 números inseridos,
    para então escrever na tela do usuário o resultado.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o segundo número: ");
        double numero2 = Double.parseDouble(sc.nextLine());

        String operacao;
        double resultado;
        boolean controlador = true;

        do {

            System.out.println("Escreva a operação que gostaria de realizar");
            System.out.print("[somar] [subtrair] [multiplicar] [dividir]: ");
            operacao = sc.nextLine();

            switch (operacao) {

                case "somar":
                case "soma":
                    resultado = numero1 + numero2;
                    controlador = false;
                    break;
                case "subtrair":
                case "subtracao":
                case "subtração":
                    resultado = numero1 - numero2;
                    controlador = false;
                    break;
                case "multiplicar":
                case "multiplicacao":
                case "multiplicação":
                    resultado = numero1 * numero2;
                    controlador = false;
                    break;
                case "dividir":
                case "divisao":
                case "divisão":
                    resultado = numero1 / numero2;
                    controlador = false;
                    break;
                default:
                    System.out.println("Operação Inválida! Tente novamente.");
                    resultado = 0;
            }
        } while(controlador);

        System.out.printf("O resultado da operação '%s' entre %.2f e %.2f é: %.2f", operacao, numero1, numero2, resultado);
    }
}
