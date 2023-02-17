import java.util.Scanner;

class evenArray{

public static void main (String args[])
{
int num[]=new int[5];
Scanner sc=new Scanner(System.in);

for(int i=0;i<5;i++)
{
System.out.println("Enter number : ");
num[i]=sc.nextInt();
}

System.out.println("Even numbers in array are :");
for(int i=0;i<5;i++){
if(num[i]%2==0)
{System.out.print(num[i]+" "); }}

}}