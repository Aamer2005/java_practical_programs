/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Electronic extends Product{
    protected String waranty;
    static int count;
    
    Electronic(String name,double price,int quantity,String waranty)
    {
       super(name,price,quantity);
       count+=1;
       this.waranty=waranty;
    }
    
    
}
