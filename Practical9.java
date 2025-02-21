class Practical9{
public static void main(String[] args)
{
Integer size = Integer.parseInt(args[0]);
Integer[] array = new Integer[size];
Long temp;

	for(Integer i = 0 ; i < array.length ; i++)
	{
		temp= System.nanoTime()%50 +1; //it returns Long value  because System.nanoTime() returns Long value
		array[i] = temp.intValue();	//Converting Long value to Integer
	}
	
	Long initialTime1,finalTime1;
	Long totalTime1= 0l;
	
	for(Integer i = 0 ; i<array.length ; i++)
	{
		initialTime1 = System.nanoTime();
		factorial1(array[i]);
		finalTime1 = System.nanoTime();
		totalTime1 += finalTime1 - initialTime1;
	}	
		totalTime1 = totalTime1/array.length;
		
		System.out.println(totalTime1);
		
	Long initialTime2,finalTime2;
	Long totalTime2 = 0l;
	
	for(Integer i = 0 ; i<array.length ; i++)
	{
		initialTime2 = System.nanoTime();
		factorial2(array[i]);
		finalTime2 = System.nanoTime();
		totalTime2 += finalTime2 - initialTime2;
	}
	
	totalTime2 = totalTime2/array.length;
		
		System.out.println(totalTime2);
}

static int factorial1(int number)	//Iterative method 
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
	
static int factorial2(int number) 	//recursive method
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
		return number*factorial2(--number);
	}
}
