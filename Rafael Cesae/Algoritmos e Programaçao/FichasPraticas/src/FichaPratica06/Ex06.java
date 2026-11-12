package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        //Guarda o os valores do vetor num nome vetor para ser mais facil de utilizar os dados
        int[] v = preencherVetor(lerTamanhoVetor());
        //Para depois poder imprimir
        imprimirVetor(v);

        do {

            System.out.println("+-+-+-+-+-+- Menus de Opções -+-+-+-+-+-+");
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente ou Não Crescente");
            System.out.println("0. Sair");
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

            System.out.print("Escolha a sua opção: ");
            opcao = input.nextByte();

            switch (opcao) {
                case 7:
                    valorMaior(v);
                    System.out.println("O valor maior é: " + valorMaior(v));
                    break;
                case 8:
                    valorMenor(v);
                    System.out.println("O valor menor é: " + valorMenor(v));
                    break;
                case 9:
                    if(vetorCrescente(v)) {
                        System.out.println("É crescente.");
                    } else {
                        System.out.println("Não é crescente.");
                    }
                    break;
                case 0:
                    System.out.println("A Encerrar...");
                    break;

            }
        } while (opcao != 0);


    }
}
