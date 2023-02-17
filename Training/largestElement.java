import java.util.Scanner;

class largestElement{

public static void main (String args[])
{
int num[]=new int[5];
Scanner sc=new Scanner(System.in);

for(int i=0;i<5;i++)
{
System.out.println("Enter number : ");
num[i]=sc.nextInt();
}

int temp;

for(int i=0;i<4;i++){
for (int j=0;j<4;j++){
if(num[i]>num[i+1]){
temp=num[i];
num[i]=num[i+1];
num[i+1]=temp;}
}}


System.out.println(num[4]+" is the largest number in array."); 
}
}