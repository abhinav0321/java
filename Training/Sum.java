/*WAP to print addition of three integer values (values must be given by the user)*/

import java.util.Scanner;

class Sum{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int num1,num2,num3,result;
System.out.println("Enter three number : ");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
result=num1+num2+num3;
System.out.println("The sum is "+result);

}

}
