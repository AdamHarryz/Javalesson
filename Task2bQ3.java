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
public class Task2bQ3 {
    public static void main(String [] args){
        
        Scanner read = new Scanner(System.in);
        String choice;
        
        do {
            int integer, even = 0, odd = 0;
            
            System.out.print("Enter number of integer: ");
            integer= read.nextInt();
            read.nextLine();
            
            for (int num = 1; num <= integer; num++) {
                System.out.print("Enter integer " + num + ": ");
                int number = read.nextInt();
                
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                
            }
            
            System.out.println("Number of even integer: " +even);
            System.out.println("Number of odd integers: " +odd);
            
            System.out.print("Do you want to run the program again? (Y/N)");
            choice = read.next();
            read.nextLine();
            
        } while (choice.equals("Y"));
        System.out.println("program exited.");
        
        
    }
    
}
