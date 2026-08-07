package Sample;

import java.util.LinkedHashSet;

public class Revers_Word {
	 public static void main(String[] args) {

//	        String s = "this is optum india";
//	        String[] words = s.split(" ");
//
//	        for (int i = words.length - 1; i >= 0; i--) {
//	            System.out.print(words[i] + " ");
//	        }
	   
	 
	//prime
//		 int a=23;
//		 boolean flag=true;
//		 for(int i=2;i<=a;i++)
//		 {
//			 if(a%2==0)
//			 {
//				 flag=false;
//				 break;
//			 }
//		 }
//		 if(flag==true)
//		 {
//			 System.out.println("prime");
//		 }
//		 else
//		 {
//			 System.out.println("not prime");
//		 }
	 
		 //count char occurance
//		 String a="rushikesh";
//		 char target='s';
//		 int count=0;
//		 for(int i=a.length()-1;i>=0;i--)
//		 {
//			 if(a.charAt(i)==target)
//			 {
//				 count++;
//			 }
//		 }
//		 System.out.println(count);
		 
		 //remove duplicate characters from string
//		 String a="Rushikesh";
//		LinkedHashSet<Character> set = new LinkedHashSet<>();
//		for(int i=0;i<a.length();i++)
//		{
//			set.add(a.charAt(i)); 
//		}
//		System.out.println(set);
		 
		 String a="Rushikesh Biradar";
		LinkedHashSet set = new LinkedHashSet<>();
		for(int i=0;i<a.length()-1;i++)
		{
			set.add(a.charAt(i));
		}
		 
	 System.out.println(set);
	 }
	
}
