package Tache4;

import java.util.Scanner;

public class Travaux3 {
    public static void main (String[] args){
        int livres = get();

        if (livres < 0){
            System.out.println("Points totals: 0");
        }
        else if(livres == 1){
            System.out.println("Points totals: 5");
        }
        else if(livres == 2){
            System.out.println("Points totals: 15");
        }
        else if(livres == 3){
            System.out.println("Points totals: 30");
        }
        else{
            System.out.println("Points totals: 60");
        }
    }


    private static int get() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre de livres achetés: ");

        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.print("Insérer un nombre valide: ");
                input.next();
            }
        }
    }
}

