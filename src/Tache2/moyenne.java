package Tache2;
import java.util.Scanner;

public class moyenne {
    public static void main(String[]args){
        double f = 0;
        double k = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number -> ");
        while(input.hasNextDouble()) {
            double i = input.nextDouble();
            f = f + i;
            k++;
            System.out.println("Input number -> ");
        }
        System.out.println("Average = " + f/k);
    }
}

