package Tache6;

import java.util.Scanner;

import java.text.DecimalFormat;
public class Travaux1 {

    public static void main(String[] args){
        System.out.print("Entre la longeur du coté: ");
        double s = get();
        double aire = (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.printf("L'aire de l'hexagone est %s", df.format(aire));
    }
    private static double get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            try{
                double newDouble = Double.parseDouble(in);

                if (newDouble > 0){
                    return newDouble;
                }
                else{
                    System.out.print("Insérer un nombre plus grand que 0: ");
                    in = input.next();
                }
            }
            catch(NumberFormatException | NullPointerException nfe){
                System.out.print("Insérer un nombre valide: ");
                in = input.next();
            }
        }
    }
}
