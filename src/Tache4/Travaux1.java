package Tache4;

import java.util.Scanner;

public class Travaux1 {
    public static void main(String[] args){
        final double CONVERSION_KILO = 0.45359237;
        final double CONVERSION_METRE = 0.0254;

        double livres = prends("l");
        double kilo = livres * CONVERSION_KILO;
        double pouces = prends("p");
        double metre = pouces * CONVERSION_METRE;
        double imc = kilo / Math.pow(metre, 2);

        System.out.println("L'IMC est " + imc);

        if(imc < 18.5){
            System.out.println("Sous-poids");
        }
        else if (imc < 25){
            System.out.println("Poids Normal");
        }
        else if (imc < 30){
            System.out.println("Surpoids");
        }
        else{
            System.out.println("Tu dois faire plus d'exercices physiques");
        }
    }


    private static double prends(String valeur){
        Scanner input = new Scanner(System.in);
        print(valeur);
        while (true){
            if (input.hasNextDouble()){
                return input.nextDouble();
            }
            else{
                System.out.print("Insérer un nombre valide: ");
                input.next();
            }
        }
    }

    private static void print(String valeur){
        switch (valeur){
            case "l":
                System.out.print("Entre le poids en livres: ");
                break;

            case "p":
                System.out.print("Entre la hauteur en pouces: ");
                break;
        }
    }
}
