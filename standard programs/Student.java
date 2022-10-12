
// define a class Student with data members string name ,int age and CGPA. Read the value for this variables from the user and display the result.
import java.util.Scanner;

class Student {

    String name;
    int age;
    float CGPA;

    public static void main(String args[]) {

        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:- ");
        s1.name = input.next();
        System.out.println("Hey " + s1.name + " please enter your age:- ");
        s1.age = input.nextInt();
        System.out.println("Enter your CGPA:- ");
        s1.CGPA = input.nextFloat();

        System.out.println("Name " + s1.name + "\nAge:- " + s1.age + "\nCGPA:- " + s1.CGPA);
    }
}