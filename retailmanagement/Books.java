/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Books extends Product {
    protected String author;
   protected  String generation;
    static int count;

    public Books(String name, double price, int quantity,String author, String generation) {
        super(name, price, quantity);
        this.author = author;
        this.generation = generation;
        count+=1;
    }
    
    
    
}
