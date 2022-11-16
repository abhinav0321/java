import java.util.Scanner;

public class function_array {
    int Add(int ary[]) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + ary[i];
        }
        System.out.println("Addtion is " + sum);
        return 0;

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int ary[] = new int[5], sum = 0;
        System.out.println("Hey Broo, Enter 5 numbers. :-");
        for (int i = 0; i < 5; i++) {
            ary[i] = input.nextInt();

        }
        function_array obj = new function_array();
        obj.Add(ary);

    }

}
