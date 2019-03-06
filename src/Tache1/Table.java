package Tache1;

public class Table {
    public static void main(String[] args){
        int i = 0;
        System.out.println("a\ta^2\ta^3");
        while(i != 4){
            i++;
            double d2 = Math.pow(i,2);
            double d3 = Math.pow(i,3);
            int i2 = (int) Math.round(d2);
            int i3 = (int) Math.round(d3);
            System.out.println(i + "\t" + i2 + "\t" + i3);
        }

    }
}
