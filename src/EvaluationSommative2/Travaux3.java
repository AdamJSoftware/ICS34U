/*
Adam Jasniewicz                                                                                         le 1 avril 2019

                                  Évaluation sommative - Structure de séléction 1
                                  But: Un programme avec un menu qui affiche et
                                  calcule le coût total de l'achat d'un nombre de
                                  T-Shirts pour une équipe de Hockey
 */

package EvaluationSommative2;
// Spécifie dans quel paquet se trouve le programme java
import java.util.Scanner;
// Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)
import java.text.DecimalFormat;
// Importe le package Decimal Format (utilisé pour formater le texte)

public class Travaux3 {
    final private static double TAX = 1.13;
    // Créer un variable privée pas modifiable double appelé Tax avec un valeur de 1.13
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant décimal
        System.out.println("1: Taille grande");
        System.out.println("2: Taille extra grande");
        System.out.println("3: Taille moyen");
        System.out.println("4: Taille petite");
        System.out.println("5: Quitter le programme");
        System.out.print("-> ");
        // Imprimer le menu
        int userInput = getSelection();
        // En utilisant une fonction appelé get. Nous prenous la valeur de l'utilisatuer en forme d'un integer
        System.out.print("Insérer le montant de T-shirts: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double montant = get();
        // En utilisant une fonction appelé get. Nous prenous la valeur de l'utilisatuer en forme d'un double
        double total;
        // L'initialization d'un double appelé total
        switch(userInput){
            // Instruction switch qui détermine quoi faire a partir du valeur userInput
            case 1:
                // Si userInput est null
                total = calcule(25, montant);
                // En utilisant le fonction calcule. On calcule le total a partir du cout et le montant
                System.out.printf("Le prix totale est %s$", df.format(total));
                // Imprime une déclaration qui présente le réponse à l'utilisateur
                break;
                // arrêter l'instruciton switch
            case 2:
                total = calcule(30, montant);
                // En utilisant le fonction calcule. On calcule le total a partir du cout et le montant
                System.out.printf("Le prix totale est %s$", df.format(total));
                // Imprime une déclaration qui présente le réponse à l'utilisateur
                break;
                // arrêter l'instruciton switch
            case 3:
                total = calcule(20, montant);
                // En utilisant le fonction calcule. On calcule le total a partir du cout et le montant
                System.out.printf("Le prix totale est %s$", df.format(total));
                // Imprime une déclaration qui présente le réponse à l'utilisateur
                break;
                // arrêter l'instruciton switch
            case 4:
                total = calcule(15, montant);
                // En utilisant le fonction calcule. On calcule le total a partir du cout et le montant
                System.out.printf("Le prix totale est %s$", df.format(total));
                // Imprime une déclaration qui présente le réponse à l'utilisateur
                break;
                // arrêter l'instruciton switch
        }

    }
    private static int getSelection() {
        // Créationz d'une fonction appelée getSelection qui retourne un double
        Scanner input = new Scanner(System.in);
        // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable
        String in = input.next();
        // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
        while (true) {
            // Une boucle qui demande constamment à l'utilisateur une entrée jusqu'à ce qu'un double soit entré
            try {
                int newIn = Integer.parseInt(in);
                // Essayer de convertir l'entrée de l'utilisateur dans un double

                if (newIn >= 1 && newIn <= 4) {
                    // Ce instruction if va fair le suivant si le discriminant est entre 1 et 4

                    return newIn;
                    // Retourner la valeur integer newIn

                }
                else if (newIn == 5){
                    // Ce instruction if va fair le suivant si le discriminant est supérieur a 5
                    System.exit(0);
                    // Le programme quitte
                }else {
                    // Ce instruction if va fair le suivant si le discriminant est supérieur a 4
                    System.out.print("Insérer un nombre entre 1 et 5: ");
                    // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                    in = input.next();
                    // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
                }
            } catch (NumberFormatException | NullPointerException nfe) {
                // Si la valeur string ne peut pas être converti en double
                System.out.print("Insérer un nombre valide: ");
                // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
                in = input.next();
                // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
            }
        }
    }
    private static double get() {
        // Créationz d'une fonction appelée get qui retourne un double
        Scanner input = new Scanner(System.in);
        // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable
        String in = input.next();
        // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
        while (true){
            // Une boucle qui demande constamment à l'utilisateur une entrée jusqu'à ce qu'un double soit entré
            try{
                double doubleIn = Double.parseDouble(in);
                // Essayer de convertir l'entrée de l'utilisateur dans un double
                if (doubleIn > 0){
                    // Ce instruction if va fair le suivant si le discriminant est supérieur a 0
                    return doubleIn;
                    // Retourner la valeur double doubleIn
                }
                else{
                    System.out.print("Insérer un nombre double: ");
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
    private static double calcule(double cout, double montant){
        return cout*montant*TAX;
        // retourne le total du cout * le montant * le tax

    }
}
