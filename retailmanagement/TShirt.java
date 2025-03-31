/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class TShirt extends Cloth {
    private String design;
    static int count;

    public TShirt( String name, double price, int quantity, String size, String color,String design) {
        super(name, price, quantity, size, color);
        this.design = design;
        count+=1;
    }

     
    @Override
     public String toString()
    {
        return "Product Name : TShirt"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"size : "+size+"\n"+"color : "+color+"\n"+"design : "+design+"\n";
    }
    
    
}
