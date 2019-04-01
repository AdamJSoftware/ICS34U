/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                       Évaluation sommative - Programmation élémentaire
 */

package EvaluationSommative;
    // Spécifie dans quel paquet se trouve le programme java
import java.util.Scanner;
    // Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)

public class Travaux2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
            // Création d'une objet double constante appelé PI pour éviter a toujours récrire pi

        double rayon = prends("r");
            // Création d'une objet double appelé rayon qui est égal au résultat de la fonction prends. Nous passons "r" pour lui faire savoir que nous recherchons le rayon
        double hauteur = prends("h");
            // Création d'une objet double appelé hautuer qui est égal au résultat de la fonction prends. Nous passons "r" pour lui faire savoir que nous recherchons le hauteur
        double aire = 2*PI*Math.pow(rayon,2) + 2*PI*rayon*hauteur;
            // Création d'une objet double appelé aire qui est égal à 2 * PI * rayon au carré + 2 * PI * rayon * hauteur

        System.out.println("L'aire totale du cylindre est " + aire);
            // Imprime une déclaration qui présente l'aire à l'utilisateur
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
            case "r":
                // Si la valeur est r. Fait ceci
                System.out.print("Entre le rayon: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                break;
                    // Arrête le cas de continuer

            case "h":
                // Si la valeur est h. Fait ceci
                System.out.print("Entre la hauteur: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                break;
                // Arrête le cas de continuer
        }
    }
}

