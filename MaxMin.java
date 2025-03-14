package BasicArray;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum number is :"+max);
		int min=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minmum number is :"+ min);
	}

}
