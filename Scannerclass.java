package org.scn;

import java.util.Scanner;

public class ArrayAssendingOrder {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("to enter array length");
		int a = sc.nextInt();
		int a1[]=new int[a];
		System.out.println("To enter integer array value");
		for (int i = 0; i < a1.length; i++) 
		{
			a1[i]=sc.nextInt();
		}
		sc.close();
		int temp=a1[0];
		for (int j = 0; j < a1.length; j++) 
		{
	           for (int k = 0; k < a1.length; k++) 
	           {
					if(a1[j]<a1[k])
					{
					   temp=a1[k];
					   a1[k]=a1[j];
					   a1[j]=temp;
					}
			   }
		}
		System.out.println("the result of given array is : ");
		for (int aa = 0; aa < a1.length; aa++) 
		{
			System.out.print(a1[aa] +" ");

		}
		
	}

}

