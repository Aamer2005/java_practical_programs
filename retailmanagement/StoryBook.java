/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class StoryBook extends Books {
    
    private String storyType;
    static int count;

    public StoryBook( String name, double price, int quantity, String author, String generation,String storyType) {
        super(name, price, quantity, author, generation);
        this.storyType = storyType;
        count+=1;
    }
    
    @Override
     public String toString()
    {
        return "Product Name : StoryBook"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"author : "+author+"\n"+"generation : "+generation+"\n"+"storyType : "+storyType+"\n";
    }
    
}
