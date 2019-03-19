package Tache2;
import java.util.Scanner;

public class TaxesDeVentes {
    public static void main(String[] args){
        boolean j = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre le montant de l'achat");
        while (!j){
            if (input.hasNextDouble()){
                double montantAchat = input.nextDouble();
                double taxes = montantAchat * 0.13;
                System.out.println("Les taxes de ventes est " + (int) (taxes*100)/100);
                j = true;
            }
            else{
                System.out.println("Insérer un nombre valide... ");
                input.next();
            }
        }


    }
}
