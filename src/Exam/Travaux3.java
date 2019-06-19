/*
Adam Jasniewicz                                                                                         le 17 juin 2019

                                               Tâche Sommative Final - 3
                                  But: Le programme demande à l'utilisateur pour le
                                  montant invest, le taux d'intérêt annuel et le nombre
                                  d'années. Par la suite, les résultats sont affichées
                                  (année, valeur finale et intérêts)

 */
package Exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Travaux3 {
    public static void main(String[] args){
        // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant décimal
        DecimalFormat df = new DecimalFormat("##.00");
        //Demandez à l'utilisateur d'entrer l'information requis. L'information est pris par la fonciton get
        System.out.print("Entrer le montant investi: ");
        double montant = get();
        System.out.print("Entrer le taux d'intérêt annuel (en décimale): ");
        double taux = get();
        System.out.print("Entrer le nombre d'années: ");
        double temps = get();
        // Les colones du tableau sont créé
        System.out.println("Année\t\tValeur finale\t\tIntérêts");
        // Une loop for est crée pour imprimer les valeurs de chaque année
        for (int i = 1; i <= temps; i++){
            // Le valeur final est calculé avec l'équation (C(1+r)^n
            double vf = montant*Math.pow((1+taux),i);
            // L'intérêt est calculé
            double interet = vf-montant;
            // L'information est présenté à l'utilisateur
            System.out.printf("%s\t\t\t%s\t\t\t%s\n", i, df.format(vf), df.format(interet));
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
