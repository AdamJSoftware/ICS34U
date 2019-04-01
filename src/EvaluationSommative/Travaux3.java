/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                       Évaluation sommative - Programmation élémentaire
 */


package EvaluationSommative;
    // Spécifie dans quel paquet se trouve le programme java

import java.text.DecimalFormat;
    // Importe le package Decimal Format (utilisé pour formater le texte)

public class Travaux3 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat(".##");
            // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant monétaire

        final double ACHAT = 52;
            // Création d'une objet double constante appelé ACHAT pour aider avec la calculation
        final double TAXE_PROVINCIALE = 0.08;
            // Création d'une objet double constante appelé TAXE_PROVINCIALE pour aider avec la calculation
        final double POURBOIRE = 0.15;
            // Création d'une objet double constante appelé POURBOIRE pour aider avec la calculation

        double taxe = ACHAT * TAXE_PROVINCIALE;
            // Création d'une objet double appelé taxe qui reçoit sa valeur par multipliant ACHAT et TAXE_PROVINCIALE
        double pourboire = ACHAT * POURBOIRE;
            // Création d'une objet double appelé pourboire qui reçoit sa valeur par multipliant ACHAT et POURBOIRE
        double total = ACHAT + taxe + pourboire;
            // Création d'une objet double appelé total qui reçoit sa valeur par additionant ACHAT, taxe et pourboire

        System.out.println("Le prix d'achat est " + df.format(ACHAT) + "$");
        // Imprime une déclération qui informe l'utilisateur le valeur de l'achat. Le format décimal est utilisé pour rendre le texte un peu plus propre en limitant le nombre de décimales.
        System.out.println("Le montant de taxe est " + df.format(taxe) + "$");
        // Imprime une déclération qui informe l'utilisateur le valeur du taxe. Le format décimal est utilisé pour rendre le texte un peu plus propre en limitant le nombre de décimales.
        System.out.println("Le montant du pourboire est " + df.format(pourboire) + "$");
        // Imprime une déclération qui informe l'utilisateur le valeur du pourboire. Le format décimal est utilisé pour rendre le texte un peu plus propre en limitant le nombre de décimales.
        System.out.println("Le prix total est " + df.format(total) + "$");
        // Imprime une déclération qui informe l'utilisateur le valeur total de l'achat. Le format décimal est utilisé pour rendre le texte un peu plus propre en limitant le nombre de décimales.
    }
}
