/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter.pkg3;

/**
 *
 * @author Adam Harris
 */
/*import java.util.Scanner;

public class DiscountProg {
    public void main(String[] args){
        String name;
        double discountrate = 0, discountamount, price, totalprice, priceafterdiscount;
        int quantity;
        
        Scanner read = new Scanner(System.in);
        
        //display menu 
        System.out.print("select discount rate");
        System.out.println("1.yellow - 10% ");
        System.out.println("2.green - 20% ");
        System.out.println("3.blue - 30% ");
        System.out.println("4.red - 40% ");
        System.out.println("5.black - 50% ");
        int colorcode = read.nextInt();
        
        //determine discount rate base on color code 
        switch (colorcode){
            case 1:
                discountrate = 0.1;
                break;
            case 2:
                discountrate = 0.2;
                break;
            case 3:
                discountrate = 0.3;
                break;
            case 4:
                discountrate = 0.4;
                break;
            case 5: 
                discountrate = 0.5;
                break;
                
        }
        
        //input item details
        System.out.print("Enter item name :");
        name = read.nextLine();
        
        System.out.print("Enter item price :");
        price = read.nextDouble();
        
        System.out.print("Enter item quantity :");
        quantity = read.nextInt();
        
        //calculate total price
        totalprice = price + quantity;
        
        //calculate discount amount
        discountamount = totalprice * discountrate;
        priceafterdiscount = totalprice - discountamount;
        
        
        // Display results
        System.out.println("\n----- Receipt -----");
        System.out.println("Item Name: " + name);
        System.out.println("Price Per Item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalprice);
        System.out.println("Discount Rate: " + (discountrate * 100) + "%");
        System.out.println("Discount Amount: $" + discountamount);
        System.out.println("Price After Discount: $" + priceafterdiscount);
           
    }
    
}*\
