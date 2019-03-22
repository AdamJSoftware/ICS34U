package Tache2;
import java.util.Scanner;

public class Travaux1 {
    public static void main (String[] args){
        final double PI = 3.14159265359;
        double rayon = get_func("r");
        double longueur = get_func("l");

        double aire = Math.pow(rayon, 2) * PI;
        double volume = longueur * aire;

        System.out.println("L'aire est " + aire + " et le volume est " + volume);
    }

    private static double get_func(String value){
        Scanner input = new Scanner(System.in);
        print_func(value);
        while (true){
            if(input.hasNextDouble()){
                return input.nextDouble();
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }

    }

    private static void print_func(String value){
        switch (value){
            case "l":
                System.out.print("Entre la longueur du cylindre");
                break;
            case "r":
                System.out.print("Entre le rayon du cylindre: ");
                break;
        }
    }
}