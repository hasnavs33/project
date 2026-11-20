package controlstatements;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers:");
		for(int i=0;i<6;i++) 
		{
		 arr[i]=sc.nextInt();
		}
		System.out.println("entered numbers are:");
		
		for(int i=0;i<6;i++) 
		{
			System.out.println(arr[i]);
		}
		for(int v:arr)//for each
		{
			System.out.println(v);
		}

	}

}
