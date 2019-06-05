package Tache8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux6 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        DecimalFormat df2 = new DecimalFormat("##.000");
        System.out.print("Montant du prêt: ");
        double montant_initial = get();
        System.out.print("Nombre d'années: ");
        double annee = get();

        System.out.println("Taux d'intétêt\t\t\tPaiement mensuel\t\t\tPaiement total");
        for(double i = 5; i <=8; i+=0.125){
            double TIM = i/1200;
            double pM = (montant_initial*TIM)/(1-Math.pow((1+TIM),(-annee*12)));
            System.out.printf("%s\t\t\t\t\t%s\t\t\t\t\t\t%s\n",df2.format(i*1)+"%",df.format(pM),df.format(pM*12*5));
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
