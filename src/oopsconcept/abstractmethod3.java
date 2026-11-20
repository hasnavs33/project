package oopsconcept;
abstract class vehicle
{
	abstract  void start();
	public void stop()
	{
		System.out.println("stopped");
	}
}
	class car1 extends vehicle
	{

		@Override
		void start() {
			System.out.println("started car");
			
		}
		
	}
	class bike extends vehicle
	{

		@Override
		void start() {
			System.out.println("started bike");
		}
		
	}


public class abstractmethod3 {

	public static void main(String[] args) {
		car1 c=new car1();
		c.start();
		c.stop();
		bike b=new bike();
		b.start();
		b.stop();
	
	}

}
