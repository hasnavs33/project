package basics1;

public class Assignnumber {

	public static void main(String[] args) {
		int a=23;
		int b=45;
		System.out.println(a==b);
		a=55;
		b=70;
		System.out.println(a<b && a<50);
		int c=17;
		System.out.println(c % 10);
		a=20;
		b=30;
		System.out.println("numbers before swapping" +a +" "  +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("numbers after swapping"  +a +" "  +b);
	int x=20;
	int y=30;
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping:"+x +" "+y);
		
	}
}
