/*
Adam Jasniewicz                                                                                         le 17 juin 2019

                                               Tâche Sommative Final - 1
                                  But: Ce programme lit les information d'un employé
                                  (nom, nombres d'heures, salaire par heur, taxes fédérales
                                  taxes provinciales, retenues sur le salaire) et affiche
                                  les données de la paye.

 */
package Exam;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Travaux1 {
    public static void main(String[] args) {
        // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant décimal
        DecimalFormat df = new DecimalFormat("##.00");

        // Demandez l'utilisateur pour les données
        System.out.print("Entre le nom de l'employé: ");
        String nom = getString();
        System.out.print("Entre le nombre d'heures travaillés pour la semaine: ");
        double heures = get();
        System.out.print("Salaire par heure: ");
        double salaire = get();
        System.out.print("Taxes fédérales (en décimale): ");
        double taxeF = get();
        System.out.print("Taxes provinciales (en décimale): ");
        double taxeP = get();
        System.out.print("Retenues sur le salaire (en décimale): ");
        double retenues = get();
        // Calculez le salaire brut
        double salaireBrut = heures*salaire;
        // Affichez les résultats à l'utilisateur
        System.out.println();
        System.out.printf("Employé: %s\n",nom);
        System.out.printf("Heures travaillés pour la semaine: %s\n", df.format(heures));
        System.out.printf("Salaire par heure: %s\n", df.format(salaire));
        System.out.printf("Salaire brut %s\n", df.format(salaireBrut));
        System.out.println("Déductions: ");
        System.out.printf("Taxes fédérales (%s%%): %s\n", taxeF, df.format(salaireBrut*taxeF));
        System.out.printf("Taxes provinciales (%s%%): %s\n", taxeP, df.format(salaireBrut*taxeP));
        System.out.printf("Retenues (%s%%): %s\n", retenues, df.format(salaireBrut*retenues));
        System.out.printf("Déductions totales: %s", df.format(deduction(salaireBrut, taxeF, taxeP, retenues)));
        System.out.printf("Salaire net: %s\n", df.format(total(salaireBrut, taxeF, taxeP, retenues)));

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

    private static String getString() {
        // Recevoir un string de l'utilisateur (nom)
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static double total(double salaireBrut, double taxeF, double taxeP, double retenues){
        // Calculation du salaire net
        taxeF = salaireBrut*taxeF;
        // Calculez le taxe fédéral imposer
        taxeP = salaireBrut*taxeP;
        // Calculez le taxe provincial imposer
        retenues = salaireBrut*retenues;
        // Calculez les retenues imposer
        return salaireBrut-taxeF-taxeP-retenues;
        // Soustraire tout du salaire brut et retournez la réponse
    }
    private static double deduction(double salaireBrut, double taxeF, double taxeP, double retenues){
        // Calculation du déduction total
        taxeF = salaireBrut*taxeF;
        // Calculez le taxe fédéral imposer
        taxeP = salaireBrut*taxeP;
        // Calculez le taxe provincial imposer
        retenues = salaireBrut*retenues;
        // Calculez les retenues imposer
        return taxeF+taxeP+retenues;
        // Retournez la déduction
    }
}
