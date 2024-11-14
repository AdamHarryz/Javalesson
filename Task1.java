/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Adam Harris
 */
import java.util.Scanner;
public class Task1 {
    public void displayMinMax(){
        
        Scanner read = new Scanner(System.in);
        String choice;
        
        do {
            System.out.print("Enter first integer : ");
            int num1 = read.nextInt();
            
            System.out.print("Enter second integer : ");
            int num2 = read.nextInt();
            
            System.out.print("Enter third integer : ");
            int num3 = read.nextInt();
            
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));
            
            
            System.out.println("The maximum value is : "+max);
            System.out.println("The minimum value is : "+min);
            
            
            System.out.print("Do you want to run the program again? (Y/N) : ");
            choice = read.next();
            read.nextLine(); 
        } while (choice.equals("Y"));
        System.out.println("Program exited");
        
    }
        
        
        
    }
    
