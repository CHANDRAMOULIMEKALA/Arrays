package BasicArray;

import java.util.Scanner;

public class InesertionElement {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("enter the elements:");
		int a[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("insert of element index value:");
		int ii=s.nextInt();
		System.out.println("Enter the insert Element:");
		int ie=s.nextInt();
		for(int i=n-1;i>=ii-1;i--)
		{
			a[i+1]=a[i];
		}
		a[ii-1]=ie;
		for(int j=0;j<n+1;j++)
		{
			System.out.print(a[j]+",");
		}
	}

}
