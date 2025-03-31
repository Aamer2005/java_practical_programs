/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retailmanagement;

/**
 *
 * @author aamer
 */
public class RetailManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Electronic class
        Laptop l1 = new Laptop("hp 15s",53000,1,"2 april 2028","intel-core i5",8);
        System.out.println(l1);
        
        SmartPhone s1 = new SmartPhone("vivo",33000,1,"1 january 2030","5G","android ios","Curve-Screen");
        System.out.println(s1);
        
        //Cloth class
        Shirt srt = new Shirt("Allen Solley",1500,3,"L","Blue","Plane");
        System.out.println(srt);
        
        TShirt tsrt = new TShirt("adidas",999,2,"L","Red","Printed");
        System.out.println(tsrt);
        
        Pant p1 = new Pant("Denim",3999,1,"30","Black","Formal");
        System.out.println(p1);
        
        //Book class
        ProgrammingBooks pb = new ProgrammingBooks("Java-core",600,1,"xyz","5th edition","java");
        System.out.println(pb);
         
        StoryBook sb = new StoryBook("Meddusa",500,1,"abcd","2nd generation","Horror");
        System.out.println(sb);

        System.out.println("Total Number of Products : "+Product.totalProducts);
        System.out.println("Total number of Electronic Products : " + Electronic.count);
        System.out.println("Total number of Cloth Products : " + Cloth.count);
        System.out.println("Total number of Bookc Products : " + Books.count);


    }

}
