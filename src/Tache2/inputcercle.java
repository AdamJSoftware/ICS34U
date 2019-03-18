package Tache2;
import java.util.Scanner;


public class inputcercle {
    public static void main(String[]args){
        final double pi = 3.14159;
        boolean j = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesure du rayon: ");
        while (!j){
            if (input.hasNextDouble()){
                double rayon = input.nextDouble();
                double aire = Math.pow(rayon,2) * pi;
                System.out.println("L'aire du cecrcle avec le rayon de " + rayon + " est " + aire);
                j = true;
            }
            else{
                System.out.println("L'input n'est pas un chiffre");
                input.next();
            }
        }


    }
}
