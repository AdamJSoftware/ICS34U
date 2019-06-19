/*
Adam Jasniewicz                                                                                         le 17 juin 2019

                                               Tâche Sommative Final - 5
                                  But: Le programme demande à l'utilisateur d'entrer
                                  une lettre et ensuite affiche le chiffre correspondant
                                  à la lettre tapée. Si l'utilisateur entre 0, le programme
                                  quitte.

 */
package Exam;

import java.util.Scanner;

public class Travaux5 {
    public static void main(String[] args){
        // Cette boucle termine seulement lorsque le fonction get retourne une valeur nulle (lorsque l'utilisateur entre 0)
        // Cette boucle va constament demandez l'utilisateur pour une entrée et va par la suite lui présenter le nombre correspondant
        // Le boucle utilise le fonction get pour recevoir l'entrée de l'utilisateur et le fonction convert pour convertir
        // l'entrée en nombre.
        while (true) {
            System.out.print("Entrez une lettre, ou entrez 0 pour quitter le programme: ");
            String lettre = get();
            if (lettre == null){
                System.exit(0);
            }
            else {
                System.out.printf("Le chiffre correspondant est: %s\n", convert(lettre));
            }
        }
    }
    private static String get() {
        // Ce fonction retourne un charactère ou null (si l'entrée de l'utilisateur est 0). Si l'utilisateur met un
        // entrée invalide. Le fonction demande pour une nouveau entrée
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            char c = in.charAt(0);
            String newC = Character.toString(c);
            if(Character.isLetter(c)){
                return newC.toUpperCase();
            }
            else if (newC.equals("0")){
                return null;
            }
            else{
                System.out.print("Insérer un charactère valide: ");
                in = input.next();
            }
        }
    }
    private static int convert(String lettre){
        // Se fonction prend le charactère donné par le fonction get et avec l'aide d'une structure de selection switch
        // il retourne le nombre correspondant qui est ensuite présenté à l'utilisateur
        switch (lettre){
            case "W" :
                case "X" :
                    case "Y":
                        case "Z":
                            return 9;
            case "T" :
                case "U" :
                    case "V":
                        return 8;
            case "P" :
                case "Q" :
                    case "R":
                        case "s":
                            return 7;
            case "M" :
                case "N" :
                    case "O":
                        return 6;
            case "J" :
                case "K" :
                    case "L":
                        return 5;
            case "G" :
                case "H" :
                    case "I":
                        return 4;
            case "D" :
                case "E" :
                    case "F":
                        return 3;
            case "A" :
                case "B" :
                    case "C":
                        return 2;
            default:
                return 1;
        }
    }
}
