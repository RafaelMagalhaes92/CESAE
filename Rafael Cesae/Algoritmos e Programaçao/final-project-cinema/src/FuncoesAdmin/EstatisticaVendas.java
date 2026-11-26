package FuncoesAdmin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static BiblitecaFuncoes.FuncoesGerais.contarNumeroLinhas;

public class EstatisticaVendas {
    public static void estatisticaVendas() throws FileNotFoundException {
        File ficheiro = new File("GrandeEcraFicheiros/GrandeEcra_Bilhetes.csv");
        Scanner sc = new Scanner(ficheiro);
        double totalVendas = 0;
        double numeroBilhetes;
        double valorMedio;

        System.out.println("Menu bonito");

        //Número total de bilhetes
        numeroBilhetes = contarNumeroLinhas("GrandeEcraFicheiros/GrandeEcra_Bilhetes.csv") - 1;

        if(numeroBilhetes == 0) {
            System.out.println("Total de bilhetes vendidos: 0");
            System.out.println("Receita total de bilhetes: 0 EUR");
            System.out.println("Valor médio por bilhete: 0 EUR");
        } else {

            System.out.println("Total de bilhetes vendidos: " + (contarNumeroLinhas("GrandeEcraFicheiros/GrandeEcra_Bilhetes.csv") - 1));

            sc.nextLine(); //Avançar o cabeçalho

            //Valor total de bilhetes
            while (sc.hasNextLine()) {
                String linhaAtual = sc.nextLine();
                String[] elementosLinha = linhaAtual.split(";");

                totalVendas += Double.parseDouble(elementosLinha[10]);
            }
            System.out.println("Receita total de bilhetes: " + totalVendas + " EUR");

            //Valor médio por bilhete
            valorMedio = totalVendas / numeroBilhetes;
            System.out.println(("Valor médio por bilhete: " + valorMedio + " EUR\n"));
        }
    }
}
