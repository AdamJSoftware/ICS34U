package Tache7;

import java.util.Scanner;

public class Travaux1 {
    final private static String consonnes = "BCDFGHJKLMNPQRSTVXZ";
    public static void main(String[] args){
        while (true) {
            System.out.print("Entre une lettre: ");
            String c = get();
            if (consonnes.contains(c.toUpperCase())) {
                System.out.printf("%s est une consonne \n", c);
            } else {
                System.out.printf("%s est une voyelle \n", c);
            }
        }
    }
    private static String get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            char c = in.charAt(0);
            String newC = Character.toString(c);
            if(Character.isLetter(c)){
                return newC;
            }
            else{
                System.out.print("Insérer un charactère valide: ");
                in = input.next();
            }
            }
        }
    }

