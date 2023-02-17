import java.util.Scanner;

class Find{

public static void main(String args[]){

int ary[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.print("Enter element ");
for(int i=0; i<5; i++){
ary[i]=sc.nextInt();
}

System.out.println("Enter any number: ");
int num,temp=1;
num=sc.nextInt();

for(int i=0;i<5;i++){
if(ary[i]==num){
temp=0;
System.out.println("it is present on " +(i+1));
break;}}
 
if(temp==1){
System.out.println("Not Found");}

}
}
