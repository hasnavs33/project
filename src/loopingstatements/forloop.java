package loopingstatements;

public class forloop {
	public static void main(String[]args)
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Hasna");
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*5="+i*5);
		}
	}

}
