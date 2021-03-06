package Tache4;

import java.util.Scanner;

public class Travaux4 {
    public static void main (String[] args){
        int units = get();
        if (units < 0){
            System.out.println("Nombre invalide. Essayer encore");
        }
        else if(0 < units && units < 9){
            double total = units*0.80;
            System.out.println("Total: " + total);
        }
        else if(10 <= units && units < 19){
            double total = units*0.80;
            System.out.println("Total: " + total);
        }
        else if(20 < units && units < 49){
            double total = units*0.70;
            System.out.println("Total: " + total);
        }
        else if(50 < units && units < 99){
            double total = units*0.60;
            System.out.println("Total: " + total);
        }
        else{
            double total = units*0.50;
            System.out.println("Total: " + total);
        }
    }


    private static int get() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre d'unités achetés: ");
        String in = input.next();
        while (true) {
            try{
                int newIn = Integer.parseInt(in);

                if (newIn > 0){
                    return newIn;
                }
                else{
                    System.out.print("Insérer un nombre plus grand que 0: ");
                    in = input.next();
                }
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre: ");
                in = input.next();
            }
        }
    }
}
