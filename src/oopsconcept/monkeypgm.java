package oopsconcept;
interface basicanimal
{
	void cat();
	void sleep();
}
class monkey
{
	void jump() {
		System.out.println("monkey is jumping");
	}
	void bite()
	{
		System.out.println("monkey is biting");
	}
}

	class human extends monkey implements basicanimal{

		@Override
		public void cat() {
			System.out.println("cat is jumping");
		}

		@Override
		public void sleep() {
			System.out.println("human is sleeping");
		}
			
		public void speak()
		{
			System.out.println("human is speaking");
		}
	
}
	
	class monkeypgm
	{
	public static void main(String[] args) {
		human ob=new human();
		ob.cat();
		ob.sleep();
		ob.jump();
		ob.bite();
		
		
	}
		
}