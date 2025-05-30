class Practical9SubTask
{
	public static void main(String[] args)
	{
		//Long array use to provide random String sequence 
		Long[] array = new Long[Integer.valueOf(args[0])];
		
		//Declaring String , StringBuffer and StringBuilder
		
		StringBuffer sb = new StringBuffer();
		StringBuilder sbr =  new StringBuilder();
		String str = "";
		
		//variable declaring for StringBuffer
		Long initialTime1,finalTime1;
		Long totalTime1 = 0l;
		
		//variable declaring for StringBuilder
		Long initialTime2,finalTime2;
		Long totalTime2 = 0l;
		
		//variable declaring for String
		Long initialTime3,finalTime3;
		Long totalTime3 = 0l;
		
		for(Integer i = 0 ; i < array.length ; i++)
		{
			array[i] = System.nanoTime();
		}
		
		for(Integer i = 0 ; i < array.length ; i++)
		{	
			//for StringBuffer
			initialTime1 = System.nanoTime();
			sb.append(array[i]);
			finalTime1 = System.nanoTime();
			totalTime1+=finalTime1 - initialTime1;
			
			//for StringBuilder
			initialTime2 = System.nanoTime();
			sbr.append(array[i]);
			finalTime2 = System.nanoTime();
			totalTime2+=finalTime2 - initialTime2;
			
			//for string
			initialTime3 = System.nanoTime();
			str+=array[i];
			finalTime3  = System.nanoTime();
			totalTime3+=finalTime3 - initialTime3;
		}
			
			//Calculate average
			totalTime1 = totalTime1 / array.length;
		 	totalTime2 = totalTime2 / array.length;
		 	totalTime3 = totalTime3 / array.length;
		 	
			System.out.println("StringBuffer append time: " + totalTime1);
        		System.out.println("StringBuilder append time: " + totalTime2);
        		System.out.println("String concatenation time: " + totalTime3);
        		
	}
}
