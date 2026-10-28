package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos, horasPm;

        System.out.println("Introduza horas: ");
        horas = input.nextInt();
        System.out.println("Introduza minutos: ");
        minutos = input.nextInt();

        if (horas == 0) {
            horas = 12;
            System.out.println(horas + ":" + minutos + " AM");
        }
        if (horas > 0 && horas < 12) {
            System.out.println(horas + ":" + minutos + " AM");
        }
        if (horas == 12) {
            System.out.println(horas + ":" + minutos + " PM");
        }
        if (horas > 12 && horas <= 23) {
            horasPm = horas - 12;
            System.out.println(horasPm + ":" + minutos + " PM");
        }

    }
}
