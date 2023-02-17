class Count {
    static int ct;
    int number;

    Count() {
        ct++;
        number = ct;
    }

    void display() {
        System.out.println("My object number is " + number);

    }
}

class day4task2 {

    public static void main(String[] args) {
        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}