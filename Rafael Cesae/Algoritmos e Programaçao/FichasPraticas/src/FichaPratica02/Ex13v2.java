package FichaPratica02;

import java.util.Scanner;

public class Ex13v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.println("Introduza horas: ");
        horas = input.nextInt();
        System.out.println("Introduza minutos: ");
        minutos = input.nextInt();


        if (horas >= 0 && horas < 12) {
            if (horas == 0) {
                horas = 12;
            }
            System.out.println(horas + ":" + minutos + " AM");

        } else if (horas >= 12 && horas <= 23) {
            if (horas > 12) {
                horas = horas - 12;
            }
            System.out.println(horas + ":" + minutos + " PM");
        }
    }
}

