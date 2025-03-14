package BasicArray;

import java.util.Scanner;

import objectArray.Employee;

public class ASCII {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("Enter the elements:");
		char c[]=new char[n];
		for(int i=0;i<n;i++)
		{
			c[i]=s.next().charAt(0);
		}
		System.out.println("S.no"+"		"+"charecter"+"		"+" asciii");
		for(int i=0;i<n;i++)
		{
			int j=i+1;
			System.out.println(j+"		"+ c[i]+"		"+(int)c[i]);
		}
	}
}
