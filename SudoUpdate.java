import java.util.*;

class SudokoUpdateVersion{

int size;
String[][] layout;
int level;
int[] removeCellIndexCount;
	
	SudokoUpdateVersion(int size)
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

void getSolution()
{
	int[] pc = new int[size];
	pc = getCandidate();
	
	for(int row=0;row<1;row++)
	{
		for(int column=0;column<size;column++)
		layout[row][column]=""+pc[column];
	}
	 for(int row=1,column;row<size;row++)
	{
		column=1;
	
	for(;column<size;column++)
	{
		layout[row][column]=layout[row-1][column-1];
	}
		layout[row][0]=layout[row-1][column-1];
	}

	/*int[] pc = new int[size];
	for(int row=0;row<size;row++)
	{
		pc = getCandidate();
		int column;
		for( column=0;column<size;column++)
		{
			layout[row][column]=""+pc[column];
		}
			
	}
	if(!isValid())
	{
		getSolution();	
	}*/		
	
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

boolean isValid()
{
	boolean result = true;
	
	for(int row=0,column=0;row<size;row++,column++)
	{
        for (int i = 0; i <  size; i++) 
        {
            // Check if the current element is duplicated
            for (int j = 0; j < i; j++) 
            {
            	if (layout[row][i].equals(layout[row][j])&& !(layout[row][j].equals("0")))
            	{
                    result = false; 
                }
             }    
         }
        
        
         for (int i = 0; i <  size; i++) 
         {
            for (int j = 0; j < i; j++) 
            {
                if (layout[i][column].equals(layout[j][column]) && !(layout[j][column].equals("0"))) {
                  
                    result = false; 
                }
            }
        }
        
        }
       return result;
}

 boolean isValidNumber(int row, int col, String number) {
        // Check row for duplicates
        for (int i = 0; i < size; i++) {
            if (i != col && layout[row][i].equals(number)) {
                return false;
            }
        }

        // Check column for duplicates
        for (int i = 0; i < size; i++) {
            if (i != row && layout[i][col].equals(number)) {
                return false;
            }
        }

        return true;
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
	String temp;
	
	for(int line = 1 ; line <= 2*size+1; line++)
	{
	if(line%2!=0)
	{
		for(int i = 3*size;i>0;i = i-3)
		{
			System.out.print(" ");
			for(int len=Integer.toString(size).length();len>0;len--)
			System.out.print(""+'\u2500'+'\u2500');
		}
		System.out.print(" ");
	}
	else
	{
		for(int i = 3*size;i>0;i = i-3)
		{
			System.out.print(""+'\u2502');
			temp = "%"+(2*Integer.toString(layout.length).length())+"s";
			System.out.print(String.format(temp,this.layout[realRow][realColumn]));
			realColumn+=1;
			if(realColumn==size)
			{
				realColumn=0;
				realRow+=1;
			}	
		}
		System.out.print(""+'\u2502');
	}
		System.out.println();
	}
	
	
}

public void solvePuzzle()
{
	String option;
	Scanner sc = new Scanner(System.in);
	
	for (int row = 0; row < size; row++) 
	{
       		for (int col = 0; col < size; col++) 
        	{
           		 // Check if the cell is empty
           		 if (layout[row][col].equals(" ")) 
           		 {
                	 System.out.println("Enter Number at row " + (row + 1) + " and column " + (col + 1));
               		 String s = sc.nextLine();

			layout[row][col]=s;
	
			displayGrid();
			}
		}
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
	SudokoUpdateVersion s = new SudokoUpdateVersion(Integer.valueOf(args[0]));
	s.displayGrid();
	s.solvePuzzle();
}

}
