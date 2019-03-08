package Tache2;
import java.util.Scanner;


public class inputcercle {
    public static void main(String[]args){
        final double pi = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesure du rayon: ");
        double rayon = input.nextDouble();
        double aire = Math.pow(rayon,2) * pi;
        System.out.println("L'aire du cecrcle avec le rayon de " + rayon + " est " + aire);

    }
}
