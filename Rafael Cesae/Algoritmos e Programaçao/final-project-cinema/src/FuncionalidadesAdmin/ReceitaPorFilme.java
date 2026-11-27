package FuncionalidadesAdmin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReceitaPorFilme {
    public static void receitaFilme() throws FileNotFoundException {
        int numeroBilhetes = 0;
        double totalVendas = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Título do filme: ");
        String filme = input.nextLine();

        File ficheiro = new File("GrandeEcraFicheiros/GrandeEcra_Bilhetes.csv");
        Scanner sc = new Scanner(ficheiro);

        sc.nextLine(); //Avançar cabeçalho


        while(sc.hasNext()){
            String linhaAtual = sc.nextLine();
            String[] elementosLinha = linhaAtual.split(";");

            //equalIgnoreCase compara só a linha ignorando se esta tudo em CAPS ou não
            if(filme.equalsIgnoreCase(elementosLinha[5])){
                totalVendas += Double.parseDouble(elementosLinha[10]);
                numeroBilhetes++;
            }
        }
        if(numeroBilhetes == 0){
            System.out.println("\n-> [Não existem vendas para o título do filme: " + filme +"] <-\n");
        } else {
            System.out.println(" -> Título do filme: " + filme);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Filme                         : " + filme);
            System.out.println("Bilhetes vendidos             : " + numeroBilhetes);
            System.out.println("Receita total                 : " + totalVendas + " EUR");
            System.out.println("------------------------------------------------------------------------");
        }

    }

}
