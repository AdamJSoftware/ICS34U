package EvaluationSommative2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Travaux1 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("b^2-4ac\n");
        System.out.print("Insérer le valeur de 'a': ");
        double valeurA = get();
        System.out.print("Insérer le valeur de 'b': ");
        double valeurB = get();
        System.out.print("Insérer le valeur de 'c': ");
        double valeurC = get();

        double discriminant = getDiscriminant(valeurA, valeurB, valeurC);
        if (discriminant > 0){
            double racine1 = getRacine("+", valeurA, valeurB, valeurC);
            double racine2 = getRacine("-", valeurA, valeurB, valeurC);
            System.out.printf("L'équation admet deux racines: %s et %s", df.format(racine1), df.format(racine2));

        }
        else if(discriminant == 0){
            double racine1 = getRacine("null", valeurA, valeurB, valeurC);
            System.out.printf("L'équation admet une seule racine: %s", df.format(racine1));

        }
        else{
            System.out.println("L'équation admet aucune racine réelle");

        }
    }

    private static double get() {
        Scanner input = new Scanner(System.in);

        while (true) {
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.print("Insérer un nombre valide: ");
                input.next();
            }
        }
    }

    private static double getDiscriminant(double valeurA, double valeurB, double valeurC){
        return Math.pow(valeurB, 2) - 4*valeurA*valeurC;

    }
    private static double getRacine(String toDo ,double valeurA, double valeurB, double valeurC){
        double racine = 0;
        switch (toDo){
            case "null":
                racine = -valeurB / 2*valeurA;
                break;
            case "+":
                racine =  (-valeurB + Math.pow(Math.pow(valeurB,2) -4*valeurA*valeurC,0.5))/2*valeurA;
                break;
            case "-":
                racine =  (-valeurB - Math.pow(Math.pow(valeurB,2) -4*valeurA*valeurC,0.5))/2*valeurA;
                break;
        }
        return racine;
    }
}
