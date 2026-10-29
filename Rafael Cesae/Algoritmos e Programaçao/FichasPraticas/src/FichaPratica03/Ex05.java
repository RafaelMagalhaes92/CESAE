package FichaPratica03;

import java.util.Scanner;

public class Ex05{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numMensagens = 1, numeroIntroduzido;
        String messagem;

        System.out.print("Introduza um número: ");
        numeroIntroduzido = input.nextInt();

        //Limpar o buffer
        input.nextLine();

        System.out.print("Introduza uma mensagem: ");
        messagem = input.nextLine();

        while (numMensagens <= numeroIntroduzido) {
            numMensagens = numMensagens + 1;
            System.out.println(messagem);

        }
    }
}
