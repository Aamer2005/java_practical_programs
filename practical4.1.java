class gettype{

public static void main(String args[])
	{
		int bytevalue = getByte(128);
		System.out.println(bytevalue);
		
		int shortvalue = getShort(32769);
		System.out.println(shortvalue);
		
		int randomvalue = getNumber(130,"BYte");
		System.out.println(randomvalue);
		
		int randomvalue1 = getNumber(32768,"Short");
		System.out.println(randomvalue1);
		
		int randomvalue2 = getNumber(32768,"ShOrt");
		System.out.println(randomvalue2);
		
		int randomvalue3 = getNumber(129,"Byte");
		System.out.println(randomvalue3);
		
		int randomvalue4 = getNumber(290,"Byte");
		System.out.println(randomvalue4);
	}
	
static int getByte(int number)
	{
		int result = 0;
		int dividevalue = number/128;
		
		if(dividevalue%2 == 0 )
		{
			result = number%128;
		}
		else
		{
			if(number>0)
			{
				result = -128 + (number%128);
			}
			else 
			{
				result = 128 - (-number%128);
			}
		}
		
		return result;
	}
	
static int getShort(int number)
	{
		int result = 0;
		int dividevalue = number/32768;
		
		if(dividevalue%2 == 0 )
		{
			result = number%32768;
		}
		else
		{
			if(number>0)
			{
				result = -32768 + (number%32768);
			}
			else 
			{
				result = 32768 - (-number%32768);
			}
		}
		
		return result;
	}
	
static int getNumber(int number , String type)
	{
	
		int output;
		String get_type = type.toLowerCase();
		String str1 = "byte";
		String str2 = "short";

		
		if( ('B' == type.charAt(0) || 'b' == type.charAt(0) )&& ('Y' == type.charAt(1) || 'y' == type.charAt(1))  && ('t' == type.charAt(2) || 'T' == type.charAt(2) ) && ('E' == type.charAt(3) || 'e' == type.charAt(3)) )
		{
			output = getByte(number);
			return output;
		}
		else if( ('S' == type.charAt(0) || 's' == type.charAt(0)) && ('H' == type.charAt(1) || 'h' == type.charAt(1))  && ('O' == type.charAt(2) || 'o' == type.charAt(2))  && ('R' == type.charAt(3) || 'r' == type.charAt(3)) && ('T' == type.charAt(4) || 't' == type.charAt(4)))
		{
				output = getShort(number);
				return output;
		}
		
		
			System.out.println("Invalid type !!!");
			return -1;
		
	}
}
