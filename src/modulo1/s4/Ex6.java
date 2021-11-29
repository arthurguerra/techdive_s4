package modulo1.s4;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex6 {

  /*  Crie um programa em Java que, utilizando a classe Scanner,
    pergunte ao usuário sua data de nascimento e calcule a sua idade.
    Se o usuário tiver 18 anos ou mais, escreva na tela “você é maior de idade”,
    mas caso tenha menos de 18 anos, escreva “você é menor de idade”.*/

    public static void main (String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Data de nascimento (dia/mês/ano): ");
        String nascimento = sc.nextLine();

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int ano = Integer.parseInt(nascimento.substring(nascimento.lastIndexOf('/')+1));
        int idade = Calendar.getInstance().get(Calendar.YEAR) - ano;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
