class Practical5
{

	public static void main(String args[] )
	{
		int result = factorial1(5);
		System.out.println(result);
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
}
