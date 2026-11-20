package controlstatements;

import java.util.Scanner;

public class multiplearraytask {
			public static void main(String[] args) {
				String ar[][]=new String[2][3];
				Scanner sc=new Scanner(System.in);
				System.out.println(" enter your number:");
				for(int i=0;i<2;i++) {
					for(int j=0;j<3;j++) {
						ar[i][j]=sc.next();
					}
				}
				System.out.println("entered numbers are:");
				for(String a[]:ar) {
					for(String v:a)
					{
						System.out.print(v+" ");
					}
					System.out.println();

		}

	}

}
