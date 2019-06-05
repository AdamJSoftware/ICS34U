/*
Adam Jasniewicz                                                                                         le 3 juin 2019

                                  Évaluation sommative - Techniques de programmation 3
                                  But: Afficher un tableau de l'utilisateur du nombre
                                  de payements qu'il doit faire, ansi que son intérêt,
                                  son principal et son balance référence aux données

 */
package EvaluationSommative4;
// Spécifie dans quel paquet se trouve le programme java
import java.util.Scanner;
// Importe le package scanner (utilisé pour obtenir l'entrée d'utilisateur)
import java.text.DecimalFormat;
// Importe le package Decimal Format (utilisé pour formater le texte)

public class Travaux3 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("Montant du prêt: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double montant_initial = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        System.out.print("Nombre d'années: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double annee = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        System.out.print("Taux d'intérêt annuel: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        double interetAnnuel = get();
        // Création d'une variable double appelé cotes qui est égal à le résultat de get
        double TIM = interetAnnuel/1200;
        // calcule le total d'intérêt mensuel
        double pM = (montant_initial*TIM)/(1-Math.pow((1+TIM),(-annee*12)));
        // calcule le paiement mensuel
        System.out.printf("Paiement mensuel: %s\n", df.format(pM));
        // Imprime le paiement mensuel pour l'utilisateur
        System.out.printf("Paiement total: %s\n", df.format(pM*12));
        // Imprime le paiement total (pM*12) pour l'utilisateur
        double balance = montant_initial;
        System.out.println("Paiement#\t\t\tIntérêt\t\t\t\tPrincipal\t\t\tBalance");
        for(double i = 1; i <= annee*12; i++){
            TIM = interetAnnuel/1200;
            pM = (montant_initial*TIM)/(1-Math.pow((1+TIM),(-annee*12)));
            double interet = TIM*balance;
            double montantPrincipal = pM - interet;
            balance = balance - montantPrincipal;
            System.out.printf("%s\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\n",(int)i,df.format(interet),df.format(montantPrincipal), df.format(balance));
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
