class Practical6{

	public static void main(String args[])
	{
		displayPattern1(7);
		System.out.println();
		//displayPattern2(5);
	}

	static void displayPattern1(int size)
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
			
			space = line > size ? line-size: size-line;
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
	

