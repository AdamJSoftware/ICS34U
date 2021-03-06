/*
Adam Jasniewicz                                                                                         le 5 juin 2019

                                  Évaluation sommative - Techniques de programmation 3
                                  But: Écris un programme qui affiche une liste de
                                  nombres et de leurs carrés. Au lieu d'afficher les
                                  numéros 1 à 10, ce programme permet à l'utilisateur
                                  de saisir une valeur minimale et une valeur maximale
                                  et ensuite afficher leurs carrés.
 */
package EvaluationSommative4;

import java.util.Scanner;

public class Travaux1 {
    public static void main(String[] args){
        System.out.print("Entrez le nombre minimale: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double min = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        System.out.print("Entrez le nombre maximale: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double max = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        System.out.println("Nombre\t\t\t\tCarrée");
        // Imprime les noms des colonnes
        for (double i = min; i <=max;i++){
            // Création d'un loupe for qui imprime des données jusqu'à i (incrément de 1) est égale a max
            System.out.printf("%s\t\t\t\t\t%s\n",i,Math.pow(i,2));
            // Imprimé le nombre i ainsi que son carrée à l'aide de Math.pow
        }


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
