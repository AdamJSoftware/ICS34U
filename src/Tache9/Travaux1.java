package Tache9;

import java.util.Scanner;

public class Travaux1 {
    public static void main(String[] args){
        System.out.print("Entre le nombre de cotes: ");
        double n = get();
        System.out.print("Entre la longeur des cotes: ");
        double s = get();
        double total = aire(n,s);
        System.out.printf("L'aire du polygone est: %s", total);

    }
    private static double get() {
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
    private static double aire(double n, double s){
        return (n*Math.pow(s,2))/4*Math.tan(Math.PI/n);
    }
}
