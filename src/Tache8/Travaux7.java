package Tache8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux7 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.print("Nombre de départ d'organismes: ");
        double depart = get();
        System.out.print("Augmentation journalière moyenne: ");
        double ADG = get();
        System.out.print("Nombre de jours à multiplier: ");
        double JM = get();
        System.out.println("Day\t\t\t\tApproximate Population");
        for (int i = 1; i<=JM; i++){
            System.out.printf("%s\t\t\t\t%s\n",i,df.format(depart));
            depart = depart*(ADG/100+1);
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
