class Practical6{

	public static void main(String args[])
	{
		displayPattern(3);
	}

	static void displayPattern1(int size)
	{
		int space;
		int plus;
		
		for(int line=1;line <= (2*size)-1 ;line++)
		{
			space = line > size ? line-size: size-line;
			plus = line>size?plus=line-space*space:2*line-1;
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
}
