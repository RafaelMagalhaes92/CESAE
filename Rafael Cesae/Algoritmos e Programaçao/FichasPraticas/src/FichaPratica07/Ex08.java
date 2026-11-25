package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {
        File ficheiro = new File("FicheirosFicha07/exercicio_08.csv");
        Scanner sc = new Scanner(ficheiro);

        double totalVendas= 0;

        sc.nextLine(); //Avançar o cabeçalho

        while(sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] elementosLinha = linhaAtual.split(",");

            totalVendas+= Double.parseDouble(elementosLinha[2])*Double.parseDouble(elementosLinha[3]);

        }
        System.out.print("O total de vendas foi: " + totalVendas + "€");
    }
}
