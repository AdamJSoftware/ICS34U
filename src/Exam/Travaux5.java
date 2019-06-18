package Exam;

import java.util.Scanner;

public class Travaux5 {
    public static void main(String[] args){
        while (true) {
            System.out.print("Entre une lettre: ");
            System.out.printf("Le chiffre correspondant est: %s\n", convert(get()));
        }
    }
    private static String get() {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        while (true) {
            char c = in.charAt(0);
            String newC = Character.toString(c);
            if(Character.isLetter(c)){
                return newC.toUpperCase();
            }
            else{
                System.out.print("Insérer un charactère valide: ");
                in = input.next();
            }
        }
    }
    private static int convert(String lettre){
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
