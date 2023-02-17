class Animal{
String color="white";
}

class Dog extends Animal{
String color="black";
public void getData(){
System.out.println(color);
System.out.println(super.color);
}

}

class superCheck{
public static void main(String args[]){
Dog d=new Dog();
d.getData();
}
}
