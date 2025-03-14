package BasicArray;

public class Descending {

	public static void main(String[] args) 
	{
		int a[]= {4,3,2,5,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp;
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)	
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[a.length-2]);
		System.out.println(a[0]);
	}

}
