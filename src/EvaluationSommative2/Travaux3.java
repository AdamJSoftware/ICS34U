package EvaluationSommative2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux3 {
    final private static double TAX = 1.13;
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("1: Taille grande");
        System.out.println("2: Taille extra grande");
        System.out.println("3: Taille moyen");
        System.out.println("4: Taille petite");
        System.out.println("5: Quitter le programme");
        System.out.print("-> ");
        int userInput = getSelection();
        System.out.print("Insérer le montant de T-shirts: ");
        double montant = get();
        double total;
        switch(userInput){
            case 1:
                total = calcule(25, montant);
                System.out.printf("Le prix totale est %s$", df.format(total));
                break;
            case 2:
                total = calcule(30, montant);
                System.out.printf("Le prix totale est %s$", df.format(total));
                break;
            case 3:
                total = calcule(20, montant);
                System.out.printf("Le prix totale est %s$", df.format(total));
                break;
            case 4:
                total = calcule(15, montant);
                System.out.printf("Le prix totale est %s$", df.format(total));
                break;
        }

    }
    private static int getSelection() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try {
                int newIn = Integer.parseInt(in);

                if (newIn >= 1 && newIn <= 4) {
                    return newIn;
                }
                else if (newIn == 5){
                    System.exit(0);
                }else {
                    System.out.print("Insérer un nombre entre 1 et 5: ");
                    in = input.next();
                }
            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }
    private static double get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true){
            try{
                double doubleIn = Double.parseDouble(in);
                if (doubleIn > 0){
                    return doubleIn;
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
    private static double calcule(double cout, double montant){
        return cout*montant*TAX;

    }
}
