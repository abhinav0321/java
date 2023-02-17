import java.util.Scanner;

class Pattern1{

public static void main (String args[])
{
int num;
Scanner sc=new Scanner(System.in);

System.out.println("Enter any number : ");
num=sc.nextInt();

for(int i=0; i<num;i++)
{
for (int j=0; j<=i;j++){
System.out.print("*");
}
System.out.println("");
}


}

}