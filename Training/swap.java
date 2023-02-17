import java.util.Scanner;
class SExample
{
	public int num1,num2;

	void getData(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number: ");
	num1=sc.nextInt();
	System.out.println("Enter number: ");
	num2=sc.nextInt();
	System.out.println("Before swaping "+num1+" " +num2);
	}
}

class SwapExample extends SExample
{
	public void Swap(){
	getData();
	int c;
	c=num1;
	num1=num2;
	num2=c;
	}
}
class swap 
{
	
	public static void main(String args[])
	{
		SwapExample t=new SwapExample();
		
		t.Swap();
		System.out.println("After swaping "+t.num1+" " +t.num2);
	}

}