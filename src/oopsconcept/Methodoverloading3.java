package oopsconcept;
//changing the no of parameters

public class Methodoverloading3 {
	public void add(int a)
	{
		double value=a;
		System.out.println(value);
	}
	public void add(double a,double b)
	{
		double value=a+b;
		System.out.println(value);
		
	}

	public static void main(String[] args) {
		Methodoverloading3 obj= new Methodoverloading3();
		obj.add(5);
		obj.add(4.5, 5.5);
	
	}

}
