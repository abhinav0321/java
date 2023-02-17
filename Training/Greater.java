/* WAP to find greater integer number among three given number */

import java.util.Scanner;

class Greater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three number ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        }

        else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }
    }
}