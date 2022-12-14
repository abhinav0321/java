import java.util.Scanner;

/*
 * Define a class base wth data memberd string name, int age and member function
 * getBaseData()
 * and showbasedata method.
 * Define another class with data members string branch,int semester and member
 * functions are
 * get child data and showchilddata.Child is a derived class from base
 * initialize object
 * of the child class and access all its member methods as well as member method
 * of base class
 * to show the existence of inheritance among them.
 */
class inheritB {

    String name;
    int age;

    void getBaseData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();

    }

    void showbasedata() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

}

class inherit extends inheritB {
    String branch;
    int semester;

    void getChildData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your branch: ");
        branch = sc.nextLine();
        System.out.println("Enter your semester: ");
        semester = sc.nextInt();

    }

    void showChilData() {
        System.out.println("Branch :" + branch);
        System.out.println("Semester :" + semester);
    }

    public static void main(String[] args) {
        inherit obj = new inherit();
        obj.getBaseData();
        obj.getChildData();
        obj.showbasedata();
        obj.showChilData();

    }
}
