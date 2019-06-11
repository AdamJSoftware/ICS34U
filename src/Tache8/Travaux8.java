package Tache8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux8 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.print("Le prix du objet: ");
        double prix = get(false);
        System.out.print("Le taxe sur l'objet(5%,13%,15%): ");
        double tax = get(true);
        System.out.println("Rabais\t\t\tPrix");
        for (double i =20; i <=80; i+=20){
            double newPrix = prix*(tax/100+1);
            System.out.printf("%s\t\t\t%s\n",i+"%",df.format(newPrix-(newPrix*(i/100))));
        }
    }
    private static double get(boolean tax) {
        if (tax){
            Scanner input = new Scanner(System.in);
            while (true) {
                if (input.hasNextDouble()) {
                    double result = input.nextDouble();
                    if (result == 5 || result == 13 || result == 15){
                        return result;
                    }
                    else{
                        System.out.print("Insérer un nombre valide: ");
                        input.next();
                    }
                } else {
                    System.out.print("Insérer un nombre valide: ");
                    input.next();
                }
            }
        }
        else{
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
}
