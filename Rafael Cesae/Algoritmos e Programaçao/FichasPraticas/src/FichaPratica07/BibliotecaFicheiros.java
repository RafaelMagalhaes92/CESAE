package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {
    public static void imprimirFicheiros (String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while(sc.hasNext()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }
    public static void escreverFicheiros (String conteudo, String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);

        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o conteudo do seu ficheiro.");
        conteudo = input.nextLine();

        printWriter.println();
    }

    public static void criarFicheiros (String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println();

    }
}
