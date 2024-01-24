package GeeksProblems;

public class DataTypes {
    public static void main(String[] args) {
        dataTypes(1, 2, 3.0, 4, (byte) 5);
    }
    static void dataTypes(int a, float b, double c, long l, byte d){

        double p =c/b;
        double q = b/a;
        double r =c/a;
        double m = r+l;
        int s = a/d;

        //Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

    }
}
