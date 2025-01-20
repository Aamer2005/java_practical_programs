class Practical5
{

	public static void main(String args[] )
	{
		int result = factorial1(5);
		System.out.println(result);
		
		int result2 = factorial2(6);
		System.out.println(result2);
		
		int arr[] = {1,2,3,4};
		int result3 = getSum(arr);
		System.out.println(result3);
		
		int arr2[] = {1,2,3};
		int result4 = getSum(arr2 );
		System.out.println(result4);
		
		int arr3[] = {1,2,3,-3,2,-4,10};
		int result5 = getSum(arr3);
		System.out.println(result5);
		
		int result6 = factorial3(7);
		System.out.println(result6);
		
		int result7 = factorial3(-3);
		System.out.println(result7);

	}
	
	static int factorial1(int number)
	{
		int fact = 2;
		
		if(number < 0)
		return -1 ;
			
		else if(number == 0)
		return 1;

		else if(number == 1)
		return 1;
		
		else if(number == 2)
		return 2;
		
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
		int fact = 2;
		
		if(number < 0)
		return -1 ;
		
		else if(number == 0)
		return 1;
		
		else if(number == 1)
		return 1;
		
		else if(number == 2)
		return 2;
			
		else
		{
			while(number > 2)
			{
				fact *=number--;
			}
			return fact;
		}
	}
	
	static int factorial3(int number)
	{
		if(number == 0)
		return 1;
		
		else if(number == 1)
		return 1;
		
		else if(number < 0)
		return -1;
		
		else if(number == 2)
		return 2;
		
		else
		return number*factorial3(--number);
	}
	
	
	static int getSum(int[] arr)
	{
		return supportGetSum(arr , 0 , 0);
	}
	
	static int supportGetSum(int[] arr , int count , int sum)
	{
	
		if(count == arr.length)
			return sum;
		else 
		{
			sum += arr[count++];
			return supportGetSum(arr,count,sum);
		}	
	}
		
	
}
