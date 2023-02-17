class staticE
{
	static String="SISTec";
	int roll;
	String name;

	staticE(){
	System.out.println("Enter name: ");
	Scanner sc=new Scanner(System.in);
	name=sc.next();
	System.out.println("Enter roll: ");
	roll=sc.nextInt();
	}

	void display()
	{
	System.out.println("Name: "+name);
	System.out.println("Roll no: "+roll);
	System.out.println("College: "+college);
	}
}

class StaticExample {

    public static void main(String args[]) {
        staticE s1 = new staticE();

    }
}