interface Drawable{
void draw();
default void msg()
{System.out.println("Hello");}

}


class defaultP implements Drawable{

	public void draw(){
		System.out.println("Drawing");
		}

	public static void main (String args[]){
		defaultP obj=new defaultP();
		obj.draw();
		obj.msg();
		}
}