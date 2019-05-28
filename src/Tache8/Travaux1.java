package Tache8;

public class Travaux1 {
    public static void main (String[] args){
        System.out.println("Nombre:\t\tNombre au carré:");
        for(int n=1; n <= 10; n++){
            System.out.printf("%s\t\t\t%s\n",n, (int)Math.pow(n,2));
        }
    }
}
