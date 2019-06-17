/*
Adam Jasniewicz                                                                                         le 17 juin 2019

                                               Tâche Sommative Final - 2
                                  But: Ce programme affiche un menu sur l'écran.
                                  Si l'utilisateur entre 1, le programme demande
                                  le rayon d'un cercle et affiche le résultat
                                  Si l'utilisateur entre 2, le programme demande
                                  pour la longeur et largeur d'un rectangle
                                  et affiche le résultat
                                  Si l'utilisateur entre 3, le programme demande
                                  pour la base et hateur d'un triangle
                                  et affiche le résultat
                                  Si l'utilistaur entre 4, le programme quitte.

 */
package Exam;

import java.util.Scanner;

public class Travaux2 {
    public static void main(String[] args){
        // Imprimez le menu
        System.out.println("1. Calcule l'aire d'un cercle.");
        System.out.println("2. Calcule l'aire d'un rectangle.");
        System.out.println("3. Calcule l'aire d'un triangle.");
        System.out.println("4. Quitter.");

        while (true){
            // Création d'une loop qui ne termine jamais (sauf quand l'utilisateur quitte le programme (4))
            System.out.print(" -> ");
            // Demandez l'utilisateur pour son selection
            int option = getSelection();
            // Recevoir la valeur du selection
            switch (option) {
                // Création d'une loop switch
                case (4):
                    // Si l'utilisateur entre 4
                    System.exit(0);
                    // Quitter le programme
                    break;
                case (3):
                    // Si l'utilisateur entre 3. Demandez pour la base et l'hateur et calculé l'aire d'un triangle
                    System.out.print("Entre la base du triangle: ");
                    double base = get();
                    System.out.print("Entre la hauteur du triangle: ");
                    double hauteur = get();
                    System.out.printf("L'aire du rectangle est égale à %s\n", (base * hauteur) / 2);
                    // Résultat de l'aire est montrez le résultat à l'utilisateur
                    break;
                case (2):
                    // Si l'utilisateur entre 2. Demandez pour la longeur et largeur et calculé l'aire d'un rectangle
                    System.out.print("Entre la longeur du rectangle: ");
                    double longeur = get();
                    System.out.print("Entre la largeur du rectangle: ");
                    double largeur = get();
                    System.out.printf("L'aire du rectangle est égale à %s\n", longeur * largeur);
                    // Résultat de l'aire est montrez le résultat à l'utilisateur
                    break;
                case (1):
                    // Si l'utilisateur entre 1. Demandez pour le rayon et calculé l'aire d'un cercle
                    System.out.print("Entre le rayon du cercle: ");
                    double rayon = get();
                    System.out.printf("L'aire est égale à %s\n", Math.pow(rayon, 2) * Math.PI);
                    // Résultat de l'aire est montrez le résultat à l'utilisateur
                    break;
            }
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
