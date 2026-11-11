package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

// A funçao fazer barulho que recebe uma string animal como argumento
    public static void fazerBarulho(String animal) {
        switch (animal){
            case "Cão":
                System.out.println("Au au au");
                break;
            case "Gato":
                System.out.println("Miau");
                break;
            case "Peixe":
                System.out.println("Glub Glub");
                break;
            case "Vaca":
                System.out.println("Muuuuu");
                break;
            case "Porco":
                System.out.println("Oinc Oinc");
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



// Pedir ao utilizador para inserir uma string de um animal
        System.out.print("Escolha um animal: ");
        String animalRecebido = input.nextLine();

        //Chamar a função e receber o input do utilizador
        fazerBarulho(animalRecebido);
    }
}
