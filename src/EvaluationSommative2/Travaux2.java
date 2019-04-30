/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                  Évaluation sommative - Structure de séléction 1
                                  But: Demander l'utilisateur pour enter le poids
                                  d'un paquet et afficher le coût d'expédition
 */


package EvaluationSommative2;
// Spécifie dans quel paquet se trouve le programme java
import java.util.Scanner;
// Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)


public class Travaux2 {
    public static void main(String[] args){
        System.out.print("Insérer le poids: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double poids = get();
        // En utilisant une fonction appelé get. Nous prenous la valeur de l'utilisatuer en forme d'un double
        if (poids > 0 && poids <= 1){
            // Ce instruction if va fair le suivant si le discriminant est entre 0 et 1
            System.out.println("Le coût est 3.5$");
            // Imprime une déclaration qui présente les réponses à l'utilisateur
        }
        else if (poids > 1 && poids <= 3){
            // Ce instruction if va fair le suivant si le discriminant est entre 1 et 3
            System.out.println("Le coût est 5.5$");
            // Imprime une déclaration qui présente les réponses à l'utilisateur
        }
        else if (poids > 3 && poids <= 10){
            // Ce instruction if va fair le suivant si le discriminant est entre 3 et 10
            System.out.println("Le coût est 8.5$");
            // Imprime une déclaration qui présente les réponses à l'utilisateur
        }
        else if (poids > 10 && poids <= 20){
            // Ce instruction if va fair le suivant si le discriminant est entre 10 et 20
            System.out.println("Le coût est 10.5$");
            // Imprime une déclaration qui présente les réponses à l'utilisateur
        }
    }
    private static double get() {
        // Créationz d'une fonction appelée get qui retourne un double
        Scanner input = new Scanner(System.in);
        // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable
        String in = input.next();
        // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
        while (true){
            // Création d'un while loop
            try{
                // Essayer de convertir l'entrée de l'utilisateur dans un double
                double doubleIn = Double.parseDouble(in);
                if (doubleIn > 0 && doubleIn <= 20){
                    // Ce instruction if va fair le suivant si le discriminant est entre 0 et 20
                    return doubleIn;
                    // Retourner la valeur double doubleIn
                }
                else if (doubleIn > 20){
                    // Ce instruction if va fair le suivant si le discriminant est supérieur à 20
                    System.out.println("Le paquet ne peut être expédié");
                    System.out.print("Essayer encore: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                    in = input.next();
                    // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
                }
                else{
                    System.out.print("Insérer un nombre positif: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                    in = input.next();
                    // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
                }
            }
            catch (NumberFormatException | NullPointerException nfe){
                // Si la valeur string ne peut pas être converti en double
                System.out.print("Insérer un nombre valide: ");
                // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                in = input.next();
                // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur

            }
        }
    }
}
