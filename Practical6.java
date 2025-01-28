class Practical6{

	public static void main(String args[])
	{
		displayPattern2(3);
		displayPattern1(3);
	  displayPattern3(3);
	}

	static void displayPattern2(int size)
	{
		int space;
		int plus;
		int i= 0;
		
		
		for(int line=1;line <= (2*size)-1 ;line++)
		{
			if(line>size)
			{
				i++;
			}
			
			space = line >= size ? line-size: size-line;
			plus = line>size?plus=(size*2-1)-i*2:2*line-1;
			for(;space>=1;space--)
			{
				System.out.print(" ");
			}
			for(;plus>=1;plus--)
			{
				System.out.print("+");
			}
			System.out.println();
		}
	}
	
	static void displayPattern1(int size)
	{
		int space;
		int symbol=0;
		int i=0;
		
		for(int line=1 ; line <= (2*size)-1 ; line++)
		{
		
			if(line>size)
			{
				i++;
			}
			space = size > line ? size-line:line-size;
			symbol = size >= line ? 2*line-1 :(size*2-1)-i*2;
			
			for( ;space>=1;space--)
			{
				System.out.print(" ");
			}
			for( ;symbol>=1;symbol--)
			{
				
				if(symbol%2==0 )
				System.out.print(" ");
				else if(symbol%2 != 0 && size >= line)
				System.out.print("+");
				else if(symbol%2 != 0 && line > size)
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
	
	static void displayPattern3(int size)
	{
		int space;
		int symbol;
		int i=0;
		
		for(int line=1;line<=2*size;line++)
		{
			if(line>size)
			{
				i++;
			}
			
			space = size>=line?size-line:line-size-1;
			symbol = size>=line?2*line-1:(size*2+1)-2*i;
			
			for( ; space>=1;space--)
			{
				System.out.print(" ");
			}
			
			for( ;symbol>=1;symbol--)
			{
				if(line%2!=0)
				{
					if(symbol%2==0)
					{
						System.out.print("+");
					}
					else{
						System.out.print("*");
					}
				}
				else if(line%2==0)
				{
					if(symbol%2==0)
					{
						System.out.print("*");
					}
					else{
						System.out.print("+");
					}
				}
			}
			
			System.out.println();
		}
	}	
			
}
