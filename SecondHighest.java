package BasicArray;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		System.out.println("Eneter elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int highest=Integer.MIN_VALUE;
		System.out.println(highest);
		int sechighest=Integer.MIN_VALUE;
		System.out.println(sechighest);
		for(int i=0;i<n;i++)
		{
			if(a[i]>highest)
			{
				sechighest=highest;
				highest=a[i];
			}
		}
		System.out.println(highest);
		System.out.println(sechighest);
		
	}

}
