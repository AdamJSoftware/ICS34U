package Tache5;

import java.util.Scanner;

public class Travaux7 {
    final private static double MOIS_A = 9.99;
    final private static double COUT_A = 0.08;
    final private static double MOIS_B = 14.95;
    final private static double COUT_B = 0.06;
    final private static double MOIS_C = 19.95;
    public static void main(String[] args){
        while (true) {
            System.out.println("Service A");
            System.out.println("Service B");
            System.out.println("Service C");
            System.out.println("Quitter Q");
            System.out.print("-> ");
            String selection = getSelection();
            double heures;

            double prixTotal;
            double prixA;
            double prixB;

            switch (selection) {
                case "A":
                    System.out.print("Insérer le montant d'heures: ");
                    heures = get();
                    prixTotal = calculateA(heures);
                    System.out.printf("Le prix total du service A est %s \n \n", prixTotal);
                    prixB = calculateB(heures);
                    valeur(prixTotal, prixB);
                    break;
                case "B":
                    System.out.print("Insérer le montant d'heures: ");
                    heures = get();
                    prixTotal = calculateB(heures);
                    System.out.printf("Le prix total du service B est %s \n \n", prixTotal);
                    prixA = calculateA(heures);
                    valeur(prixA, prixTotal);
                    break;
                case "C":
                    System.out.print("Insérer le montant d'heures: ");
                    heures = get();
                    prixTotal = calculateC();
                    System.out.printf("Le prix total du service C est %s \n \n", prixTotal);
                    prixA = calculateA(heures);
                    prixB = calculateA(heures);
                    valeur(prixA, prixB);
                    break;

                case "Q":
                    System.exit(0);
                    break;
            }
        }
    }
    private static String getSelection() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            if (in.toUpperCase().equals("A") || in.toUpperCase().equals("B") || in.toUpperCase().equals("C") || in.toUpperCase().equals("Q")) {
                return in.toUpperCase();
            } else {
                System.out.print("Insérer un option valide: ");
                input.next();
            }
        }
    }

    private static double calculateA(double heures) {
        if(heures > 5) {
            return  MOIS_A + (heures-5)*60*COUT_A;
        }
        else{
            return MOIS_A;
        }
    }

    private static double calculateB(double heures) {
        if(heures > 10) {
            return  MOIS_B + (heures-10)*60*COUT_B;
        }
        else{
            return MOIS_B;
        }
    }
    private static double calculateC() {
        return MOIS_C;

    }

    private static void valeur(double prixA, double prixB){
        double meilleurValeur = Math.min(prixA,Math.min(prixB,MOIS_C));
        if (meilleurValeur == prixA){
            System.out.printf("Service A est la meilleur option a un prix de %s \n \n", prixA);
        }
        else if (meilleurValeur == prixB){
            System.out.printf("Service B est la meilleur option a un prix de %s \n \n", prixB);
        }
        else{
            System.out.printf("Service C est la meilleur option a un prix de %s \n \n", MOIS_C);
        }
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
