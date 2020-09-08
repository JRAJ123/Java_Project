import java.util.Date;

public class Main 
{
	
	public static void main(String[] args)
	{
		//Primitive Types
		byte age=20;
		long viewCount=3_123_456_789L;
		float price=10.99f;
		char letter='A';
		boolean isEligible=false;
		
		System.out.println(age);
		System.out.println(viewCount);System.out.println(price);
		System.out.println(letter);
		System.out.println(isEligible);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		byte age1=30;
		Date now=new Date();
		System.out.println(now);
	}

}
