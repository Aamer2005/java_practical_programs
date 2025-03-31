/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Laptop extends Electronic {
    
    private String processor;
    private int RAM;
    static int count;
    
    Laptop(String name,double price,int quantity,String waranty,String processor,int Ram)
    {
        super(name,price,quantity,waranty);
        count+=1;
        this.processor = processor;
        this.RAM=Ram;
    }
    
    @Override
    public String toString()
    {
        return "Product Name : Laptop"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"waranty : "+waranty+"\n"+"processor : "+processor+"\n"+"RAM : "+RAM+"\n";
    }
    
}
