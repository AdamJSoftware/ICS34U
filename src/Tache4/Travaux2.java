package Tache4;

import java.util.Scanner;

public class Travaux2 {
    public static void main(String[] args) {

        double ventes = get();

        if (ventes > 10_000){
            double total = ventes*0.1;
            double commission = ventes*1.1;
            System.out.println("Commission (10%): " + commission);
            System.out.println("Total: " + total);
        }
        else if(5_000 < ventes && ventes < 10_000){
            double total = ventes*0.075;
            double commission = ventes*1.075;
            System.out.println("Commission (7.5%): " + commission);
            System.out.println("Total: " + total);
        }
        else if(100 < ventes && ventes < 5_000){
            double total = ventes*0.05;
            double commission = ventes*1.05;
            System.out.println("Commission (5%): " + commission);
            System.out.println("Total: " + total);

        }
        else{
            System.out.println("Erreur de donnée");
        }
    }


    private static double get() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre de ventes: ");

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
