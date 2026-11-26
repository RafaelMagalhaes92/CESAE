package FuncoesAdmin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReceitaPorSala {
    public static void receitaSala() throws FileNotFoundException {
        int bilhetesMar=0, bilhetesTerra=0, bilhetesSol=0;
        double totalVendasMar= 0,totalVendasTerra= 0, totalVendasSol= 0;

        File ficheiro = new File("GrandeEcraFicheiros/GrandeEcra_Bilhetes.csv");
        Scanner sc = new Scanner(ficheiro);

        sc.nextLine(); //Avançar cabeçalho

        while(sc.hasNextLine()){
            String linhaAtual = sc.nextLine();
            String[] elementosLinha = linhaAtual.split(";");

            if (elementosLinha[7].equals("Mar")){
                totalVendasMar +=Double.parseDouble(elementosLinha[6]);
                bilhetesMar++;
            }
            if (elementosLinha[7].equals("Terra")){
                totalVendasTerra +=Double.parseDouble(elementosLinha[6]);
                bilhetesTerra++;
            }
            if (elementosLinha[7].equals("Sol")){
                totalVendasSol +=Double.parseDouble(elementosLinha[6]);
                bilhetesSol++;
            }


        }
        System.out.println("Sala        Bilhetes         Receita (EUR)");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Sala Mar        " + bilhetesMar + "         " + totalVendasMar);
        System.out.println("Sala Mar        " + bilhetesTerra + "         " + totalVendasTerra);
        System.out.println("Sala Mar        " + bilhetesSol + "         " + totalVendasSol);
        System.out.println("------------------------------------------------------------------------\n");



    }
}
