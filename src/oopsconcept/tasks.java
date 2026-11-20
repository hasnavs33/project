package oopsconcept;
abstract class shape
{
	abstract void area();
}
class circle extends shape
{

	@Override
	void area() {
		int r=2; double area;
		area=3.14*r^2;
		System.out.println("area");
		
	}
	
}

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
