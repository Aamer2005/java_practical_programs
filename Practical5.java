class Practical5
{

	public static void main(String args[] )
	{
		int result = factorial1(5);
		System.out.println(result);
		
		int result2 = factorial2(6);
		System.out.println(result2);
		
		int arr[] = {1,2,3,4};
		int result3 = sum(arr , 0 ,0);
		System.out.println(result3);
		
		int arr2[] = {1,2,3};
		int result4 = sum(arr2 , 0 , 0);
		System.out.println(result4);
		
		int arr3[] = {1,2,3,-3,2,-4,10};
		int result5 = sum(arr3 , 0 , 0);
		System.out.println(result5);

	}
	
	static int factorial1(int number)
	{
		int fact = 2;
		
		if(number < 0)
		{
			return -1 ;
		}
		else if(number == 0)
		{
			return 1;
		}
		else if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 2;
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
		int fact = 2;
		
		if(number < 0)
		{
			return -1 ;
		}
		else if(number == 0)
		{
			return 1;
		}
		else if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 2;
		}
		else
		{
			while(number > 2)
			{
				fact *=number--;
			}
		return fact;
		}
	}
	
	
	
	static int sum(int[] arr , int count , int get_sum)
	{
	
		if(count == arr.length)
		{
			return get_sum;
		}
		else 
		{
			get_sum = get_sum+arr[count];
			count++;
			return sum(arr,count,get_sum);
		}	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
