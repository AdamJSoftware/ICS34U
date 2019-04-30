/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                  Évaluation sommative - Structure de séléction 1
                                  But: Demander l'utilisateur pour des valeurs et
                                  calculer les valeurs des racines selon le discriminant
 */

package EvaluationSommative2;
// Spécifie dans quel paquet se trouve le programme java
import java.util.Scanner;
// Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)
import java.text.DecimalFormat;
// Importe le package Decimal Format (utilisé pour formater le texte)

public class Travaux1 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant décimal
        System.out.print("Insérer le valeur de 'a': ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double valeurA = get();
        // En utilisant une fonction appelé get. Nous prenous la valeur de l'utilisatuer en forme d'un double
        System.out.print("Insérer le valeur de 'b': ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double valeurB = get();
        // En utilisant une fonction appelé get. Nous prenous la valeur de l'utilisatuer en forme d'un double
        System.out.print("Insérer le valeur de 'c': ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double valeurC = get();
        // En utilisant une fonction appelé get. Nous prenous la valeur de l'utilisatuer en forme d'un double

        double discriminant = getDiscriminant(valeurA, valeurB, valeurC);
        // Créer un variable appelé discriminant qui est égale à la discriminant appartir des données de l'utilisateur de l'utilisateur
        if (discriminant > 0){
            // Ce instruction if va fair le suivant si le discriminant est plus grand que 0
            double racine1 = getRacine("+", valeurA, valeurB, valeurC);
            // Le premier racine est calculé apartir des données de l'utilisateurs en utilisant la fonction getRacine qui est demandé d'utiliser b+...
            double racine2 = getRacine("-", valeurA, valeurB, valeurC);
            // Le deuxième racine est calculé apartir des données de l'utilisateurs en utilisant la fonction getRacine qui est demandé d'utiliser b-
            System.out.printf("L'équation admet deux racines: %s et %s", df.format(racine1), df.format(racine2));
            // Imprime une déclaration qui présente les réponses à l'utilisateur

        }
        else if(discriminant == 0){
            // Ce instruction if va fair le suivant si le discriminant est égale à 0
            double racine1 = getRacine("null", valeurA, valeurB, valeurC);
            // Le racine est calculé apartir des données de l'utilisateurs en utilisant la fonction getRacine qui est demandé d'utiliser l'équation -b/2*a
            System.out.printf("L'équation admet une seule racine: %s", df.format(racine1));
            // Imprime une déclaration qui présente le réponse à l'utilisateur

        }
        else{
            // Ce instruction if va fair le suivant si le discriminant est inférieur à 0
            System.out.println("L'équation admet aucune racine réelle");
            // Imprime une déclaration qui présente le réponse à l'utilisateur

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

    private static double getDiscriminant(double valeurA, double valeurB, double valeurC){
        // Créationz d'une fonction appelée getDiscriminant qui retourne la valeur du discriminant a partir des données de l'utilisatuer
        return Math.pow(valeurB, 2) - 4*valeurA*valeurC;
        // L'équation b^2 - 4ac est calculé et retourné

    }
    private static double getRacine(String toDo ,double valeurA, double valeurB, double valeurC){
        // Créationz d'une fonction appelée getRacine qui retourne la valeur du racine a partir des données de l'utilisatuer
        double racine = 0;
        // L'initialization du valeur double racine
        switch (toDo){
            // Instruction switch qui détermine quoi faire a partir du valeur "toDo"
            case "null":
                // Si toDo est null
                racine = -valeurB / 2*valeurA;
                // la racine est égale a l'équation suivante
                break;
                // arrêter l'instruciton switch
            case "+":
                // Si toDo est +
                racine =  (-valeurB + Math.pow(Math.pow(valeurB,2) -4*valeurA*valeurC,0.5))/2*valeurA;
                // la racine est égale a l'équation suivante
                break;
                // arrêter l'instruciton switch
            case "-":
                // Si toDo est -
                racine =  (-valeurB - Math.pow(Math.pow(valeurB,2) -4*valeurA*valeurC,0.5))/2*valeurA;
                // la racine est égale a l'équation suivante
                break;
        }       // arrêter l'instruciton switch
        return racine;
        // retourner la racine
    }
}
