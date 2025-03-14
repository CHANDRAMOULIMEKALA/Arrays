package BasicArray;

import java.util.Arrays;

public class Mock {

	public static void main(String[] args) 
	{
		int a[]=new int[] {0,1,2,3,4,5,6,7,8,9};
		int n=6;
		n=a[a[n]/2];
		System.out.println(a[n]/2);
		Arrays.sort(a);
		System.out.println(a);
	}

}
