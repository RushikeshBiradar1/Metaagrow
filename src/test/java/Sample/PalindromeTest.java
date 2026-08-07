package Sample;

public class PalindromeTest {
	public static void main(String[] args) {
//		int a=121, temp=a, rev=0;
//		while(temp>0)
//		{
//			int i=temp%10;
//			temp=temp/10;
//			rev=rev*10+i;
//		}
//		if(rev==a)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not palindrome");
//		}
//	}
		
		int a=1535, temp=a, rev=0;
		while(temp>0)
		{
			int i=temp%10;
			temp=temp/10;
			rev=rev+(i*i*i);
		}
		if(rev==a)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

}
}
