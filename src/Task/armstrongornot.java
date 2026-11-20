package Task;

import java.util.Scanner;

public class armstrongornot {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		while(temp!=0)
		{
			int digit=temp%10;
	        int result=1;
		for(int i=1;i<=count;i++)
		{
			result=result*digit;
		}
		sum=sum+result;
        temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println(+num+" is an amstrong number");
		}
		else
		{
			System.out.println(+num+" is not an amstrong number");
		}
	}
}
