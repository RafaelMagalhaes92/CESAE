package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPonderada, notaPonderada1 = 0, notaPonderada2 = 0, notaPonderada3 = 0;
        int aprovado = 0;

        System.out.print("Introduza a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Introduza a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Introduza a terceira nota: ");
        nota3 = input.nextDouble();

        if (nota1 >= 0 && nota1 <= 20 && nota2 >= 0 && nota2 <= 20 && nota3 >= 0 && nota3 <= 20) {
            notaPonderada1 = nota1 * 0.25;
            notaPonderada2 = nota2 * 0.35;
            notaPonderada3 = nota3 * 0.40;

            mediaPonderada = notaPonderada1 + notaPonderada2 + notaPonderada3;

            if (mediaPonderada < 9.5) {
                System.out.println("O aluno esta reprovado.");
            } else {
                System.out.println("O aluno esta aprovado.");
                aprovado = aprovado + 1;
                System.out.println("Numero de alunos aprovados: " + aprovado);
            }
        }else{
            System.out.println("Meteste mal as notas");
        }


    }
}
