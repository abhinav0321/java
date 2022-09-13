import java.util.Scanner;

class Firstinputinjava {

    public static void main(String a[]) {
        int in1;
        float in2;
        double in3;
        String in4;
        Scanner cin = new Scanner(System.in);
        in1 = cin.nextInt();
        in2 = cin.nextFloat();
        in3 = cin.nextDouble();
        in4 = cin.next();
        System.out.println(in1 + " " + in2 + " " + in3 + " " + in4);

    }

}