package Tache3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux2 {
    public static void main(String[] args) {
        boolean i = false;
        DecimalFormat df = new DecimalFormat(".##");

        double sousTotal = get("s");
        double pourboire = get("p");
        pourboire = pourboire/100;
        double total = sousTotal * (1+pourboire);

        System.out.println("Le pourboire est " + df.format(pourboire*10) + "$ et le montant total est " + df.format(total) + "$");
    }


    private static double get(String valeur){
        Scanner input = new Scanner(System.in);
        print(valeur);

        while (true){
            if (input.hasNextDouble()){
                return input.nextDouble();
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }
    }

    private static void print(String valeur){
        switch (valeur){
            case "s":
                System.out.print("Entre le sous-total: ");
                break;

            case "p":
                System.out.print("Entre le pourcentage du pourboire: ");
                break;
        }
    }
}

