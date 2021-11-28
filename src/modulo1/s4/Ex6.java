package modulo1.s4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex6 {

  /*  Crie um programa em Java que, utilizando a classe Scanner,
    pergunte ao usuário sua data de nascimento e calcule a sua idade.
    Se o usuário tiver 18 anos ou mais, escreva na tela “você é maior de idade”,
    mas caso tenha menos de 18 anos, escreva “você é menor de idade”.*/

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Data de nascimento (dia/mês/ano): ");
        String nascimento = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = sdf.parse(nascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Integer ano = Integer.parseInt(nascimento.substring(nascimento.lastIndexOf('/')+1));
        Integer idade = Calendar.getInstance().get(Calendar.YEAR) - ano;
        System.out.println(ano);
        System.out.println(idade);
    }
}
