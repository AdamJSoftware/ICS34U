package Tache6;

import java.util.Scanner;

import java.text.DecimalFormat;
public class Travaux2 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.print("Entre les ventes pour le premier jour: ");
        double pj = get();
        System.out.print("Entre les ventes pour le deuxième jour: ");
        double dj = get();
        System.out.print("Entre les ventes pour le troisième jour: ");
        double tj = get();
        System.out.println("\nPortrait des ventes");
        System.out.println("---------------------");
        System.out.format("%-15s%-15s\n", "Jour 1:", df.format(pj));
        System.out.format("%-15s%-15s\n", "Jour 2:", df.format(dj));
        System.out.format("%-15s%-15s\n", "Jour 3:", df.format(tj));
        System.out.format("%-15s%-15s\n", "Total:", df.format(pj + dj + tj));
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
