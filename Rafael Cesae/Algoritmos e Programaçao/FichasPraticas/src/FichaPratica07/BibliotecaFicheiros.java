package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNext()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    public static void escreverFicheiro(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);
        String conteudo;


        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o conteudo do seu ficheiro.");
        conteudo = input.nextLine(); // Pede ao utilizador para escrever no ficheiro

        printWriter.println(conteudo); //Escreve no ficheiro o conteudo
        printWriter.close();
    }

    public static void criarFicheiro(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println();

    }

    public static void copiarFicheiro(String caminhoOriginal, String caminhoCopia) throws FileNotFoundException {
        File ficheiroOriginal = new File(caminhoOriginal);
        Scanner sc = new Scanner((ficheiroOriginal));

        File ficheiroCopia = new File(caminhoCopia);
        PrintWriter printWriter = new PrintWriter(ficheiroCopia);

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            printWriter.println(linhaAtual);
        }
        printWriter.close();
    }

    public static int somaNumerosFicheiro(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        int total = 0;

        while (sc.hasNextInt()) {
            int numero = sc.nextInt();
            total += numero;
        }
        return total;
    }

    public static int contarNumeroLinhas(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        int contadorLinhas = 0;

        while (sc.hasNextLine()) {
            contadorLinhas++;
            sc.nextLine();
        }
        return contadorLinhas;
    }

    public static int contarNumeroPalavras(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        int contadorPalavras = 0;

        while (sc.hasNextLine()) {
            contadorPalavras++;
            sc.next();
        }
        return contadorPalavras;
    }

    public static int contarColunasFicheiro(String caminho, String separador) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        String cabecalhado = sc.nextLine();
        String[] cabecalhoSeparado = cabecalhado.split(separador);

        return cabecalhoSeparado.length;

    }

    /**
     *
     * @param caminho
     * @return
     * @throws FileNotFoundException
     */
    public static String[][] lerFicheiroParaMatriz(String caminho, String separador) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarNumeroLinhas(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, separador);

        String[][] matrizMusicas = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(separador);

            for (int i = 0; i < linhaSeparada.length; i++) {
                matrizMusicas[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matrizMusicas;
    }

    /**
     * Funçao que imprime uma matriz na consola
     *
     * @param matriz Matriz a ser impressa
     */
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
