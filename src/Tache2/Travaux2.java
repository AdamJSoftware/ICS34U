package Tache2;
import java.util.Scanner;

public class Travaux2 {
    final private static double VALEUR = 2.205;
    public static void main (String[] args){
        boolean j = false;


        System.out.println("Voulez vous calculez des livres(l) ou des kilogrammes (k)");
        Scanner input = new Scanner(System.in);

        while (!j){
            if (input.hasNext("l")){
                livres_func();
                j = true;
            }
            else if (input.hasNext("k")){
                kilogrammes_func();
                j = true;
            }
            else{
                System.out.println("Insérer un réponse valide... ");
                input.next();
            }
        }
    }

    private static void livres_func (){
        boolean j = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre un nombre en livres: ");

        while (!j){
            if (input.hasNextDouble()){
                double livres = input.nextDouble();
                double kg = livres / VALEUR;
                System.out.println(livres + " livres équivant à " + kg + " kilogrammes");
                j = true;

            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }
    }

    private static void kilogrammes_func (){
        boolean j = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre un nombre en kilogrammes: ");

        while (!j){
            if (input.hasNextDouble()){
                double kg = input.nextDouble();
                double livres = kg * VALEUR;
                System.out.println(kg + " kilogrammes équivant à " + livres + " livres");
                j = true;

            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }

    }
}
