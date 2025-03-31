/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class Cloth extends Product {
    protected String size;
    protected String color;
    static int count;

    public Cloth( String name, double price, int quantity,String size, String color) {
        super(name, price, quantity);
        this.size = size;
        this.color = color;
        count+=1;
    }
    
    
}
