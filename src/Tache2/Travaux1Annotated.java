package Tache2;
import java.util.Scanner;

public class Travaux1Annotated {
    public static void main (String[] args){
        final double PI = 3.14159265359;
        //Creating a final (non modifiable) method variable to avoid retyping PI
        double rayon = get_func("r");
        //The radius of the circle (saved as a double) is received by the get_func method. The string "r" is sent to let get_func know that we are looking for the radius
        double longueur = get_func("l");
        //The length of the circle (saved as a double) is received by the get_func method. The string "l" is sent to let get_func know that we are looking for the length

        double aire = Math.pow(rayon, 2) * PI;
        //The air is calculated and saved as a double by putting the radius to the exponent of 2 and multiplying it by PI
        double volume = longueur * aire;
        //The volume is calculated by multiplying the length by the air

        System.out.println("L'aire est " + aire + " et le volume est " + volume);
        //Once all the users provides all the necessary information and everything is caluclated. This mesesage is displayed to the user

    }

    private static double get_func(String value){
        Scanner input = new Scanner(System.in);
        //Creates a new Scanner object called input
        print_func(value);
        //Calls on print_func function and passes it whichever value corresponds to the needed print
        while (true){
            if(input.hasNextDouble()){
                return input.nextDouble();
                //Once the user inputs a double/number. It is returned to main so that it can be calculated
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                //If the user does not input a number. The program notifies the user and asks for them to try again
                input.next();
                //Another user input is asked
            }
        }

    }

    private static void print_func(String value){
        switch (value){
            //This function receives the value provided by (main -> get_func -> print_func) and depending on the value, it prints the following string
            case "l":
                System.out.print("Entre la longueur du cylindre");
                break;
                // If the value is "l". It will print this line
            case "r":
                System.out.print("Entre le rayon du cylindre: ");
                break;
                // If the value is "r". It will print this line
        }
    }
}