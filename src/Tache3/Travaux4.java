package Tache3;

import java.util.Scanner;


public class Travaux4 {
    public static void main (String[] args){
        double x1 = get_func("x1");
        double y1 = get_func("y1");
        double x2 = get_func("x2");
        double y2 = get_func("y2");
        double x3 = get_func("x3");
        double y3 = get_func("y3");

        double c1 = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
        double c2 = Math.pow(Math.pow(x3-x1,2) + Math.pow(y3-y1,2),0.5);
        double c3 = Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2),0.5);
        double s = (c1+c2+c3)/2;
        double aire = Math.pow(s*(s-c1)*(s-c2)*(s-c3),0.5);
        System.out.println("L'aire du triangle est : " + aire);

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
            case "x3":
                System.out.print("Entre x3: ");
                break;
            case "y3":
                System.out.print("Entre y3: ");
                break;
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

