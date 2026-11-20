package oopsconcept;
//changing oder of parameter

public class Methodoverloading {
	public void add(int a,double b)
	{
		double value=a+b;
		System.out.println(value);
	}
	public void add(double a,int b)
	{
		double value=a+b;
		System.out.println(value);
		
	}

	public static void main(String[] args) {
		Methodoverloading obj= new Methodoverloading();
		obj.add(5, 6.6);
		obj.add(4.5, 5);

	}

}
