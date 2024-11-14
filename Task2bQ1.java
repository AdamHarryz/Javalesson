/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Adam Harris
 */
import java.util.Scanner;

public class Task2bQ1 {
    public static void main(String [] args) {
        
        String ItemName;
        double TotalSale = 0, Price = 0, ItemNum;
        double Comision, Earning;
        Scanner read = new Scanner(System.in);
        
        System.out.print("enter number of item: ");
        ItemNum = read.nextInt();
        read.nextLine();
        
        for (int name = 1; name <= ItemNum; name++) {
            System.out.print("enter name of item "+ name + ": ");
            ItemName = read.nextLine();
            
            System.out.print("enter price for " + ItemName + ": ");
            Price = read.nextInt();
            read.nextLine();
            TotalSale +=Price;
            
        }
        
        System.out.println("total sale is RM" +TotalSale);
        
        Comision = TotalSale * 5/100;
        System.out.println("Your comision is Rm" +Comision);
        
        Earning = 600 + Comision;
        System.out.println("your earning is 600 +" +Comision+ "= RM" +Earning);
    }
    
}
