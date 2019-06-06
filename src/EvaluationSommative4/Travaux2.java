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
        // Création d'un object Decimal Format appelé df. Ceci aide pour arrondir le montant décimal
        DecimalFormat df2 = new DecimalFormat("#0.000");
        // Création d'un object Decimal Format appelé df2. Ceci aide pour arrondir le montant décimal
        System.out.println("Pieds\t\t\tMètres\t|\tMètres\t\t\t\tPieds");
        // Imprime les noms des colonnes
        for (double i = 1; i<=10;i++){
            // Création d'un loupe for qui imprime des données jusqu'à i (incrément de 1) est égale a 10
            double k = (i-1)*5+20;
            // Création d'un double k qui est égale à (i-1)*5+20
            System.out.printf("%s\t\t\t\t%s\t|\t%s\t\t\t\t%s\n",(int)i,df2.format(i*0.305),df.format(k),df2.format(k*3.279));
            // Imprimé un tableau. Premier colonne est égale a i, deuxième est égale a i*0.305 (conversion de pieds en mètres)
            // Le troisième est égale a k et le dernier est égale à k*3.279 (conversion de mètres en pieds)
        }
    }
}
