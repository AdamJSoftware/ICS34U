package Tache5;

import java.util.Scanner;

public class Travaux1 {
    public static void main(String[] args){

        int nb1 = (int) (Math.random()*10);
        int nb2 = (int) (Math.random()*10);

        int total = nb1+nb2;

        System.out.printf("C'est quoi le résultat de %s + %s: ", nb1, nb2);
        double userInput = get();

        if (userInput==total){
            System.out.println("La réponse est correcte!");
        }
        else{
            System.out.printf("\nMauavis réponse. La réponse est %s", total);
        }
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

    }

