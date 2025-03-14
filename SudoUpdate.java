import java.util.*;
class SudoUpdate{
int size;
String[][] layout;
int level;
int[] removeCellIndexCount;
	
	SudoUpdate(int size)
	{
		level=1;
		this.size = size;
		layout = new String[size][size];
		for(int i=0;i<size;i++)
		Arrays.fill(layout[i],"0");
		generatePuzzle();
	}
	
void generatePuzzle()
{
	getSolution();
	removeCells();
}

//assumes getSolution is right
void getSolution()
{
	int[] pc = new int[size];
	for(int row=0;row<size;row++)
	{
		pc = getCandidate();
		
		for(int column=0;column<size;column++)
		{
			layout[row][column]=""+pc[column];
			
		}
			
	}
		if(!isValid())
		{
			 getSolution();
		}
				
	
}
int[] getCandidate()
{
	int[] array = new int[size];
	long temp=0;
	
	for(int count=1;count<=size;count++)
	{
		temp=System.nanoTime()%size+1;
		array[count-1]=(int)temp;
	}
	
	
        for (int i = 0; i < size; i++) {
            // Check if the current element is duplicated
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    // Increment arr[i] until it is unique
                  
                    if(array[i]!=0)
                    array[i]=array[i]%size;
                    else
                    {
                    array[i]+=size;
                    }
                    array[i]+=1;
                    j = -1; // Restart the loop to check the new value
                }
            }
        }
        
	
	return array;
}

boolean isValid()//int givenRow,int givenColumn
{
	boolean result = true;
	
	for(int row=0,column=0;row<size;row++,column++)
	{
        for (int i = 0; i <  size; i++) {
            // Check if the current element is duplicated
            for (int j = 0; j < i; j++) {
            	if (layout[row][i].equals(layout[row][j])&& !(layout[row][j].equals("0")))
            	{
                    // Increment arr[i] until it is unique
                  
                    result = false; 
                   }
                }
              
            }
        
        
         for (int i = 0; i <  size; i++) {
            // Check if the current element is duplicated
            for (int j = 0; j < i; j++) {
                if (layout[i][column].equals(layout[j][column]) && !(layout[j][column].equals("0"))) {
                  
                    result = false; 
                }
              
            }
        }
        
        }
       return result;
}

public void removeCells()
{
	int row=0,column=0;
	int cell =(int) Math.ceil((float)(size*size*level)/10);
	
	removeCellIndexCount = new int[2*cell];
	for(int count=1,i=-1;count<=cell;count++)
	{
		row = (int)(System.nanoTime()%size);
		column = (int)(System.nanoTime()%size);
		layout[row][column] = " ";
		removeCellIndexCount[++i]=row;
		removeCellIndexCount[++i]=column;
	}
	
}
      

public void displayGrid()
{
	int realRow=0,realColumn=0;
	int size = layout.length;
	String temp;
	
	for(int line = 1 ; line <= 2*size+1; line++)
	{
	if(line%2!=0)
	{
		for(int i = 3*size;i>0;i = i-3)
		{
			System.out.print(" ");
			for(int len=Integer.toString(size).length();len>0;len--)
			System.out.print("--");
		}
		System.out.print(" ");
	}
	else
	{
		for(int i = 3*size;i>0;i = i-3)
		{
			System.out.print("|");
			temp = "%"+(2*Integer.toString(layout.length).length())+"s";
			System.out.print(String.format(temp,this.layout[realRow][realColumn]));
			realColumn+=1;
			if(realColumn==size)
			{
				realColumn=0;
				realRow+=1;
			}	
		}
		System.out.print("|");
	}
		System.out.println();
	}
	
	
}

public void solvePuzzle()
{
	String option;
	
	Scanner sc = new Scanner(System.in);
	for(int count = 0, i=-1 ; count<removeCellIndexCount.length/2;count++)
	{
	System.out.println("Enter Number at row "+(removeCellIndexCount[i+1]+1)+" and cell "+(removeCellIndexCount[i+2]+1));
	
	String s = sc.nextLine();
	
	layout[removeCellIndexCount[++i]][removeCellIndexCount[++i]]=s;
	
	displayGrid();
	}
	
	boolean result = isValid();
	
	if(result)
	{
		System.out.println("Congratulations !!! Puzzle is solved");
		System.out.print("Do you want to play next level : ");
		option = sc.nextLine();
		if(option.equalsIgnoreCase("yes"))
		{
			level+=2;
			removeCells();
			displayGrid();
			solvePuzzle();
		}
		
	}
	else
	{
		System.out.println("Puzzle is not solved !!! ");
		System.out.print("Do you want to play again : ");
		option = sc.nextLine();
		if(option.equalsIgnoreCase("yes"))
		{
			for(int count = 0, i=-1 ; count<removeCellIndexCount.length/2;count++)
			{
			
			layout[removeCellIndexCount[++i]][removeCellIndexCount[++i]]=" ";
			}
			displayGrid();
			solvePuzzle();
		}
	}
}

public static void main(String[] args)
{
	SudoUpdate s = new SudoUpdate(Integer.valueOf(args[0]));
	s.displayGrid();
	s.solvePuzzle();
}

boolean isValid1(int r , int c, String num)//int givenRow,int givenColumn
{
	boolean result = true;
	
	for(int row=r,column=c;row<=r;row++,column++)
	{
        for (int i = 0; i <  size; i++) {
            // Check if the current element is duplicated
            //for (int j = 0; j < i; j++) {
            	if(c!=i)
            	{
                if (num.equals(layout[r][i]) ) {
                    // Increment arr[i] until it is unique
                  
                    result = false; // Restart the loop to check the new value
                    break;
               }
               }
              
            //}
        }
        
         for (int i = 0; i <  size; i++) {
            // Check if the current element is duplicated
           // for (int j = 0; j < i; j++) {
                       	if(r!=i)
                       	{
                if (num.equals(layout[i][c])) {
                    // Increment arr[i] until it is unique
                  
                    result= false; // Restart the loop to check the new value
                    break;
                }
                }
              
            //}
        }
        }
        
       return result;
}


}




/*
void getSolution()
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
}*/
