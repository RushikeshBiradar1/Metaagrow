package Sample;

import java.util.LinkedHashSet;

public class All_Java_Programs {

	public static void main(String[]args)
	{
//		palindrome();
//		Armstrong();
//		reverseString();
//		ReverseWord();
//		removeDuplicateChar();
//		CountDuplicateCharOccurance();
//		UpperToLowerchar();
//		MaxNumber();
		primeNumber();		
//		Fabonecci();
//		Right_Triangle_Star_Pattern();
//		Reverse_Right_Angled_Triangle_Pattern();
//		Pyramid_Star_Pattern();
//		InvertedPyramid();
//		SmaxNumber();
		
	}

	// Palindrome
	public static void palindrome()
	{
		int a=121, temp=a, rev=0;
		while(a>0)
		{
			int i=a%10;
			a=a/10;
			rev=rev*10+i;

		}
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not pllindrome");
		}

	}	

	//Armstrong
	public static void Armstrong()
	{
		int a=153, temp=a, rev=0;
		while(a>0)
		{
			int i=a%10;
			a=a/10;
			rev=rev+(i*i*i);
		}
		if(rev==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	
	public static void reverseString()
	{
		String a="Rushikesh";
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			System.out.print(a.charAt(i));
//		}
		String rev = new StringBuilder(a).reverse().toString();
		System.out.println(rev);
	}
	
	public static void ReverseWord()
	{
		String a="Rushikesh Biradar";
		String[] b=a.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}
	
	public static void removeDuplicateChar() {
		String a="i Love Java";
		LinkedHashSet set = new LinkedHashSet<>();
		for(int i=0;i<a.length()-1;i++)
		{
			set.add(a.charAt(i));
		}
		System.out.println(set);
	}
	
	public static void CountDuplicateCharOccurance()
	{
		String a="Rushikesh Biradar";
		
		int count=0;
		for(int i=a.length()-1;i>=0;i--)
		{
			if(a.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("count of a"+count);
	}
	
	public static void UpperToLowerchar()
	{
		String a="Rushikesh Biradar";
		String b="";
		for(char ch:a.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				b=b+Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				b=b+Character.toUpperCase(ch);
			}
			else
			{
				b=b+ch;
			}
		}
		System.out.println(b);

	}
	
	public static void MaxNumber()
	{
		int [] a= {1,4,5,9,6};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}
	
	public static void SmaxNumber()
	{
		int []a= {2,3,5,7,9,8};
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
	
	//Prime Number
	public static void primeNumber()
	{
		int a=2;
		boolean flag=true;
		if(a<=1)
		{
			flag=false;
		}
		for(int i=2;i<a;i++)
		{
			
		 if(a%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

		
	}
	
	 public static void Fabonecci() {
	        int a = 0, b = 1, c;

	        for(int i = 1; i <= 10; i++) {
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	 
	 public static void Right_Triangle_Star_Pattern()
	 {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	 }
	 
	 public static void Reverse_Right_Angled_Triangle_Pattern()
	 {
		 int n=3;
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void Pyramid_Star_Pattern()
	 {
		 int n=3;
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	 }
	 public static void InvertedPyramid()
	 {
		 int n=3;
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=n;j>i;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=(2*i-1);k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }

}
