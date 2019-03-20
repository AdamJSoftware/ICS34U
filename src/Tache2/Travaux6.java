package Tache2;

import java.util.Scanner;

public class Travaux6 {
    public static void main (String[] args){
        double x1 = get_func("x1");
        double y1 = get_func("y1");
        double x2 = get_func("x2");
        double y2 = get_func("y2");

        double e1 = Math.pow(x2-x1,2);
        double e2 = Math.pow(y2-y1,2);
        double total = Math.pow(e1+e2,0.5);
        System.out.println("La distance entre les deux points est : " + total);

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
            case "x2":
                System.out.print("Entre x2: ");
                break;
            case "y2":
                System.out.print("Entre y2: ");
                break;
            case "x1":
                System.out.print("Entre x1: ");
                break;
            case "y1":
                System.out.print("Entre y1: ");
                break;
        }
    }

}
