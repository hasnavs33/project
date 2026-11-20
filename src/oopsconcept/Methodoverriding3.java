package oopsconcept;
class car
{
	public void power()
	{
		System.out.println("power");
	}
	public void speed()
	{
		System.out.println("speed");
	}
}
class Bmw extends car
{

	@Override
	public void power() {
		System.out.println("Bmw is power");
		super.power();
	}

	@Override
	public void speed() {
		System.out.println("Bmw is speed");
		super.speed();
	}
	
}

public class Methodoverriding3 {

	public static void main(String[] args) {
	Bmw b=new Bmw();
	b.power();
	b.speed();
	}

}
