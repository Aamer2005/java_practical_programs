class Getsystem {
    //                  Main method
    public static void main(String args[])
     {
        String binary_value1 = toXXsystem("13", "b");
        System.out.println("Binary form of 13: " + binary_value1);

        String binary_value2 = toXXsystem("-13", "binary");
        System.out.println("Binary form of -13: " + binary_value2);

        String binary_valuex = toXXsystem("-10", "binary");
        System.out.println("Binary form of -10: " + binary_valuex);

        String binary_value3 = toXXsystem("123", "B");
        System.out.println("Binary form of 123: " + binary_value3);

        String octal_value1 = toXXsystem("15", "o");
        System.out.println("Octal form of 15: " + octal_value1);

        String octal_value2 = toXXsystem("25", "O");
        System.out.println("Octal form of 25: " + octal_value2);

        String hex_value1 = toXXsystem("17", "H");
        System.out.println("Hexadecimal form of 17: " + hex_value1);

        String hex_value2 = toXXsystem("90", "h");
        System.out.println("Hexadecimal form of 90: " + hex_value2);

        String decimal_value1 = toXXsystem("100", "D");
        System.out.println("Decimal form of 100: " + decimal_value1);

        String decimal_value2 = toXXsystem("0b11111", "D"); // 31
        System.out.println("Decimal form of 0b11111: " + decimal_value2);

        String decimal_value3 = toXXsystem("0b11011", "d"); // 27
        System.out.println("Decimal form of 0b11011: " + decimal_value3);

        String decimal_value4 = toXXsystem("0123", "D"); // 83
        System.out.println("Decimal form of 0123: " + decimal_value4);

        String decimal_value5 = toXXsystem("01234", "D"); // 668
        System.out.println("Decimal form of 01234: " + decimal_value5);

        String decimal_value6 = toXXsystem("0X1234", "d"); // 4660
        System.out.println("Decimal form of 0X1234: " + decimal_value6);

        String decimal_value7 = toXXsystem("-13", "H");
        System.out.println("Hexadecimal form of -13: " + decimal_value7);

        String decimal_value8 = toXXsystem("-35", "H");
        System.out.println("Hexadecimal form of -35: " + decimal_value8);

        String decimal_value9 = toXXsystem("-20", "o");
        System.out.println("Octal form of -20: " + decimal_value9);
    }

    // Converting D->B, D->O, D->H
    static String toXXsystem(String num, String XX) 
    {
        int value;

        if (num.startsWith("0") == true && num.startsWith("0b") == false && num.startsWith("0X") == false) 
        {
            value = convertOctalTODecimal(num);
        }
        else if (num.startsWith("0b") == true) 
        { 
        	// Binary to Decimal
            value = convertBinaryToDecimal(num);
        } 
        else if (num.startsWith("0X") == true) 
        { 
        	// Hexadecimal to Decimal
            value = convertHexToDecimal(num);
        } 
        else 
        {
            value = convertStringToDecimal(num); // Decimal
        }

        // Binary Conversion
        String binary_string = "0b";
        int[] binary_array = new int[32];
        int count = 0;

        // Octal Conversion
        int[] octal_array = new int[32];
        String octal_string = "0";
        int count_octal = 0;

        // Hexadecimal Conversion
        int[] hex_array = new int[32];
        String hex_string = "0X";
        int temp;
        int count_hex = 0;

        // Decimal Conversion
        String decimal_string = "";
        int[] decimal_array = new int[32];

        // *** Binary Conversion ***
        if (XX == "B" || XX == "b" || XX == "binary")
         {
            if (value > 0) 
             {
                for (int i = 0; value > 0; i++) 
                {
                    binary_array[i] = value % 2;
                    value = value / 2;
                    count++;
                }
            }

            if (value < 0)
             {
                binary_string = neg_binary(value);
             }
             else
             {
                for (int j = count - 1; j >= 0; j--) 
                {
                    binary_string += binary_array[j];
                }
            }

            return binary_string;
        }

        // *** Octal Conversion ***
        else if (XX == "O" || XX == "o" || XX == "octal") 
        {
            if (value > 0) 
            {
                for (int i = 0; value > 0; i++) 
                {
                    octal_array[i] = value % 8;
                    value = value / 8;
                    count_octal++;
                }
                for (int j = count_octal - 1; j >= 0; j--) 
                {
                    octal_string += octal_array[j];
                }
            }
            else if (value < 0) 
            {
                octal_string = get_negative_oct_string(value);
            }

            return octal_string;
        }

        // *** Hex Conversion ***
        else if (XX == "H" || XX == "h" || XX == "hex" || XX == "hexadecimal")
         {
            if (value > 0) 
            {
                for (int i = 0; value > 0; i++) 
                {
                    hex_array[i] = value % 16;
                    value = value / 16;
                    count_hex++;
                }
                
                for (int j = count_hex - 1; j >= 0; j--)
                 {
                    if (hex_array[j] == 10 || hex_array[j] == 11 || hex_array[j] == 12 || hex_array[j] == 13 || hex_array[j] == 14 || hex_array[j] == 15) 
                    {
                        switch (hex_array[j]) 
                        {
                            case 10:
                                hex_string += 'A';
                                break;
                            case 11:
                                hex_string += 'B';
                                break;
                            case 12:
                                hex_string += 'C';
                                break;
                            case 13:
                                hex_string += 'D';
                                break;
                            case 14:
                                hex_string += 'E';
                                break;
                            case 15:
                                hex_string += 'F';
                                break;
                        }
                    } 
                    else 
                    {
                        hex_string += hex_array[j];
                    }
                }
                
            } 
            
            else if (value < 0) 
            {
                hex_string = get_negative_hex_string(value);
            }

            return hex_string;
        }

        // *** Decimal Conversion ***
        else if (XX == "D" || XX == "d" || XX == "decimal") 
        {
            decimal_array[0] = value;
            decimal_string += decimal_array[0];

            return decimal_string;
        }

        return "0";
    }

    // *** Method to Convert number Octal to Decimal ***
    
    static int convertOctalTODecimal(String getnum)
     {
        int[] array = new int[32];
        int decimal = 0, temp, temp2, len = getnum.length(), temporary, count = 0;

        for (int i = 1, j = 0; i < len; i++)
         { // i=1 for neglect Starting 0
            temporary = getnum.charAt(i);
            array[j] = temporary - 48; // Convert char to int
            j++;
            count++;
        }

        int i = 0;
        for (int j = count - 1; j >= 0; j--)
         {
            temp = (int) Math.pow(8, i);
            temp2 = (temp * (array[j]));
            decimal = decimal + temp2;
            i++;
        }

        return decimal;
    }

    // *** Method to Convert number Binary to Decimal ***
    
    static int convertBinaryToDecimal(String num)
     {
        int temp, temp2, temporary, decimal = 0, count = 0, len = num.length();
        int[] array = new int[10];

        for (int i = 0, j = 2; i < len - 2; i++) 
        {						 // j=2 for neglect 0b
            temporary = num.charAt(j);
            array[i] = temporary - 48;
            j++;
            count++;
        }

        int i = 0;
        for (int j = count - 1; j >= 0; j--)
         {
            temp = (int) Math.pow(2, i);
            temp2 = (temp * (array[j]));
            decimal = decimal + temp2;
            i++;
        }
        return decimal;
    }

    // *** Method to Convert number Hexadecimal to Decimal ***
    static int convertHexToDecimal(String num) 
    {
        int temp, temp2, temporary, decimal = 0, count = 0;
        int[] array = new int[10];

        for (int i = 0, j = 2; i < num.length() - 2; i++) 
        { // j=2 for neglect 0X
            temporary = num.charAt(j);
            array[i] = temporary - 48;
            j++;
            count++;
        }

        int i = 0;
        for (int j = count - 1; j >= 0; j--) 
        {
            temp = (int) Math.pow(16, i);
            temp2 = (temp * (array[j]));
            decimal = decimal + temp2;
            i++;
        }
        return decimal;
    }

    static int convertStringToDecimal(String num) 
    {
        int temp, temp2, temporary, decimal = 0, count = 0;
        int[] array = new int[10];

        if (num.startsWith("-") == true) 
        {
            for (int i = 0, j = 0; i < num.length() - 1; i++) 
            {
                temporary = num.charAt(j + 1);
                array[i] = temporary - 48;
                j++;
                count++;
            }
        } 
        else 
        {
            for (int i = 0, j = 0; i < num.length(); i++)
             {
                temporary = num.charAt(j);
                array[i] = temporary - 48;
                j++;
                count++;
            }
        }

        int i = 0;
        for (int j = count - 1; j >= 0; j--)
         {
            temp = (int) Math.pow(10, i);
            temp2 = (temp * (array[j]));
            decimal = decimal + temp2;
            i++;
        }

        if (num.startsWith("-") == true) 
        {
            return -decimal;
        } 
        else
         {
            return decimal;
         }
    }

    // *** Method for Negative Binary ***
    static String neg_binary(int value) 
    {
        String binary_string = "0b";
        int[] binary_array = new int[32];
        int count = 0;

        for (int i = 0; i < 32; i++)
        {
            binary_array[i] = 1; // arr -> {1,1,1,...........1}
        }

        value = -value;

        for (int i = 0; value > 0; i++) 
        {
            binary_array[i] = value % 2;
            value = value / 2;
            count++;
        }

        for (int i = 0; i < count; i++) 
        {
            if (binary_array[i] == 1) {
                binary_array[i] = 0; // 1st complement
            } else {
                binary_array[i] = 1;
            }
        }

        for (int i = 0; i < count; i++) 
        {
            if (binary_array[i] == 0) 
            {
                binary_array[i] = 1; // second complement
                break;
            } 
            else 
            {
                binary_array[i] = 0;
            }
        }

        for (int j = 31; j >= 0; j--) 
        {
            binary_string += binary_array[j];
        }

        return binary_string;
    }

    static String get_negative_hex_string(int value) 
    {
        String get_binary, decimal = "";
        int temp, value1, value2, value3, value4, count = 0;
        int[] get_array = new int[32];

        get_binary = neg_binary(value);

        for (int i = 2, j = 0; i <= 30; i = i + 4) 
        {
            temp = get_binary.charAt(i);
            value1 = temp - 48;

            temp = get_binary.charAt(i + 1);
            value2 = temp - 48;

            temp = get_binary.charAt(i + 2);
            value3 = temp - 48;

            temp = get_binary.charAt(i + 3);
            value4 = temp - 48;

            get_array[j] = getDecimalOfBinary(value1, value2, value3, value4);

            switch (get_array[j]) 
            {
                case 10:
                    decimal += 'a';
                    break;
                case 11:
                    decimal += 'b';
                    break;
                case 12:
                    decimal += 'c';
                    break;
                case 13:
                    decimal += 'd';
                    break;
                case 14:
                    decimal += 'e';
                    break;
                case 15:
                    decimal += 'f';
                    break;
                default:
                    decimal = decimal + get_array[j];
                    break;
            }

            j++;
        }
        return decimal;
    }

    static int getDecimalOfBinary(int value1, int value2, int value3, int value4)
    {
        int decimal;
        int temp1 = (int) Math.pow(2, 0);
        int temp2 = (int) Math.pow(2, 1);
        int temp3 = (int) Math.pow(2, 2);
        int temp4 = (int) Math.pow(2, 3);

        decimal = (temp1 * value4) + (temp2 * value3) + (temp3 * value2) + (temp4 * value1);

        return decimal;
    }

    static String get_negative_oct_string(int value) 
    {
        String get_binary, decimal = "";
        int temp, value1, value2, value3, value4, count = 0;
        int[] get_array = new int[32];

        get_binary = neg_binary(value);

        temp = get_binary.charAt(2);
        value1 = temp - 48;
        temp = get_binary.charAt(3);
        value2 = temp - 48;

        int temp1 = (int) Math.pow(2, 0);
        int temp2 = (int) Math.pow(2, 1);

        get_array[0] = (temp1 * value1) + (temp2 * value2);

        decimal += get_array[0];

        int j = 1;
        for (int i = 4; i <= 31; i = i + 3) 
        {
            temp = get_binary.charAt(i);
            value1 = temp - 48;

            temp = get_binary.charAt(i + 1);
            value2 = temp - 48;

            temp = get_binary.charAt(i + 2);
            value3 = temp - 48;

            get_array[j] = getDecimalOfBinaryOfOctal(value1, value2, value3);
            decimal += get_array[j];

            j++;
        }

        return decimal;
    }

    static int getDecimalOfBinaryOfOctal(int value1, int value2, int value3) 
    {
        int decimal;
        int temp1 = (int) Math.pow(2, 0);
        int temp2 = (int) Math.pow(2, 1);
        int temp3 = (int) Math.pow(2, 2);

        decimal = (temp1 * value3) + (temp2 * value2) + (temp3 * value1);

        return decimal;
    }
}

