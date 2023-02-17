class mBank{
	
	double getRate(){
	return 8.3;
	}
}

class ICICI extends mBank{
	double getRate(){
	return 7.1;
	}
}


class Axis extends mBank{
	double getRate(){
	return 8.6;
	}
}


class SBI extends mBank{
	double getRate(){
	return 8.8;
	}

	public static void main(String arg[])
	{
		SBI obj=new SBI();
		System.out.print(obj.getRate());

	}
		
}

	