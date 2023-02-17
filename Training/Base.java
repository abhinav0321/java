interface data{

void print();}

class Base implements data{
	public void print(){
	System.out.println("Hello World");
	}
	
	public static void main(String args[]){

	Base b=new Base();
	b.print();
	}
}
	