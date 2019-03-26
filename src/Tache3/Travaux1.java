package Tache3;
import java.util.Scanner;

public class Travaux1 {
    final private static double CONVERT = 3.281;

    public static void main (String[] args){
        boolean i = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Voulez vous calculez le nombres de pieds(p) ou de mètre (m): ");

        while (!i){
            if (input.hasNext("p")){
                double usr = get("p");
                double ans = usr/CONVERT;
                System.out.println(usr + " mètre équivaut à " + ans + " peids");
                i  = true;

            }
            else if (input.hasNext("m")){
                double usr = get("m");
                double ans = usr*CONVERT;
                System.out.println(usr + " pieds équivaut à " + ans + " mètre");
                i = true;
            }
            else{
                System.out.println("Insérer un réponse valide... ");
                input.next();
            }
        }
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
            case "m":
                System.out.print("Entre une valeur en mètre: ");
                break;

            case "p":
                System.out.print("Entre une valeur en pieds: ");
                break;
        }
    }
}
