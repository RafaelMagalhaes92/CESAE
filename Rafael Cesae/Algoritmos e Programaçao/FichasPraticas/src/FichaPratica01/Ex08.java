package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int music1_minutes, music2_minutes, music3_minutes, music4_minutes, music5_minutes, music1_seconds, music2_seconds, music3_seconds, music4_seconds, music5_seconds, totalAlbum, totalMinutes, totalSeconds;

        System.out.print("Introduza os minutos da primeira musica: ");
        music1_minutes = input.nextInt();
        System.out.print("Introduza os segundos da musica: ");
        music1_seconds = input.nextInt();

        System.out.print("Introduza os minutos da segunda musica: ");
        music2_minutes = input.nextInt();
        System.out.print("Introduza os segundos da musica: ");
        music2_seconds = input.nextInt();

        System.out.print("Introduza os minutos da terceira musica: ");
        music3_minutes = input.nextInt();
        System.out.print("Introduza os segundos da musica: ");
        music3_seconds = input.nextInt();

        System.out.print("Introduza os minutos da quarta musica: ");
        music4_minutes = input.nextInt();
        System.out.print("Introduza os segundos da musica: ");
        music4_seconds = input.nextInt();

        System.out.print("Introduza os minutos da quinta musica: ");
        music5_minutes = input.nextInt();
        System.out.print("Introduza os segundos da musica: ");
        music5_seconds = input.nextInt();

        // 1minuto = 60segundos
        // 1hora = 60 minutos, 1hora = 3600segundos

        totalMinutes = music1_minutes + music2_minutes + music3_minutes + music4_minutes + music5_minutes;
        totalSeconds = music1_seconds + music2_seconds + music3_seconds + music4_seconds + music5_seconds;

        totalAlbum = (totalMinutes * 60) + totalSeconds;

        System.out.println("Total do Album: " + totalAlbum);


    }
}
