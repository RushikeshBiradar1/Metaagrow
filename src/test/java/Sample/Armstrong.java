package Sample;

public class Armstrong {
public static void main(String[] args) {
	int a=153, temp=a, rev=0;
	while(temp>0)
	{
		int i=temp%10;
		temp=temp/10;
		rev=rev+(i*i*i);
	}
	if(a==rev)
	{
		System.out.println("Arm");
	}
	else
	{
		System.out.println("not arm");
	}
}
	
//	public static void main(String[] args) {
//		int a=121, b=a, rev=0;
//		while(b>0)
//		{
//			int i=b%10;
//			b=b/10;
//			rev=rev*10+i;
//			
//		}
//		if(rev==a)
//		{
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//	}
	}