package BiblitecaFuncoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FuncoesGerais {

    /**
     * Imprime o contéudo de um ficheiro
     * @param caminho Caminho do ficheiro a ser lido
     * @throws FileNotFoundException caso o ficheiro não exista
     */
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


    /**
     *
     * @param caminho Caminho do ficheiro a ser lido
     * @return Número de linhas de um ficheiro
     * @throws FileNotFoundException caso o ficheiro não exista
     */
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


    /**
     * Função para contar o número de colunas de um ficheiro
     * @param caminho Caminho do ficheiro a ser lido
     * @param separador caráter de separação das colunas da primeira linha
     * @return o número de colunas de um ficheiro
     * @throws FileNotFoundException Se o ficheiro não existir
     */
    public static int contarColunasFicheiro(String caminho, String separador) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        String cabecalhado = sc.nextLine();
        String[] cabecalhoSeparado = cabecalhado.split(separador);

        return cabecalhoSeparado.length;

    }

    public static String[][] lerFicheiroParaMatrizSemCabecalho(String caminho, String separador) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarNumeroLinhas(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, separador);

        String[][] matrizConteudo = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(separador);

            for (int i = 0; i < linhaSeparada.length; i++) {
                matrizConteudo[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matrizConteudo;
    }


    /**
     * Função que lê um ficheiro e passa o conteúdo para uma matriz incluindo cabeçalho
     * @param caminho Caminho do ficheiro a ser lido
     * @param separador caráter de separação das colunas em cada linha
     * @return uma matriz com todos os dados do ficheiro
     * @throws FileNotFoundException se o ficheiro não existir
     */
    public static String[][] lerFicheiroParaMatrizComCabecalho(String caminho, String separador) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarNumeroLinhas(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, separador);

        String[][] matrizConteudo = new String[numeroLinhasFicheiro][numeroColunasFicheiro];

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(separador);

            for (int i = 0; i < linhaSeparada.length; i++) {
                matrizConteudo[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matrizConteudo;
    }


    /**
     * Função que imprime uma matriz
     * @param matriz Matriz a ser imprimida
     */
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * Função demoníaca que imprime o Alfabeto
     * @param valor recebe um inteiro
     */
    public static void imprimirAlfabeto(int valor) {
        String letra;
        if (valor == 0) {
            letra = "A   ";
            System.out.print(letra);
        } else if (valor == 1) {
            letra = "B   ";
            System.out.print(letra);
        } else if (valor == 2) {
            letra = "C   ";
            System.out.print(letra);
        } else if (valor == 3) {
            letra = "D   ";
            System.out.print(letra);
        } else if (valor == 4) {
            letra = "E   ";
            System.out.print(letra);
        } else if (valor == 5) {
            letra = "F   ";
            System.out.print(letra);
        } else if (valor == 6) {
            letra = "G   ";
            System.out.print(letra);
        } else if (valor == 7) {
            letra = "H   ";
            System.out.print(letra);
        } else if (valor == 8) {
            letra = "I   ";
            System.out.print(letra);
        } else if (valor == 9) {
            letra = "J   ";
            System.out.print(letra);
        } else if (valor == 10) {
            letra = "K   ";
            System.out.print(letra);
        } else if (valor == 11) {
            letra = "L   ";
            System.out.print(letra);
        } else if (valor == 12) {
            letra = "M   ";
            System.out.print(letra);
        } else if (valor == 13) {
            letra = "N   ";
            System.out.print(letra);
        } else if (valor == 14) {
            letra = "O   ";
            System.out.print(letra);
        } else if (valor == 15) {
            letra = "P   ";
            System.out.print(letra);
        } else if (valor == 16) {
            letra = "Q   ";
            System.out.print(letra);
        } else if (valor == 17) {
            letra = "R   ";
            System.out.print(letra);
        } else if (valor == 18) {
            letra = "S   ";
            System.out.print(letra);
        } else if (valor == 19) {
            letra = "T   ";
            System.out.print(letra);
        } else if (valor == 20) {
            letra = "U   ";
            System.out.print(letra);
        } else if (valor == 21) {
            letra = "V   ";
            System.out.print(letra);
        } else if (valor == 22) {
            letra = "W   ";
            System.out.print(letra);
        } else if (valor == 23) {
            letra = "X   ";
            System.out.print(letra);
        } else if (valor == 24) {
            letra = "Y   ";
            System.out.print(letra);
        } else if (valor == 25) {
            letra = "Z   ";
            System.out.print(letra);
        }
    }
}


