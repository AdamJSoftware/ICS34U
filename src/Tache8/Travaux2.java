package Tache8;
import java.text.DecimalFormat;
public class Travaux2 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("Kilogrammes\t\tLivres");
        for(int n = 1; n <= 199; n += 2){
            System.out.printf("%s\t\t\t\t%s\n",n,df.format(n*2.2));
        }
    }
}
