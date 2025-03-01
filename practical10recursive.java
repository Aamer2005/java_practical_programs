 StringBuffer sun(int a)
   {
       int reminder = 0;
       
        if(a>0)
             {
                 if(a>10)
             	 return sun(a/10).append("+"+a%10);
             	
                 else
                 return sun(a/10).append(a%10);
             }   
       return new StringBuffer();
    }
    

String sumOfDigits(int num)
{
	if(num>10)
	{
		
		return sumOfDigits(num/10)+"+"+num%10;
	}
	
	return ""+num%10;
}

String isPalindrome(int num)
{
	int temp;
	String str1 = ""+num;
	String str2 ;
	
	if(str1.equals("0"))
	{
		return "the given number is palindrome";
	}
	else if(str1.charAt(0)==str1.charAt(str1.length()-1))
	{
		if(str1.length()==1)
		str2 = str1.substring(0,str1.length()-1);
		else
		str2 = str1.substring(1,str1.length()-1);
		
		if(str2.equals(""))
		temp=0;
		else
		temp = Integer.decode(str2);
		
		
		return isPalindrome(temp);
	}
	else if(str1.charAt(0)!=str1.charAt(str1.length()-1))
	{
		return 	"The given number is not Palindrome because the digit "+str1.charAt(0)+/*" at position "+(str1.length()-1)+*/" is not matching with digit "+str1.charAt(str1.length()-1)/*+" at position "+(str1.length()+1)*/;
	}
	else
	return "";
	
}
