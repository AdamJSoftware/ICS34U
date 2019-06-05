package Tache8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux5 {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.print("Entre le montant initial du dépôt: ");
        double montant_initial = get();
        System.out.print("Entre le taux d'intérêt annuel: ");
        double interet_annuel = get();
        System.out.print("Entre la périoide d'échéance: ");
        double period = get();
        System.out.println("Mois\t\tValeur du CPG");
        for(int mois = 1; mois<=period; mois++){
            double interet_mensuel = (interet_annuel/1200)*montant_initial;
            montant_initial = montant_initial + interet_mensuel;
            System.out.printf("%s\t\t\t%s\n",mois,df.format(montant_initial));
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
