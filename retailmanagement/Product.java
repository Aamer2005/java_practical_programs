/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Product {
    protected String name;
    protected double price;
    protected int quantity;
    static int totalProducts;
    
    Product(String name,double price,int quantity)
    {
        totalProducts+=1;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
}
