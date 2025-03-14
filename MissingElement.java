package BasicArray;

public class MissingElement {

	public static void main(String[] args) {
		int a[]= {4,2,3,5,6};
		int n=a.length+1;
		int total_sum=((n)*(n+1))/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int MissElement=(total_sum)-sum;
		System.out.println(MissElement);

	}

}
