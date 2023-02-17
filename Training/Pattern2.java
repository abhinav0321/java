import java.util.Scanner;

class Pattern2{

public static void main (String args[])
{
int num;
Scanner sc=new Scanner(System.in);

System.out.println("Enter any number : ");
num=sc.nextInt();

for(int i=num; i>0;i--)
{
for (int j=0; j<i;j++){
System.out.print("*");
}
System.out.println("");
}


}

}