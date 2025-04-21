/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;


import java.util.*;

/**
 *
 * @author aamer
 */
public class SudokuGUIHelper {
    
int size;
String[][] layout;
int level;
int[] removeCellIndexCount;
	
	SudokuGUIHelper(int size)
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
	for(int row=0;row<size;row++)
	{
		pc = getCandidate();
		int column;
		for( column=0;column<size;column++)
		{
			layout[row][column]=""+pc[column];
		}
			
	}
	if(!isValid(layout))
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

int[] wrongElementRows;
int[] wrongElementColumns;

boolean isValid(String[][] layout)
{
	boolean result = true;
	
        int index=0;
        
        
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

String[] traceRemoveElement;

public void removeCells()
{
	int row=0,column=0;
	int cell =(int) Math.ceil((float)(size*size*level)/10);
        
        int index=0;
        
	wrongElementRows = new int[cell];
	wrongElementColumns = new int[cell];
        
        traceRemoveElement = new String[cell];
        
	removeCellIndexCount = new int[2*cell];
	for(int count=1,i=-1;count<=cell;count++)
	{
		row = (int)(System.nanoTime()%size);
		column = (int)(System.nanoTime()%size);
                
                traceRemoveElement[index++] = layout[row][column];
                
		layout[row][column] = " ";
		removeCellIndexCount[++i]=row;
		removeCellIndexCount[++i]=column;
	}
	
    }
}    