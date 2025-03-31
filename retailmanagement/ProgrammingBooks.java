/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class ProgrammingBooks extends Books {
    
    private String language;
    static int count;

    public ProgrammingBooks(String name, double price, int quantity, String author, String generation,String language) {
        super(name, price, quantity, author, generation);
        this.language = language;
        count+=1;
    }
    
    @Override
     public String toString()
    {
        return "Product Name : Programmin Book"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"author : "+author+"\n"+"generation : "+generation+"\n"+"language : "+language+"\n";
    }
    
    
}
