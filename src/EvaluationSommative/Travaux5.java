/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                       Évaluation sommative - Programmation élémentaire
 */

package EvaluationSommative;
// Spécifie dans quel paquet se trouve le programme java

import java.util.Scanner;
// Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)

public class Travaux5 {
    public static void main(String[] args){

    double vitesse = prends("v");
        // Création d'une objet double appelé vitesse qui est égal au résultat de la fonction prends. Nous passons "v" pour lui faire savoir que nous recherchons la vitesse
    double acceleration = prends("a");
        // Création d'une objet double appelé acceleration qui est égal au résultat de la fonction prends. Nous passons "a" pour lui faire savoir que nous recherchons l'accélération

    double longeur = Math.pow(vitesse,2) / (2*acceleration);
        // Création d'une objet double appelé longuer qui est égal à vitesse^2 / (2*acceleration) (calcule de la longeur)

    System.out.println("La longeur minimale de piste nécessaire est " + longeur);
        // Imprime une déclaration qui présente la longeur à l'utilisateur
    }


    private static double prends(String valeur){
        // Créationz d'une fonction appelée prends qui retourne un double
        Scanner input = new Scanner(System.in);
        // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable
        print(valeur);
        // Appelle une fonction appelée print et transmet la valeur à imprimer

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

    private static void print(String valeur){
        // Créationz d'une fonction appelée print qui retourne rien
        switch (valeur){
            case "v":
                // Si la valeur est v. Fait ceci
                System.out.print("Entre la vitesse: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                break;
                    // Arrête le cas de continuer

            case "a":
                // Si la valeur est p. Fait ceci
                System.out.print("Entre l'accélération: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                break;
                    // Arrête le cas de continuer
        }
    }
}
