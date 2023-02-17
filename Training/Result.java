import java.util.Scanner;

class Students {
    int roll_no;
    String name;
     void getName(){
       Scanner sc = new Scanner(System.in);
     System.out.println("Enter name: ");
      name=sc.next();
   System.out.println("Enter roll: ");
      roll_no=sc.nextInt();
}
}

class Marks extends Students {
    int m1, m2, m3, m4, m5, m6;
}

class Result extends Marks {
    void getData()
    {
        System.out.println("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        m6 = sc.nextInt();
        total_marks=m1+m2+m3+m4+m5+m6;
    }
    int total_marks;

    public static void main(String argsa[]) {
        Result r1 = new Result();
        Scanner sc = new Scanner(System.in);
        r1.getName();
        r1.getData();		
        System.out.println("Name " + r1.name);
        System.out.println("Roll number " + r1.roll_no);
        System.out.println("total Marks " + r1.total_marks);

    }
}
