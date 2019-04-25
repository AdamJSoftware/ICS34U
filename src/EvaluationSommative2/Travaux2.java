package EvaluationSommative2;

import java.util.Scanner;

public class Travaux2 {
    public static void main(String[] args){
        System.out.print("Insérer le poids: ");
        double poids = get();
        if (poids > 0 && poids <= 1){
            System.out.println("Le coût est 3.5$");
        }
        else if (poids > 1 && poids <= 3){
            System.out.println("Le coût est 5.5$");
        }
        else if (poids > 3 && poids <= 10){
            System.out.println("Le coût est 8.5$");
        }
        else if (poids > 10 && poids <= 20){
            System.out.println("Le coût est 10.5$");
        }
    }
    private static double get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true){
            try{
                double doubleIn = Double.parseDouble(in);
                if (doubleIn > 0 && doubleIn <= 20){
                    return doubleIn;
                }
                else if (doubleIn > 20){
                    System.out.println("Le paquet ne peut être expédié");
                    System.out.print("Essayer encore: ");
                    in = input.next();
                }
                else{
                    System.out.print("Insérer un nombre positif: ");
                    in = input.next();
                }
            }
            catch (NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();

            }
        }
    }
}
