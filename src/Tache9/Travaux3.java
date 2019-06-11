package Tache9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Travaux3 {
    public static void main(String[] args){
        System.out.print("Entrez une phrase: ");
        String phrase = get();
        int nombresDeLettres = compterLettres(phrase);
        System.out.printf("La phrase a %s lettres", nombresDeLettres);

    }
    private static String get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            if (Pattern.matches("[a-zA-Z]+",in)){
                return in;
            } else {
                System.out.print("Insérer seulement des lettres: ");
                in = input.next();
            }
        }
    }
    private static int compterLettres(String s){
        return s.length();
    }
}
