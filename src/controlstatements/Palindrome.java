package controlstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
			int n=sc.nextInt();
			int rev=0;
			int temp=n;
			while(n>0)
			{
				int digit=n%10;
				rev=rev*10 +digit;
				n=n/10;
			}
			System.out.println("Reverse="+rev);
			if(rev==temp)
			{
				System.out.println("it is a palindrome");

		}
			else
			{
				System.out.println("it is not a palindrome");

	}


	}

}
