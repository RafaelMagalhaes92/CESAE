package FuncionalidadesCliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NovoRegisto {
    /**
     * Efectua o Registo de dados de um novo cliente (nome, contacto e Email).
     */
    public static void novoRegisto(){
        Scanner input = new Scanner(System.in);
        String nome, email;
        int contacto = 0;
        boolean c = false;

        System.out.println("================ NOVO REGISTO ================");
        System.out.print(" Nome: ");
        nome = input.next();
        while(c == false){
            try {
                System.out.print(" Contacto: ");
                contacto = input.nextInt();
                if(contacto > 0) {
                    c = true;
                } else {
                    System.out.println("[AVISO] Introduza um número válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("[AVISO] Introduza valores numéricos");
                input.nextLine(); //Limpar o buffer
            }
        }

        System.out.print(" Email: ");
        email = input.next();

        System.out.println("\n---------------------------------------------------");
        System.out.println("================ Cliente inserido ================");
        System.out.println(" Nome:                 :" + nome);
        System.out.println(" Contacto:             :" + contacto);
        System.out.println(" Email:                :" + email);
        System.out.println("---------------------------------------------------\n");
    }
}
