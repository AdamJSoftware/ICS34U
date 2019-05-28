package Tache8;
import java.text.DecimalFormat;
public class Travaux3 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.000");
        System.out.println("Miles\t\tKilomètres");
        for(int n = 1; n <= 10; n++){
            System.out.printf("%s\t\t\t%s\n",n,df.format(n*1.609));
        }
    }
}

