interface Drawable{
default void draw() {
	System.out.println("Hello");
	square();
	}

	private void square(int a)
	{System.out.println("Private");
	}

}


class staticP implements Drawable{

	

	public static void main (String args[]){
		staticP obj=new staticP();
		obj.draw();
		
		}
}