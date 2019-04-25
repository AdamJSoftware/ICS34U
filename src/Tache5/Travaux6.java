package Tache5;

import java.util.Scanner;

public class Travaux6 {
    final private static double PI = 3.14159;
    public static void main(String[] args){
        while (true) {
            System.out.println("1: Calcule l'aire d'un cercle");
            System.out.println("2: Calcule l'air d'un rectangle");
            System.out.println("3: Calcule l'air d'un triangle");
            System.out.println("4: Quitter le programme");
            System.out.print("-> ");
            int selection = getSelection();

            switch (selection) {
                case 1:
                    cercle();
                    break;
                case 2:
                    rectange();
                    break;
                case 3:
                    triangle();
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    private static int getSelection() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try{
                int newIn = Integer.parseInt(in);

                if (newIn >= 1 && newIn <= 4){
                    return newIn;
                }
                else{
                    System.out.print("Insérer un nombre entre 1 et 4: ");
                    in = input.next();
                }
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }

    private static void cercle(){
        System.out.print("Insérer le rayon du cercle: ");
        double rayon = get();
        System.out.printf("L'aire  totale du cercle est %s \n \n" , PI * Math.pow(rayon,2));

    }

    private static void rectange(){
        System.out.print("Insérer la longeur du rectangle: ");
        double longeur = get();
        System.out.print("Insérer la largeur du rectangle: ");
        double largeur = get();
        System.out.printf("L'aire  totale du rectangle est %s \n \n" , largeur * longeur);

    }

    private static void triangle(){
        System.out.print("Insérer la base du trinagle: ");
        double base = get();
        System.out.print("Insérer la hauteur du triangle: ");
        double hauteur = get();
        System.out.printf("L'aire  totale du triangle est %s \n \n" , (base * hauteur)/2);

    }

    private static double get() {
        Scanner input = new Scanner(System.in);

        while (true) {
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.print("Insérer un nombre valide: ");
                input.next();
            }
        }
    }
}
