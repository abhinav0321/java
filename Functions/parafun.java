import java.util.Scanner;
class parafun{
    int x,y;
    void show ()
    {
        System.out.print(x+y);
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        parafun obj=new parafun();
        obj.x=input.nextInt();
       obj.y=input.nextInt();
       obj.show();        

    }
}