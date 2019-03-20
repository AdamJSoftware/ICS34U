package Tache2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux4 {
    public static void main(String[] args){
        double distance = get_func("d");
        double milles = get_func("m");
        double prix = get_func("p");

        double total = distance/milles * prix;
        DecimalFormat format = new DecimalFormat("##.00");
        System.out.println("Le cout du voyage est de: " + format.format(total) +"$");

    }

    private static double get_func(String VALUE){
        Scanner input = new Scanner(System.in);
        print_func(VALUE);
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

    private static void print_func(String VALUE){
        switch (VALUE){
            case "p":
                System.out.print("Entre le prix par gallon: ");
                break;
            case "m":
                System.out.print("Entre le nombre de milles par gallon: ");
                break;
            case "d":
                System.out.print("Entre la distance a parcourir: ");
                break;
        }
    }
}
