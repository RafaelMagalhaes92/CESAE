package FuncionalidadesAdmin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Autenticacao {

    /**
     *
     * @return false se as credenciais estiverem erradas e true
     * @throws FileNotFoundException Se o ficheiro nao existir
     */
    public static boolean autenticacao() throws FileNotFoundException {
        File ficheiro = new File ("GrandeEcraFicheiros/GrandeEcra_AdminLogin.csv");
        Scanner sc = new Scanner(ficheiro);

        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        String usernameInput = input.next();

        System.out.println("Password: ");
        String passwordInput = input.next();

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] elementosLinha = linhaAtual.split(";");

            if(usernameInput.equals(elementosLinha[0]) && passwordInput.equals(elementosLinha[1])){
                return true;
            }
        }return false;

    }
}
