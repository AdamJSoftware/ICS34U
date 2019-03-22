package Tache2;
import java.util.Scanner;

public class Travaux2Annotated {
    final private static double VALEUR = 2.205;
    // Creates an unmodifiable double value called VALEUR. Because the scope is static. It can be accessed by any function in this class.
    public static void main (String[] args){
        boolean j = false;
        // Quick way of creating a loop which will end once a specific if statement is reached

        System.out.println("Voulez vous calculez des livres(l) ou des kilogrammes (k)");
        Scanner input = new Scanner(System.in);
        // Creates a scanner object called input

        while (!j){
            // Loop will repeat until the right value is entered by the user
            if (input.hasNext("l")){
                livres_func();
                // main runs the livres_func function
                j = true;
                // If "l" is entered by the user and livres_func has finished. The loop will break and the program will end
            }
            else if (input.hasNext("k")){
                kilogrammes_func();
                // main runs the kilogrammes_func function
                j = true;
                // If "j" is entered by the user and kilogrammes_func has finished. The loop will break and the program will end
            }
            else{
                System.out.println("Insérer un réponse valide... ");
                // if "l" or "k" is not entered. The program will ask the user to input yet again a valid answer
                input.next();
            }
        }
    }

    private static void livres_func (){
        boolean j = false;
        // Quick way of creating a loop which will end once a specific if statement is reached

        Scanner input = new Scanner(System.in);
        // Creates a new scanner object called input. Because this is in a different void/function. It will not be recognized as the same one created in main
        System.out.println("Entre un nombre en livres: ");

        while (!j){
            // Loop will repeat until a number is entered by the user
            if (input.hasNextDouble()){
                double livres = input.nextDouble();
                double kg = livres / VALEUR;
                // The amount of kilograms is determined by dividing the user input by the value defined at the very beginning of the program
                System.out.println(livres + " livres équivant à " + kg + " kilogrammes");
                j = true;
                // Once the users inputs a number. Java calculates how many kilograms (user input) pounds is equal to. And it displays the answer.

            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
                // if a number is not entered. The program will ask the user to input yet again a valid answer
            }
        }
    }

    private static void kilogrammes_func (){
        boolean j = false;
        // Quick way of creating a loop which will end once a specific if statement is reached

        System.out.println("Entre un nombre en kilogrammes: ");
        Scanner input = new Scanner(System.in);
        // Creates a scanner object called input

        while (!j){
            // Loop will repeat until a number is entered by the user
            if (input.hasNextDouble()){
                double kg = input.nextDouble();
                double livres = kg * VALEUR;
                // The amount of pounds is determined by multiplying the user input by the value defined at the very beginning of the program
                System.out.println(kg + " kilogrammes équivant à " + livres + " livres");
                j = true;
                // Once the users inputs a number. Java calculates how many kilograms (user input) pounds is equal to. And it displays the answer.
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
                // if a number is not entered. The program will ask the user to input yet again a valid answer
            }
        }
    }
}
