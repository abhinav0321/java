interface ShapeX {
    public String base = "This is shape";

    public void display1();
}

interface ShapeY extends ShapeX {
    public String base = "This is shape 2";

    public void display2();
}

class ShapeG implements ShapeY {
    public String base = "This is a shape";

    public void display1() {
        System.out.println("Circle " + base);
    }

    public void display2() {

        System.out.println("Circle " + base);
    }
}

public class testInterface {
    public static void name(String args[]) {
        ShapeG circle = new ShapeG();
        circle.display1();
        circle.display2();
    }
}