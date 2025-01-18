class Practical5
{

	public static void main(String args[] )
	{
		int result = factorial1(5);
		System.out.println(result);
		
		int result2 = factorial2(6);
		System.out.println(result2);
	}
	
	static int factorial1(int number)
	{
		int fact = 1;
		for(int i = number ; i > 0 ; i--)
		{
			 fact = fact*i;
		}
		return fact ; 
	}
	
	static int factorial2(int number)
	{
		int fact = 1;
		
		while(number > 0)
		{
			fact = fact*number;
			number--;
		}
	return fact;
	}
}
