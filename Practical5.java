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
		int fact = 2;
		
		if(number < 0)
		{
			return -1 ;
		}
		else if(number == 1 || number == 0)
		{
			return 1;
		}
		else
		{
			for( ; number > 2 ; fact *= number--)
			{
				
			}
			return fact ; 
		}
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
