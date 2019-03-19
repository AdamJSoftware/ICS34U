package Tache2;
import java.util.Scanner;

public class ConversionFahrenheitCelsius {
    public static void main (String[] args){
        boolean j = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre température en Fahrenheit: ");
        while (!j){
            if(input.hasNextDouble()){
                double fahrenheit = input.nextDouble();
                double celsius = (5.0/9)*(fahrenheit-32);
                System.out.println(fahrenheit + " degres Fahrenheit equivaut a " + celsius + " degres celsius");
                j = true;
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }

    }
}
