/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                       Évaluation sommative - Programmation élémentaire
 */

package EvaluationSommative;
    // Spécifie dans quel paquet se trouve le programme java

import java.util.Scanner;
    // Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)

public class Travaux4 {
    public static void main(String[] args) {
        final double CONVERSION_KILO = 0.45359237;
            // Création d'une objet double constante appelé CONVERSION_KILO pour aider à la conversion de masse
        final double CONVERSION_METRE = 0.0254;
            // Création d'une objet double constante appelé CONVERSION_METRE pour aider à la conversion de masse

        double livres = prends("l");
            // Création d'une objet double appelé livres qui est égal au résultat de la fonction prends. Nous passons "l" pour lui faire savoir que nous recherchons le montant de livres
        double kilo = livres * CONVERSION_KILO;
            // Création d'une objet double appelé kilo qui est égal à livres * CONVERSION_KILO (conversion de livres en killogrammes)
        double pouces = prends("p");
            // Création d'une objet double appelé pouces qui est égal au résultat de la fonction prends. Nous passons "p" pour lui faire savoir que nous recherchons le montant de pouces
        double metre = pouces * CONVERSION_METRE;
            // Création d'une objet double appelé metre qui est égal à pouces * CONVERSION_METRE (conversion de pouces en metres)
        double IMC = kilo / Math.pow(metre, 2);
            // Création d'une objet double appelé metre qui est égal à kilo / metre^2 (calcule de l'IMC)

        System.out.println("L'IMC est " + IMC);
            // Imprime une déclaration qui présente l'IMC à l'utilisateur
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
            case "l":
                // Si la valeur est l. Fait ceci
                System.out.print("Entre le poids en livres: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                break;
                    // Arrête le cas de continuer

            case "p":
                // Si la valeur est p. Fait ceci
                System.out.print("Entre la hauteur en pouces: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                break;
                    // Arrête le cas de continuer
        }
    }
}

