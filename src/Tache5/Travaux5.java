package Tache5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux5 {
    final private static double AIR = 1100;
    final private static double EAU = 4900;
    final private static double ACIER = 16400;
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Dans quel milieu voyage le son?");
        System.out.println("1: Aire");
        System.out.println("2: Eau");
        System.out.println("3: Acier");
        System.out.print("Entre ton choix: ");
        int milieu = getMilieu();

        System.out.print("Quel distance le sons voyage en pieds?: ");

        double distance = getDistance();

        double total = 0;

        switch (milieu){
            case 1: total = distance/AIR;
                break;
            case 2: total = distance/EAU;
                break;
            case 3: total = distance/ACIER;
                break;
        }
        System.out.printf("Le temps total est %s secondes", df.format(total));
    }

    private static int getMilieu() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try{
                int newIn = Integer.parseInt(in);

                if (newIn >= 1 && newIn <= 3){
                    return newIn;
                }
                else{
                    System.out.print("Insérer un nombre entre 1 et 3: ");
                    in = input.next();
                }
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }
    private static double getDistance() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try{
                return Double.parseDouble(in);
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }
}
