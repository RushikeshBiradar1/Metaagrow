package Sample;

import java.util.LinkedHashSet;

public class duplicateint {
//	public static void main(String[] args) {
//		//remove duplicate
//		int a[]= {1,2,3,1,2};
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			set.add(a[i]);
//		}
//		for(int n:set)
//
//	{
//			System.out.print(n); 
//		}
//	}
//	public static void main(String[] args) {
//		String []a= {"Rushikesh", "Biradar", "Rushikesh"};
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for(int i=0;i>a.length;i++)
//		{
//			
//		}
//	}
	
	public static void main(String[] args) {
		int a=11;
		boolean flag=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
	
		}}
	}