package Tache2;
import java.util.Scanner;

public class Travaux5 {
    public static void main (String[] args){
        final double PI = 3.14159265359;
        boolean j = false;
        boolean f = false;
        double rayon;
        double aire = 0.0;
        double longueur;
        double volume = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre le rayon du cyclindre: ");

        while (!j){
            if (input.hasNextDouble()){
                if (!f){
                    rayon = input.nextDouble();
                    aire = Math.pow(rayon, PI);
                    System.out.println("Entre la longueur du cyclindre: ");
                    f = true;
                }
                else{
                    longueur = input.nextDouble();
                    volume = longueur * aire;
                    j = true;
                }
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }
        System.out.println("L'aire est " + aire + " et le volume est " + volume);
    }
}
