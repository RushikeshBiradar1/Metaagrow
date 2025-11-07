package Sample;

public class Palind {
	public static void main(String[] args) {
		 int a=121, temp=a, rev=0;
				 while(temp>0)
				 {
					 int i=temp%10;
					 temp=temp/10;
					 rev=rev*10+i;
				 }
				 if (a==rev)

	{
					 System.out.println("palinn");
				 
	}
	
	else
	{
		System.out.println("Not Pali");
	}
	}
}
