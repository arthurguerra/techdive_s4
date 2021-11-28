package modulo1.s4;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ZonedDateTime dateTime = ZonedDateTime.now();
        int hora = dateTime.getHour();
        int minuto = dateTime.getMinute();
        String saudacao;

        if (hora >= 6 && hora <= 11) {
            saudacao = "Bom Dia!";
        } else if (hora >= 12 && hora <= 17) {
            saudacao = "Boa Tarde!";
        } else if (hora >= 18 && hora <= 23) {
            saudacao = "Boa Noite!";
        } else {
            saudacao = "Boa Madruga!";
        }

        System.out.printf("%s No momento são %d:%d", saudacao, hora, minuto);
    }
}
