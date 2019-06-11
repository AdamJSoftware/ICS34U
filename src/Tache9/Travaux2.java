package Tache9;

import java.text.DecimalFormat;

public class Travaux2 {
    private static DecimalFormat df = new DecimalFormat("#0.000");
    public static void main(String[] args){
        System.out.println("Pieds\t\t\tMètres\t\t|\t\tMètres\t\t\tPieds");
        for(double n = 1; n <= 10; n++){
            double m = 20+(n-1)*5;
            System.out.printf("%s\t\t\t\t%s\t\t|\t\t%s\t\t\t%s\n",n,piedsEnMetres(n),m,metresEnPieds(m));
        }
    }
    private static String piedsEnMetres(double pied){
        return df.format(0.305 * pied);
    }
    private static String metresEnPieds(double metre){
        return df.format(3.279 * metre);
    }
}
