class Practical7{

public static void main(String args[])
{
		String s = args[0];
		int unit = Integer.parseInt(s,10);
		
		int size = 2*(unit-1)+7;
	
		//for Horizontal Name
		
		String horizontalName="";
		for(int line=1;line<=size;line++)
		{
		horizontalName+=displayA(size,line)+"  "+displayA(size,line)+"  "+displayM(size,line)+"  "
		+displayE(size,line)+"  "+ displayR(size,line);
		horizontalName+="\n";
		}
		
		System.out.print(horizontalName);
		
		//for Vertical Name
		
		String verticalName="";
		for(int line=1;line<=size;line++){
		verticalName+=displayA(size,line);
		verticalName+="\n";
		}
		
		verticalName+="\n";
		
		for(int line=1;line<=size;line++){
		verticalName+=displayA(size,line);
		verticalName+="\n";
		}
		
		verticalName+="\n";
		
		for(int line=1;line<=size;line++){
		verticalName+=displayM(size,line);
		verticalName+="\n";
		}
		
		verticalName+="\n";
		
		for(int line=1;line<=size;line++){
		verticalName+=displayE(size,line);
		verticalName+="\n";
		}
		
		verticalName+="\n";
		
		for(int line=1;line<=size;line++){
		verticalName+=displayR(size,line);
		verticalName+="\n";
		}
		
		System.out.print(verticalName);
	
}

static String displayA(int size,int line)
{

	String blankSpace="";
	String result = "";

	
		for(int space=size-line;space>0;space--)
		{
			result+=" ";
		}
					result+=blankSpace;
		for(int symbol=2*line-1;symbol>=1;symbol--)
		{
			if((float)size/2+0.5==line||(float)size/2+1==line||symbol==2*line-1||symbol==1)
			{
				if(symbol%2!=0)
				result+="*";
				else
				result+=" ";
			}
			else
			{
				result+=" ";
			}
		}
		for(int space=size-line;space>0;space--)
		{
			result+=" ";
		}
		
	return result;
}

static String displayE(int size,int line)
{
	String result="";
	
		if(line==1 || line==size||line==(float)size/2+1 || line == (float)size/2+0.5)
		{
			for(int symbol=2*size-1 ; symbol>=1;symbol--)
			{
				if(symbol%2!=0)
				result+="*";
				else
				result+=" ";
			}
		}
		else{
			for(int symbol=2*size-1 ; symbol>=1;symbol--)
			{
				if(symbol==2*size-1)
				{
					result+="*";
				}
				else{
					result+=" ";
				}
			}
		}
		
	
	return result;
}

static String displayM(int size,int line)
{
	String result="";
	
	//Calling left and right M method
	
	result += leftM(size,line)+rightM(size,line);
	return result;
}
	

static String leftM(int size,int line)
{
	String result = "";

		for(int symbol=size;symbol>=1;symbol--)
		{
			
			if(symbol==size)
			{
				result+="*";
			}
			else if(line==2 && symbol>=size-1)
			{
				result+="*";
			}
			else if(line>2 && symbol!=size && symbol>size-line)
			{
				for(int space=line-2;space>=1;space--,symbol--)
				{
					result+=" ";
				}
				result+="*";
			}
			else{
				result+=" ";
			    }
		}
		
	return result;
}

static String rightM(int size,int line)
{
	String result = "";
	
		for(int symbol=size-1;symbol>=1;symbol--)
		{
			if(symbol > line)
			{
				for(int space = size-line-1;space>=1;space--,symbol--)
				{
					result+=" ";
				}
				result+="*";
		        }
		        
		        else{
		        	if(symbol<line)
		        	{
				for(int space = line-2;space>=1;space--,symbol--)
				{
					result+=" ";
				}
				}
				result+="*";
			   }
		}
		
	return result;
}


static int i=0;

static String displayR(int size,int line)
{
	
	String result = "";
	
		for(int symbol=2*size-1 ; symbol>=1 ; symbol--)
		{
			if(symbol==1 && line < (float)size/2+0.5 &&line>1 || symbol == 2*size-1 )
			{
				result +="*";
			}
			else if(line == 1 || line == (float)size/2 || line == (float)size/2+0.5)
			{
				if(symbol==1 )
				result+=" ";
				else if(symbol%2!=0)
				result+="*";
				else
				result+=" ";
			}
			else{
				if(line > size/2 && symbol == size-(2*i))
				{
					result+="*";
				}
				else
				result+=" ";
			}
	         }
	         
	         if(line > size/2)
	         {
	         i++;
	         i=line==size?0:i;
	         }
	     
	 return result;
}

}
