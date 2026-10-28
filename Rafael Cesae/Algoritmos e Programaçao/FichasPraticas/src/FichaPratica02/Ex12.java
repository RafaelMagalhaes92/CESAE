package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        System.out.println("- Selecione uma das Opções -");
        System.out.println("\n 1 - Criar \n 2 - Atualizar \n 3 - Eliminar \n 4 - Sair \n" );
        System.out.println("--------------");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.print("Selecionou a opçao 'Criar' ");
                break;
            case 2:
                System.out.print("Selecionou a opçao 'Atualizar' ");
                break;
            case 3:
                System.out.print("Selecionou a opçao 'Eliminar' ");
                break;
            case 4:
                break;
            default:
                System.out.print("Opção ínvalida ");
        }

    }
}
