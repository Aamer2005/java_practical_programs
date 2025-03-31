/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Pant extends Cloth {
    private String type;
    static int count;
    
    public Pant(String name, double price, int quantity, String size, String color,String type) {
        super(name, price, quantity, size, color);
        this.type = type;
               count+=1;

    }
    
    @Override
     public String toString()
    {
        return "Product Name : Pant"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"size : "+size+"\n"+"color : "+color+"\n"+"type : "+type+"\n";
    }
    
}
