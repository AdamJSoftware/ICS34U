package Tache2;
import java.util.Scanner;

public class Travaux3 {
    private static double VALEUR = 4184;
    public static void main (String[] args){
        boolean j = false;
        System.out.print("Cherchez vous l'énergie(e), la masse(m) de l'eau, la température initial(i) ou final(f) de l'eau? -> ");
        Scanner input = new Scanner(System.in);
        while(!j){
            if (input.hasNext("e")){
                energie_func();
                j = true;
            }
            else if (input.hasNext("m")){
                mass_func();
                j = true;
            }
            else if (input.hasNext("f")){
                final_func();
                j = true;
            }
            else if (input.hasNext("i")){
                initial_func();
                j = true;
            }
            else{
                System.out.println("Insérer un réponse valide... ");
                input.next();
            }
        }
    }

    private static void energie_func(){
        double m = print_func("m");
        double ti = print_func("i");
        double tf = print_func("f");

        double Q = m*(tf - ti)*VALEUR;
        System.out.println("L'énergie necessaire est: " + Q + " joules");
    }

    private static void mass_func(){
        double Q = print_func("e");
        double ti = print_func("i");
        double tf = print_func("f");

        double m = Q/ ((tf - ti) * VALEUR);
        System.out.println("Le montat d'eau nécessaire est: " + m + " kilogrammes");
    }

    private static void final_func(){
        double m = print_func("m");
        double Q = print_func("e");
        double ti = print_func("i");

        double tf = Q/(m*VALEUR) + ti;
        System.out.println("La température final est: " + tf + " celsius");

    }

    private static void initial_func(){
        double m = print_func("m");
        double Q = print_func("e");
        double tf = print_func("f");

        double ti = -Q/(m*VALEUR) + tf;
        System.out.println("La température initial est: " + ti + " celsius");
    }

    private static double print_func(String Value){
        Scanner input = new Scanner(System.in);
        print_get(Value);
        while(true){
            if (input.hasNextDouble()){
                return input.nextDouble();
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }
    }

    private static void print_get(String value) {
        switch (value) {
            case "i":
                System.out.print("Entre la température initial de l'eau en celsius -> ");
                break;
            case "f":
                System.out.print("Entre la température final de l'eau en celsius -> ");
                break;
            case "e":
                System.out.print("Entre la quantité d'énergie en joules -> ");
                break;
            case "m":
                System.out.print("Entre la quantité d'eau en kg -> ");
                break;
        }
    }
}
