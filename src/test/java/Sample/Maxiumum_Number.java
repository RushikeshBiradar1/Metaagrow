package Sample;

public class Maxiumum_Number {
	public static void main(String[] args) {
//		int [] a={1,45,75,2,45};
//		int max=a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println(max);
//	}

	
	//2nd Largest no
//		int [] a= {1,2,3,4,5};
//		int max=a[0];
//		int second_max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				second_max=max;
//				max=a[i];
//			}
//			else if (a[i]>second_max && a[i]!=max)
//			{
//				second_max=a[i];
//			}
//		}
//		System.out.println(second_max);
	
			int a[]= {2,35,57,7};
			int max=a[0];
			int smax=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
				{
					smax=max;
					max=a[i];
				}
				else if(a[i]>smax && a[i]!=max)
				{
					smax=a[i];
				}
			}
			System.out.println(smax);
}
	
}
