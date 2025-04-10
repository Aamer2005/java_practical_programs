/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author aamer
 */
public class TextAnalyzerHelper {

    private String inputText;

    private int length;
    private int words;
    private int spaces;
    private int lines;
    private int tabs;

    private String dropDownOptionAsString;

    public String getDropDownOptionAsString() {
        return dropDownOptionAsString;
    }

    public TextAnalyzerHelper(String inputText) {
        this.inputText = inputText;
        performAnalysis();
    }

    public int getLength() {
        return length;
    }

    public int getWords() {
        return words;
    }

    public int getSpaces() {
        return spaces;
    }

    public int getLines() {
        return lines;
    }

    public int getTabs() {
        return tabs;
    }

    @Override
    public String toString() {
        return  "length=" + length +"\n"+ "words=" + words +"\n"+ "spaces=" + spaces +"\n"+ "lines=" + lines +"\n"+"tabs=" + tabs +"\n";
    }

    private void performAnalysis() {

        length = inputText.length();

        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == ' ') {
                spaces += 1;
            } else if (inputText.charAt(i) == '\n') {
                lines += 1;
            } else if (inputText.charAt(i) == '\t') {
                tabs += 1;
            }
        }

        lines = lines + 1; //if 1 \n then 2 lines

        char c;
        for (int i = 0; i < inputText.length() - 1; i++) 
        {
            if (inputText.charAt(i) == '\n' || inputText.charAt(i) == '\t' || inputText.charAt(i) == ' ') 
            {
                c = inputText.charAt(i + 1);
                if (c != '\n' && c != '\t' && c != ' ') 
                {
                    words += 1;
                }
            }

        }

        if (inputText.startsWith(" ") || inputText.startsWith("\n") || inputText.startsWith("\t")) {

        } 
        else {
            words += 1;
        }
        
        getUniqueCharacters();
    }
    
    private void getUniqueCharacters()
    {
        String inputString = inputText.replaceAll("[\n\t\s]", "");
        
        String subString;
        String uniqueString="";
        
           for (int i = 0; i < inputString.length(); i++)
           {
               subString = inputString.substring(0, i);
               if(inputString.charAt(i)!='.')
               {
                 if(subString.contains(inputString.charAt(i)+"")==false)
                 {
                     uniqueString+=inputString.charAt(i);
                 }
               }
           }
           dropDownOptionAsString = uniqueString;
           
           getDropDownOptionsInSequence();
           
    }
    
    public int letterCountsInText(String letter)
    {
       int count=0;
       
       char c = letter.charAt(0);
       
       for(int i=0;i<inputText.length();i++)
       {
           if(c==inputText.charAt(i))
           {
               count+=1;
           }
       }
       
       return count;
    }
    
    public void getDropDownOptionsInSequence()
    {
        String temp="";
        
        char[] array = new char[dropDownOptionAsString.length()];
        
        for(int i=0;i<dropDownOptionAsString.length();i++)
        {
            array[i]=dropDownOptionAsString.charAt(i);
        }
        
        java.util.Arrays.sort(array);
        
        for(int i=0;i<array.length;i++)
        {
            temp+=array[i];
        }
        
        dropDownOptionAsString = temp;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
       
    }

}
