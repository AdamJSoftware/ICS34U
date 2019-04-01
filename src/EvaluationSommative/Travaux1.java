/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                       Évaluation sommative - Programmation élémentaire
 */

package EvaluationSommative;
    // Spécifie dans quel paquet se trouve le programme java
import java.util.Scanner;
    // Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)
import java.text.DecimalFormat;
    // Importe le package Decimal Format (utilisé pour formater le texte)

public class Travaux1 {
    public static void main(String[] args){
        final double EURO_PAR_DOLLAR = 0.5565;
            // Création d'une objet double constante appelé EURO_PAR_DOLLAR pour aider à la conversion monétaire
        final double LIVRE_PAR_DOLLAR = 0.7083;
            // Création d'une objet double constante appelé LIVRE_PAR_DOLLAR pour aider à la conversion monétaire
        boolean i = false;
            // Création d'un objet booléen appelé i. Cet objet est défini sur false. Cette variable est utilisée pour une boucle while qui s'assure que la saisie de l'utilisateur est un double
        DecimalFormat df = new DecimalFormat("##.00");
            // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant monétaire
        Scanner input = new Scanner(System.in);
            // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable
        System.out.print("Entre le montant de dollars canadiens: ");
            // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        while (!i){
            // Cette instruction while demande à l’utilisateur pour entrée jusqu’à ce qu'un double est entrée
            if(input.hasNextDouble()){
                // Si l'entrée utilisateur est un double. Faire ce qui suit
                double cad = input.nextDouble();
                    // Création d'une objet double appelé CAD qui reçoit sa valeur du nombre entré par l'utilisateur
                double livre = cad * LIVRE_PAR_DOLLAR;
                    // Création d'une objet double appelé livre qui reçoit sa valeur par multipliant cad et LIVRE_PAR_DOLLAR
                double euro = cad * EURO_PAR_DOLLAR;
                    // Création d'une objet double appelé euro qui reçoit sa valeur par multipliant cad et EURO_PAR_DOLLAR
                System.out.println(df.format(cad) + "$ canadiens équivaut " + df.format(livre) + "$ livres britanniques et " + df.format(euro) + "$ Euros");
                    // Imprime une déclaration qui présente les réponses à l'utilisateur
                i = true;
                    // Ceci termine la boucle qui termine également le programme entier
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
