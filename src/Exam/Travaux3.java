package Exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Travaux3 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.print("Entrer le montant investi: ");
        double montant = get();
        System.out.print("Entrer le taux d'intérêt annuel (en décimale): ");
        double taux = get();
        System.out.print("Entrer le nombre d'années: ");
        double temps = get();
        System.out.println("Année\t\tValeur finale\t\tIntérêts");

        for (int i = 1; i <= temps; i++){
            double vf = montant*Math.pow((1+taux),i);
            double interet = vf-montant;
            System.out.printf("%s\t\t\t%s\t\t\t%s\n", i, df.format(vf), df.format(interet));
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
