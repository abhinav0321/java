/*WAP to implement method overloading*/

class OverLoading
{
void sum (int a, int b)
{
System.out.println("The sum is "+(a+b));}

void sum(double a, double b){
System.out.println("The sum is "+(a+b));}

public static void main(String args[]){

OverLoading obj=new OverLoading();
obj.sum(5,5);
obj.sum(6.3,5.2);

}

}