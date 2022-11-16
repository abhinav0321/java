import java.util.Scanner;

public class function {
    Scanner input = new Scanner(System.in);

    int x, y;

    void fun() {
        System.out.print(x + y);

    }

    public static void main(String args[]) {
        function obj = new function();
        System.out.println("Enter two number:- ");
        obj.x = obj.input.nextInt();
        obj.y = obj.input.nextInt();
        obj.fun();

    }

}
