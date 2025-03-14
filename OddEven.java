package BasicArray;

import java.util.Scanner;

public class OddEven {

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
		int e[]=new int[n];
		int o[]=new int[n];
		int j=0,k=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				e[j]=a[i];
				j++;
			}
			else
			{
				o[k]=a[i];
				k++;
			}
	}
		System.out.println("Even");
		if(j>=1)
		{
		for(int i=0;i<j;i++)
		{
			System.out.println(e[i]+",");
		}
		}
		else
		{
			System.out.print("No even Numbers");
		}
		System.out.println("odd");
		if(k>=1)
		for(int i=0;i<k;i++)
		{
			System.out.print(o[i]+",");
		}
		else
		{
			System.out.println("No odd elements");
		}
	}
}
