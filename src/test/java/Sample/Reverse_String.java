package Sample;

import java.util.HashSet;

import lombok.ToString;

public class Reverse_String {

	public static void main(String[] args) {

		String a="MY NAME IS Rushikesh";
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}
}
