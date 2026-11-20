package oopsconcept;
//changing datatypes of parameter

public class Methodoverloading2 {
	public void add(int a,int b)
	{
		double value=a+b;
		System.out.println(value);
	}
	public void add(double a,double b)
	{
		double value=a+b;
		System.out.println(value);
		
	}

	public static void main(String[] args) {
		Methodoverloading2 obj= new Methodoverloading2();
		obj.add(5, 5);
		obj.add(4.5, 5.5);

		
	}

}
