package Tache5;

import java.util.List;

public class Travaux3 {
    public static void main(String[] args){
        int num_month = (int) (1 + Math.random()*13);

        var month_list = List.of("Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre");


        System.out.printf("%s correspond à %s", num_month, month_list.get(num_month-1));
    }
}
