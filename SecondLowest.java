package BasicArray;

import java.util.Scanner;

public class SecondLowest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("Enter the elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int min=Integer.MAX_VALUE;//45678
		int secmin=Integer.MAX_VALUE;//3456789
		for(int i=0;i<n;i++)//3,4,1,2
		{
			if(a[i]<min)//2<3
			{
				secmin=min;//3
				min=a[i];//1
			}
			else if(a[i]<secmin)
			{
				secmin=a[i];
			}
		}
		System.out.println("lowesr number in an Array :"+min);
		System.out.println("seconed lowest number in an Arrar :"+secmin);
	}

}
