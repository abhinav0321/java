import java.util.Scanner;

// define a class compute with overloaded methods void add,int add(int,int),double(double,double,double)
public class funadd {

    void add() {
        int x, y;
        System.out.println("Enter two number :- ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        System.out.println("Addition is :- " + (x + y));

    }

    int add(int x, int y) {
        int sumi = x + y;
        return sumi;

    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        int x, y, sumi;
        funadd obj = new funadd();
        Scanner input = new Scanner(System.in);
        obj.add();
        x = input.nextInt();
        y = input.nextInt();
        sumi = obj.add(x, y);

        System.out.println("Addition is " + sumi);
        double a, b, c, sumd;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        sumd = obj.add(a, b, c);
        System.out.println("Addition is " + sumd);

    }
}
