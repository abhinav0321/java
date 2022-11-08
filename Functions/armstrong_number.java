package functions;

import java.util.Scanner;
// import java.lang.Math;

public class armstrong {

    void check(double num) {

        double power = 0, sum = 0, temp, a;
        int x, z;
        x = (int) num;
        z = (int) num;
        while (z != 0) {
            power = power + 1;
            z = z / 10;
        }
        for (int i = 0; i < power; i++) {
            temp = x % 10;
            a = (Math.pow(temp, power));
            sum = sum + a;
            x = x / 10;
        }
        if (sum == num) {
            System.out.println("the number is a armstrong number.");
        } else {
            System.out.println("the number is not armstrong.");
        }

    }

    public static void main(String args[]) {
        armstrong ob = new armstrong();
        Scanner input = new Scanner(Snumstem.in);
        Snumstem.out.println("Enter annum number :- ");
        double x;
        x = input.nextDouble();
        ob.check(x);

    }

}
