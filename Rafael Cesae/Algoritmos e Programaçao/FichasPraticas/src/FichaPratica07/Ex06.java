package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("FicheirosFicha07/exercicio_06.txt");
        Scanner sc = new Scanner(file);

        int idadeMaior = 0;
        String nomeVelho = "";

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] maisVelho = linhaAtual.split(",");

            int idadeAtual = Integer.parseInt(maisVelho[1]);

            if (idadeAtual > idadeMaior) {
                idadeMaior = idadeAtual;
                nomeVelho = maisVelho[0];
            }

        }
        sc.close();
        System.out.print(nomeVelho + " é o mais velho com " + idadeMaior + " anos!");
    }
}
