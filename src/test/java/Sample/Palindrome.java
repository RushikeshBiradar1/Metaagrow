package Sample;

import java.util.LinkedHashSet;

public class Palindrome {
	
public static void main(String[] args) {
 String a="Rushikesh";
 String b="";
LinkedHashSet<String> set = new LinkedHashSet<String>();
for(int i=0;i<a.length();i++)
{
	set.add(String.valueOf(a.charAt(i)));
}
for(String c:set)
{
	b=b+c;
}
System.out.println(b);
 
	
//String s="Rushik64738";
//s=s.replaceAll("[0-9]", "");
//System.out.println(s);
	
	
}

}