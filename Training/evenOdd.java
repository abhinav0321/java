import java.util.Scanner;

/* WAp to find whether given number is even or odd*/
class evenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any number ");
        num = sc.nextInt();
        if (num%2==0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}