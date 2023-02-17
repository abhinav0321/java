/* WAP to make a simple calculator for + - * / using switch statement */
import java.util.Scanner;
class Calc
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		float n1,n2;
		System.out.println("Enter two numbers: ");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		int n=1;
		int choice;
		while( n!=0){
		System.out.println("1.Add 2.Sub 3.Div 4.multi");
		choice=sc.nextInt();
		Arth a=new Arth();
		
		
		switch(choice)
		{	
			case 1:
			a.add(n1,n2);
			break;
			case 2:
			a.sub(n1,n2);
			break;
			case 3:
			a.div(n1,n2);
			break;
			case 4:
			a.mult(n1,n2);
			break;

			case 5:
			n=1;
			break;
			default :
			n=0;
			
		}}
	}
}
class Arth
{
	public void add(float a, float b)
	{
		System.out.print((a+b)+" is the sum");
	}
	public void sub(float a, float b)
	{
		System.out.print((a-b)+" is the sub");
	}
	public void div(float a, float b)
	{
		System.out.print((a/b)+" is the div");
	}
	public void mult(float a, float b)
	{
		System.out.print((a*b)+" is the mult");
	}
}