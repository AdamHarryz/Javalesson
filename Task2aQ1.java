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

public class Task2aQ1 {
    public static void main(String[] arg){
        
        String password = "SPGoop";
        
        int trial = 5, attempt = 0;
        
        boolean AccessPass = false;
        
        Scanner read = new Scanner(System.in);
        
        while (attempt < trial) {
            
            attempt++;
            
            System.out.print("Enter your password (Attempt " + attempt + "of" + trial + "): ");
            String inPassword = read.nextLine();
            
            if (inPassword.equals(password)) {
                
                AccessPass = true;
                
                break;
                
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
            
        }
        read.close();
        
        if (AccessPass) {
            System.out.println("Access granted. Welcome ! ");
        } else {
            System.out.println("Access denied. Exceeded attempts. ");
        }
    }
    
}
