class Animal{
String color="white";
Animal(){
System.out.println("Hello");
}
}

class Dog extends Animal{
String color="black";
public void getData(){
System.out.println(color);
System.out.println(super.color);
}

}

class superConstructor{
public static void main(String args[]){
Dog d=new Dog();
d.getData();
}
}
