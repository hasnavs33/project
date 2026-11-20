package oopsconcept;
interface whatsapp
{
	int a=90;
	void mute();
	void calls();
	void disconnect();
}
class audiocall implements whatsapp
{

	@Override
	public void mute() {
		System.out.println("whatsapp muted");
		
	}

	@Override
	public void calls() {
		System.out.println("whatsapp calls");
	}

	@Override
	public void disconnect() {
		System.out.println("whatsapp disconnected");
	}
}
	class video implements whatsapp
	{

		@Override
		public void mute() {
		System.out.println("videocall is muted");
			
		}

		@Override
		public void calls() {
		System.out.println("videocall is calling");
			
		}

		@Override
		public void disconnect() {
			System.out.println("videocall is disconnected");			
		}
		
	
	
}


public class interfacepg {

	public static void main(String[] args) {
		audiocall ob=new audiocall();
		ob.mute();
		ob.calls();
		ob.disconnect();
		video ob1=new video();
		ob1.mute();
		ob1.calls();
		ob1.disconnect();
		whatsapp ob2=new audiocall();//reference child class
		ob2.mute();
		ob2.calls();
		ob2.disconnect();
		ob2=new video();
		ob2.mute();
		ob2.calls();
		ob2.disconnect();
		System.out.println(whatsapp.a);
	//	System.out.println(whatsapp.a=10);//final keyword cannot changed
	}

}
