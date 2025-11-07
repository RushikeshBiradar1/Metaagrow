package Sample;

public class Maxiumum_Number {
//	public static void main(String[] args) {
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

	
	
	public static void main(String[] args) {
		int a[]= {1,2,5,7};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
