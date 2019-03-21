package Tache2;

import java.util.Scanner;

public class Travaux5 {
    public static void main (String[] args){
        double vi = get_func("i");
        double vf = get_func("f");
        double t = get_func("t");

        double total = (vf-vi) / t;
        System.out.println("L'accélération moyenne est : " + total);

    }

    private static double get_func(String value){
        Scanner input = new Scanner(System.in);
        print_func(value);
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

    private static void print_func(String value){
        switch (value){
            case "i":
                System.out.print("Entre la vitesse initial: ");
                break;
            case "f":
                System.out.print("Entre la vitesse final: ");
                break;
            case "t":
                System.out.print("Entre le temps: ");
                break;
        }
    }
}

