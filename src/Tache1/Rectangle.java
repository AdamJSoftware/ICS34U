package Tache1;

import java.text.DecimalFormat;
public class Rectangle {
    public static void main(String[] args){
        double largeur = 4.5;
        double longeur = 7.9;
        double perim = largeur*2 + longeur *2;
        double aire = largeur*longeur;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Largeur = " + largeur);
        System.out.println("Longeur = " + longeur);
        System.out.println("Périmètre = " + perim);
        System.out.println("Aire = " + df.format(aire));
    }
}
