class Practical8{

public static void main(String[] args)
{
	int size = Integer.parseInt(args[0]);	//Taking size of Pattern
	
	pattern1(size,size+1);			
	System.out.println();
	
	pattern2(size,1);
	System.out.println();
	
	pattern3(size,1);
	System.out.println();
	
	pattern4(size,1);
	System.out.println();
}


static void pattern1(int size,int midline){

int symbol = midline-size;

if(size > -1)
{
	pattern1Helper(symbol);		//Upper part of Pattern1
	
	pattern1(size-1,midline);
	
	if(symbol<midline)		//Skipping one line
	pattern1Helper(symbol);		//Lower part of Pattern1
}
}

static void pattern1Helper(int symbol)		//Use for resursively print star(*)
{
	if(symbol>0){
	System.out.print("*");
	pattern1Helper(symbol-1);
	}
	else{
	System.out.println();
	}
}

static void pattern2(int size,int line)
{
	int totalsymbol = size+1;
	int space = totalsymbol-line;
	int star = totalsymbol-space;
	
	if(line<=size+1)
	{
		if(line<=size)
		{
		pattern2Helper(space,star,"*");		//Upper part of Pattern2 with symbol *
		
		pattern2(size,line+1);
		
		pattern2Helper(space,star,"/");		//Lower part of Pattern2 with symbol /
		}
		else if(line==size+1)
	        pattern2Helper(space,star,"+");		//Mid part of Pattern2 (Mid line containing +)
	}
	
}

static void pattern2Helper(int space,int star,String symbol)	//recursively printing symbol in line
{
	if(space>=1)
	{
		System.out.print(" ");
	  	pattern2Helper(space-1,star,symbol);		//For spaces
	  }
	 else if(star>=1 && space==0)
	{
		System.out.print(symbol);
	  	pattern2Helper(space,star-1,symbol);		//for printing symbol
	  }
	  else
	  System.out.println();					//Entering in newline after printing all symbols in that line
}

static void pattern3(int size,int line)
{
	int symbol = 2*size-1;
	int space = size-line;
	int star = 2*line-1;
	
	if(line<=size)
	{
		pattern3helper(size,line ,symbol,space,star,space);	//Upper part of Pattern3 (Upper part of Diamond)
		
		pattern3(size,line+1);
		
		if(line<size)
		pattern3helper(size,line ,symbol,space,star,space);	//Lower part of Pattern3 (Upper part of Diamond)
		
		if(line==1)
		tail(size,1);						//Calling remaining Pattern tail 
		
	}
	
}


static void pattern3helper(int size,int line ,int symbol,int space1,int star,int space2)
{
	if(space1>=1)
	{
		System.out.print(" ");					//printing left spaces
		pattern3helper(size,line,symbol,space1-1,star,space2);
	}
	
	else if(space1==0 && star>=1)
	{
		System.out.print("*");
		pattern3helper(size,line,symbol,space1,star-1,space2);	//printing symbol (*) of diamond
	}
	
	else if(space2>=1 && star==0)
	{
		System.out.print(" ");
		pattern3helper(size,line,symbol,space1,star,space2-1);	//printing right spaces
	}
	else
	System.out.println();		//Entering in new line after printing all symbols in line
	
	
}

static void tail(int size,int line)  //Use for printing tail
{
	if(line<=size )
	{
		pattern3Tail(size,size-1,1);	//Upper part
		
		tail(size,line+1);
		
		if(line<size)
		pattern3Tail(size,size-1,1);	//lower part
	}
	
}

static void pattern3Tail(int size,int space,int star)	//Use for print symbol of tail pattern
{
	if(space>=1)
	{
		System.out.print(" ");			//printing spaces
		pattern3Tail(size,space-1,star);	
	}
	else if(space == 0 && star>=1)
	{
		System.out.println("+");		//printing + symbol of tail pattern
		pattern3Tail(size,space,star-1);
	}
	
}

static void pattern4(int size,int line)
{
	int symbol = 2*size+1;
	int space=2*(size-line+1);
	int starSlash=symbol-space;
	
	if(line<=size+1)
	{
	
		pattern4Helper(size,line,symbol,space,starSlash,"*","/");	//upper part of pattern4
		
		pattern4(size,line+1);
		
		pattern4Helper(size,line,symbol,space,starSlash,"/","*");	//lower part of pattern4
	}
}

static void pattern4Helper(int size,int line,int symbol,int space,int starSlash,String star,String slash) //Recursively for printing symbol , star , slash in each line of pattern4
{
	if(space>(size-line+1))
	{
		System.out.print(" ");						//Printing left spaces
		pattern4Helper(size,line,symbol,space-1,starSlash,star,slash);
	}
	else if(line%2!=0 && starSlash>=1)
	{
		System.out.print(star);						//printing star in upper part OR slash in lower part
		pattern4Helper(size,line,symbol,space,starSlash-1,star,slash);
	}
	else if(line%2==0 && starSlash>=1)
	{
		System.out.print(slash);					//printing slash in upper part OR star in lower part
		pattern4Helper(size,line,symbol,space,starSlash-1,star,slash);
	}
	else if(space<=(size-line+1)&& space>=1)
	{
		System.out.print(" ");						//Printing right spaces
		pattern4Helper(size,line,symbol,space-1,starSlash,star,slash);
	}
	else
	{
		System.out.println();					//Entering in new line
	}
}
}	
