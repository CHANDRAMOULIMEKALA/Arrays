package BasicArray;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("enter the elements:");
		int a[]=new int[n];
		int d[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) 
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						for(int k=j;k<n;k++)
						{
							a[k]=a[k+1];
						}
					}
					j--;
				n--;
					
				}		
		}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]);
			}
		
	}

}
