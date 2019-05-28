/*
Adam Jasniewicz                                                                                         le 22 mai 2019

                                  Évaluation sommative - Techniques de programmation 2
                                  But: Demander à l'utilisateur d'entrer deux charactères
                                  qui représente le programme suivi à l'université
                                  et l'année d'étude. Le programme imprime ensuite le
                                  titre du programme et l'année d'étude correspondante
 */
package EvaluationSommative3;

import java.util.Scanner;

public class Travaux2 {
    public static void main(String[] args){
        // Imprimez le résultat du fonction get
        System.out.print(get());

    }
    private static String get(){
        // Créationz d'une fonction appelée get qui retourne un string
        Scanner input = new Scanner(System.in);
        // Création d'un object Scanner appelé input. Ceci prends l'entrée de l'utilisateur et le stocke temporairement dans une variable
        System.out.print("Entre deux charactères: ");
        // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
        String in = input.next();

        while (true) {
            // Une boucle qui demande constamment à l'utilisateur une entrée jusqu'à ce qu'un résultat valide soit entrée
            if (in.length() == 2) {
                // Ce instruction if va fair le suivant si l'entrée a une longuer de 2
                in = in.toUpperCase();
                // Convertit le String en Upper case
                String dp = numb(in);
                // déclare un variable dp (deuxième partie) qui est égal à le résultat de numb
                if (dp != null) {
                    // Ce instruction if va fair le suivant si dp n'est pas égal a null
                    switch (in.charAt(0)) {
                        // Instruction switch qui détermine quoi faire a partir du premier charactère du valeur in
                        case 'M':
                            // Si la valeur est égale a M. Retourne le résultat
                            return String.format("Mathématiques %s", dp);
                        case 'C':
                            // Si la valeur est égale a C. Retourne le résultat
                            return String.format("Sciences informatiques %s", dp);
                        case 'G':
                            // Si la valeur est égale a G. Retourne le résultat
                            return String.format("Génie %s", dp);
                    }
                }
            }
            System.out.print("Entrée non valide. Essayer encore: ");
            // Imprime une déclaration qui dit à l'utilisateur quoi d'entrer
            in = input.next();
            // Créer un valeur String appelé in qui prend la valeur entrée par l'utilisateur
        }
    }

    private static String numb(String in){
        // Créationz d'une fonction appelée numb qui retourne un string
        switch(in.charAt(1)){
            // Instruction switch qui détermine quoi faire a partir du deuxième charactère du valeur in
            case '1':
                // Si la valeur est égale a 1. Retourne ce résultat
                return "première année.";
            case '2':
                // Si la valeur est égale a 2. Retourne ce résultat
                return "deuxième année.";
            case '3':
                // Si la valeur est égale a 3. Retourne ce résultat
                return "troisième année.";
            case '4':
                // Si la valeur est égale a 4. Retourne ce résultat
                return "quatrième année.";
            default:
                // Si la valeur n'est pas égale a 1,2,3 ou 4. Retourne null
                return null;
        }
    }
}
