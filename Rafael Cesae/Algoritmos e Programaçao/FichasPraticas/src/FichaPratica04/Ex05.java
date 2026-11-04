package FichaPratica04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        do {

            System.out.println("Selecione uma opçao: ");
            System.out.println(" 1. Criar \n 2. Atualizar \n 3. Eliminar \n 4. Sair");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Escolheu a opção Criar. \n");
                    break;
                case 2:
                    System.out.print("Escolheu a opção Atualizar.\n");
                    break;
                case 3:
                    System.out.print("Escolheu a opção Eliminar.\n");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("--Opção inválida--\n");
            }
        } while(option != 4);
    }
}
