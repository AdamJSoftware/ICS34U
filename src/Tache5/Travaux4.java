package Tache5;

import java.util.Scanner;

public class Travaux4 {
    final private static double PRIX_ADULTE = 120.0;
    final private static double PRIX_ENFANT = 60.0;
    final private static double PRIX_SENIOR = 100.0;
    public static void main (String[] args){
        System.out.println("Menu: Membres du club de santé");
        System.out.println("1: Adulte");
        System.out.println("2: Enfants");
        System.out.println("3: Senior");
        System.out.println("4: Quitter le programme");
        System.out.print("Entre ton choix: ");

        int choix = get();

        if (choix>=1 && choix <= 3){
            System.out.print("Pour combien de mois: ");
            int mois = getMonths();
            double prix = 0;
            switch (choix){
                case 1: prix = mois*PRIX_ADULTE;
                break;
                case 2: prix = mois*PRIX_ENFANT;
                break;
                case 3: prix = mois*PRIX_SENIOR;
                break;
            }
            System.out.printf("Le prix total est de %s$", prix);
        }
        else if(choix!=4){
            System.out.println("Le choix valide est de 1 à 4");
            System.out.println("Éxecute le programme et fais un choix de 1 à 4");

        }

    }
    private static int get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try{
                int newIn = Integer.parseInt(in);

                if (newIn >= 1 && newIn <= 4){
                    return newIn;
                }
                else{
                    System.out.print("Insérer un nombre entre 1 et 4 ");
                    in = input.next();
                }
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }
    private static int getMonths() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try{
                return Integer.parseInt(in);
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }
}
