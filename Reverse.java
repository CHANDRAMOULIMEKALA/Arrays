package BasicArray;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("enter the elements:");
		int a[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	for(int i=n-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}

	}

}
