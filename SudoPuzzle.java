class SudoPuzzle{

int size;
String[][] layout;
	
	SudoPuzzle(int size)
	{
	
		layout = new String[size][size];
		this.layout = getElement(layout);
		this.layout = removeElement(this.layout);
	}

String[][] getElement(String[][] layout)
{
	int size = layout.length;
	int[][] arr = new int[layout.length][layout.length];
	
	for(int row=0;row<2;row++)
	{
		for(int column=0;column<size;column++)
		{
			arr[row][column] = (int)(System.nanoTime()%size+1);
		}
	}
	
	int arrsize = arr.length;

	for(int row=0,column=0;row<1;row++)
	{
        for (int i = 0; i < arrsize; i++) {
            // Check if the current element is duplicated
            for (int j = 0; j < i; j++) {
                if (arr[row][i] == arr[row][j]) {
                    // Increment arr[i] until it is unique
                  
                    if(arr[row][i]!=0)
                    arr[row][i]=arr[row][i]%arrsize;
                    else
                    {
                    arr[row][i]+=arrsize;
                    }
                    arr[row][i]+=1;
                    j = -1; // Restart the loop to check the new value
                }
            }
        }
        }
        
       for(int row=1,column;row<size;row++)
	{
		column=1;
	
	for(;column<size;column++)
	{
		arr[row][column]=arr[row-1][column-1];
	}
		arr[row][0]=arr[row-1][column-1];
	}
	
	for(int row=0;row<size;row++)
	{
		for(int column=0;column<size;column++)
		{
			layout[row][column] = Integer.toString(arr[row][column]);
			
		}
	}
	return layout;
}

public String[][] removeElement(String[][] layout)
{
	int row=0,column=0;
	int size = layout.length;
	int removeNumber = (layout.length*layout.length)/3;
	for(int count=1;count<=removeNumber;count++)
	{
		row = (int)(System.nanoTime()%size);
		column = (int)(System.nanoTime()%size);
		layout[row][column] = " ";
	}
	
	return layout;
}

public String Grid(String[][] layout)
{
	int realRow=0,realColumn=0;
	String result="";
	int size = layout.length;
	String temp;
	
	for(int line = 1 ; line <= 2*size+1; line++)
	{
	if(line%2!=0)
	{
		for(int i = 3*size;i>0;i = i-3)
		{
			result+=" ";
			for(int len=Integer.toString(size).length();len>0;len--)
			result+="--";
		}
		result+=" ";
	}
	else
	{
		for(int i = 3*size;i>0;i = i-3)
		{
			result+="|";
			temp = "%"+(2*Integer.toString(layout.length).length())+"s";
			result+=String.format(temp,layout[realRow][realColumn]);
			realColumn+=1;
			if(realColumn==size)
			{
				realColumn=0;
				realRow+=1;
			}	
		}
		result+="|";
	}
		result+="\n";
	}
	
	return result;
}

public void display()
{
	String result = Grid(this.layout);
	System.out.println(result);
}

public static void main(String[] args)
{
	Integer size = Integer.parseInt(args[0]);
	SudoPuzzle obj = new SudoPuzzle(size);
	
	//display sudo puzzle
	obj.display();

}
}
