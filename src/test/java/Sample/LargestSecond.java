package Sample;

import java.util.Arrays;

public class LargestSecond {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int max=a[0];
		int secondMax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax && a[i]!=max)
			{
				secondMax=a[i];
			}
		}
System.out.println(secondMax);
	}
	
}
