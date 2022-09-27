
// WAP to take 5 input from the user and find out  largest value
import java.util.Scanner;

public class arrayinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ary[] = new int[5], temp = 0;
        System.out.println("Enter 5 number:- ");
        for (int i = 0; i < 5; i++) {
            ary[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (ary[i] > ary[j]) {
                    temp = ary[i];
                }
            }
        }
        System.out.print("Hello the largest number is " + temp);
    }
}
