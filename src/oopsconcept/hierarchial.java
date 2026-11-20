package oopsconcept;

	class A
	{
		public void barking()
		{
			System.out.println("Dog is barking");
		}
	}
	class B extends A
	{
		public void sleeping()
		{
			System.out.println("cat is sleeping");
		}
	}
	class c extends A
	{
		public void roaring()
		{
			System.out.println("tiger is roaring");
		}

public class hierarchial{
	public static void main(String[] args) {
     c a=new c();
     a.barking();
     a.roaring();

	}
}
	}
