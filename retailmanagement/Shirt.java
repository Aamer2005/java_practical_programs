/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Shirt extends Cloth {
   private String pattern;
    static int count;
    
    public Shirt( String name, double price, int quantity, String size, String color,String pattern) {
        super(name, price, quantity, size, color);
        this.pattern = pattern;
                count+=1;

    }
    
    @Override
     public String toString()
    {
        return "Product Name : Shirt"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"size : "+size+"\n"+"color : "+color+"\n"+"pattern : "+pattern+"\n";
    }
    
}
