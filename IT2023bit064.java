public class IT2023bit064{
    
    // Implement the solution for Task 1
    public static String reverse(String inputString) {
        // Task 1 implementation here
        
        String[] stringArray = new String[2];
        
         if(inputString != "")
        {
          //split the String as first letter is store at stringArray[0] and
          //remaining string part store at stringArray[1]
          stringArray = inputString.split("",2); 
          
          //call reverse method by passing remaining String
          return reverse(stringArray[1])+stringArray[0];  
        }
      return "";
    }

    // Implement the solution for Task 2
    public static int sumOfDigits(int number) {
        // Task 2 implementation here
        
        //if given is number is negative then convert in positive
        number = number>0?number:-number;
        
        if(number>0)
        {
	      	return number%10+sumOfDigits(number/10);
    	}
    	  
    	return 0;
    }

    // Implement the solution for Task 3
    public static boolean isPalindrome(String inputString) {
        // Task 3 implementation here
        
          boolean storeResult = false;
       
          if(inputString.length() > 1)
          {
              //check first and last letter of String is equal or not , if equal then true else false
             storeResult = inputString.charAt(0) == inputString.charAt(inputString.length()-1);
            
              //take substring of inputString from index 1 to length()-1
             inputString = inputString.substring(1,inputString.length()-1);
              
              //call isPalindrome method by passing substring 
             return storeResult & isPalindrome(inputString);
        }
        
         else
         return true;
    }
}
