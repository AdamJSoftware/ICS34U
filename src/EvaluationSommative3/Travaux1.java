/*
Adam Jasniewicz                                                                                         le 22 mai 2019

                                Évaluation sommative - Techniques de programmation 1
                                  But: demander à l'utilisateur d'entrer le nombre de
                                  côtés dans un pôlygones et la longeur de ces côtés
                                  afin d'afficher son aire.
 */
package EvaluationSommative3;

import java.util.Scanner;

public class Travaux1 {
    public static void main(String[] args){
        System.out.print("Entre le nombre de côtés: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double cotes = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        System.out.print("Entre la longeur du côté: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double longeur = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        double aire = (cotes*Math.pow(longeur,2))/(4*Math.tan(Math.PI/cotes));
        // Création d'une variable double appelé cotes qui est égal à le résultat de ce équation
        System.out.printf("L'aire du polygone est %s", aire);
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer

    }
    private static double get() {
        // Créationz d'une fonction appelée get qui retourne un double
        Scanner input = new Scanner(System.in);
        // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable

        while (true){
            // Une boucle qui demande constamment à l'utilisateur une entrée jusqu'à ce qu'un double soit entré
            if (input.hasNextDouble()){
                // Si l'entrée utilisateur est un double. Faire ce qui suit
                return input.nextDouble();
                // Retourne le double saisi par l'utilisateur. Le retour met également fin à la fonction entière
            }
            else{
                // Si l'entrée utilisateur n'est pas un double. Faire ce qui suit
                System.out.println("Insérer un nombre valide... ");
                // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                input.next();
                // Demandez à l'utilisateur pour une autre entrée
            }
        }
    }
}
