/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class SmartPhone extends Electronic {
    
    private String sim;
    private String os;
    private String glassType;
    
    static int count;
    
    SmartPhone(String name,double price,int quantity,String waranty,String sim,String os,String glassType)
    {
               super(name,price,quantity,waranty);
               count+=1;
               this.sim = sim;
               this.os=os;
               this.glassType =glassType;
    }
    
    public String toString()
    {
        return "Product Name : SmartPhone"+"\n"+"Name : "+name+"\n"+"price : "+price+"\n"+"quantity : "+quantity+"\n"+"waranty : "+waranty+"\n"+"sim : "+sim+"\n"+"os : "+os+"\n"+"glass"+glassType+"\n";
    }
}
