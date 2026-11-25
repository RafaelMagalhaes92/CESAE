package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.contarNumeroLinhas;
import static FichaPratica07.BibliotecaFicheiros.imprimirMatriz;

public class Ex09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        //Ler o ficheiro
        File ficheiro = new File("FicheirosFicha07/exercicio_09.csv");
        Scanner sc = new Scanner(ficheiro);

        //Descobrir o tamanho da matriz
        //Saber o numero de linhas
        int numeroLinhas = contarNumeroLinhas("FicheirosFicha07/exercicio_09.csv");

        //Saber o numero de colunas
        String linhaAtual = sc.nextLine();
        String[] elementos = linhaAtual.split(",");
        int totalELementos = elementos.length;

        //Atribuir o tamanho à matriz
        String[][] infoMusic = new String[numeroLinhas-1][totalELementos];

        //Um ciclo que vai ler as linhas e escrever na matriz
        for (int i = 0; i < numeroLinhas-1; i++) {
            linhaAtual = sc.nextLine();
            String[] conteudo = linhaAtual.split(",");
            for (int j = 0; j < conteudo.length; j++) {
                infoMusic[i][j]=conteudo[j];
            }
        }
        //imprime o conteudo da matriz
        //imprimirMatriz(infoMusic);

        int opcao;
        do {
            System.out.println("\n+-+-+-+-+-+- Menus de Opções -+-+-+-+-+-+");
            System.out.println("1. Pesquisa por género");
            System.out.println("2. Pesquisa por artista");
            System.out.println("3. Música com maior duração");
            System.out.println("4. Pesquisa por uma determinada duração");
            System.out.println("5. Número de músicas");
            System.out.println("0. Sair");
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

            System.out.print("Escolha a sua opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    input.nextLine(); //Limpar o buffer
                    System.out.println("\n-+-+-+-+- PESQUISA POR GÉNERO -+-+-+-+-");
                    String genero = input.nextLine();
                    System.out.println("---------Música " + genero + "---------");

                    for (int i = 0; i < infoMusic.length; i++) {
                        if(genero.equals(infoMusic[i][2])){
                            System.out.println(infoMusic[i][0] + " | " + infoMusic[i][1]);
                        }
                    }
                    break;
                case 2:
                    input.nextLine(); //Limpar o buffer
                    System.out.println("\n-+-+-+-+- PESQUISA POR ARTISTA -+-+-+-+-");
                    String artista = input.nextLine();
                    System.out.println("---------Músicas de " + artista + "---------");

                    for (int i = 0; i < infoMusic.length; i++) {
                        if(artista.equals(infoMusic[i][1])){
                            System.out.println(infoMusic[i][0]);
                        }
                    }
                    break;
                case 3:
                    int maiorDuracao = 0;
                    for (int i = 0; i < infoMusic.length; i++) {
                        if((Integer.parseInt(infoMusic[i][3]) > maiorDuracao)){
                            maiorDuracao =Integer.parseInt(infoMusic[i][3]);
                            System.out.println("Música com maior duração é: " + maiorDuracao);
                        }
                    }
                case 4:
                case 5:
                    System.out.println("O ficheiro tem: " + (numeroLinhas-1) + "músicas.");
                    break;
                case 0:
                    System.out.println("A Encerrar...");
                    break;

            }
        } while(opcao != 0);

    }
}
