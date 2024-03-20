package learningJava;

public class Basic {

     int f=10;
    public static double check(int ac,float b)
    {
        System.out.println("int float");
        int a=3;
        return a;
    }
    public static double check(float b,int c)
    {
        System.out.println("float int");
        int a=3;
        return a;
    }
    public static void main(String[] args) {
        double check = check(1, 1.1f);

    }
}
