package Tache1;

public class Circle {
    public static void main(String[] args){
        double rayon = 5;
        double pi = 3.14159;
        System.out.println("Rayon = " + rayon);
        double circ = 2*rayon*pi;
        double aire = Math.pow(rayon, rayon)*pi;
        System.out.println("Circonférence = " + circ);
        System.out.println("Aire = " + aire);

    }
}
