package BasicArray;

import java.util.Arrays;

import java.util.Scanner;

public class Highestnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("second highest " + (a.length-1));
		System.out.println("second lowest " + a[1]);
		
		
		
	}
}
