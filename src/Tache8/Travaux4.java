package Tache8;

import java.text.DecimalFormat;

public class Travaux4 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("Kilogrammes\t\tLivres\t\t|\t\tLivres\t\t\tKilogrammes");
        for(int n = 1; n <= 100; n++){
            int kl = n*2-1;
            double lk = 20+(n-1)*5;
            System.out.printf("%s\t\t\t\t%s\t\t|\t\t%s\t\t\t%s\n",kl,df.format(kl*2.2),df.format(lk),df.format(lk/2.2));
        }
    }
}

