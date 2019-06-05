/*
Adam Jasniewicz                                                                                         le 5 juin 2019

                                  Évaluation sommative - Techniques de programmation 3
                                  But: Écris un programme qui affiche les deux tables
                                  suivants côté à côté
 */
package EvaluationSommative4;

import java.text.DecimalFormat;

public class Travaux2 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#0.00");
        DecimalFormat df2 = new DecimalFormat("#0.000");
        System.out.println("Pieds\t\t\tMètres\t|\tMètres\t\t\t\tPieds");
        for (double i = 1; i<=10;i++){
            double k = (i-1)*5+20;
            System.out.printf("%s\t\t\t\t%s\t|\t%s\t\t\t\t%s\n",(int)i,df2.format(i*0.305),df.format(k),df2.format(k*3.279));
        }
    }
}
