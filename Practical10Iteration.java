class Practical10Iterative
{

StringBuffer sumOfDigits(int number)
{
	int sum = 0;
	int reminder = 0;
	
	StringBuffer sb = new StringBuffer();
	
	sum=number%10;
	sb.append(sum);
	number/=10;
	
	while(number>0)
	{
		reminder = number%10;
		sum+=reminder;
		sb.insert(0,reminder+"+");
		number/=10;
	}
	
	sb.append("="+sum);
	
	return sb;
}

StringBuffer isPalindrome(int number)
{
	StringBuffer sb = new StringBuffer();
	StringBuffer sb1 = new StringBuffer();
	sb.append(number);
	sb1.append(number);
	int count=0;
	
	for(int i=0,j=sb.length()-1;i<sb.length();i++,j--)
	{
		if(sb.charAt(i)==sb.charAt(j))
		{
			count++;
			
		}
		else
		{
			sb1.append(" is not Palindrome because the digit "+sb.charAt(i)+" at position "+(i+1)+" is not matching with digit "+sb.charAt(j)+" at position "+(j+1));
			break;
		}
	}
	
	if(count == sb.length())
			sb1.append("is Palindrome");
	
	
	return sb1;
}

int getCountPPS(String text) {

         String[] arr = new String[(text.length() * (text.length() + 1)) / 2]; // Array size to store all possible substrings

        int index = 0;

        // Loop for all possible substrings
        for (int i = 0; i <= text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                arr[index++] = text.substring(i, j);
            }
        }

        int count = 1; // 1 for the empty string ""


        for (int i = 0; i < arr.length; i++) {
            int check = 0;
            

            for (int j = 0, k = arr[i].length() - 1; j < arr[i].length() && k >= 0; j++, k--) {
                if (arr[i].charAt(j) == arr[i].charAt(k)) {
                    check++;
                }
            }
            // If the entire string is a palindrome, increment the count
            if (check == arr[i].length()) {
                count++;
            }
        }

        return count;
    }
}
