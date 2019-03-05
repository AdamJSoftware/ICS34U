public class Table {
    public double i;
    public double i2;
    public double i3;
    public void main(String[] args){
        i = 0;
        System.out.println("a\ta^2\ta^3");
        while(i != 4){
            i ++;
            i2 = Math.pow(i,2);
            i3 = Math.pow(i, 3);
            System.out.println(i + "\t" + i2 + "\t" + i3);
        }

    }
}
