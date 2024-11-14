/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author Adam Harris
 */

import java.util.Scanner;


public class YourName {
    public static void main(String[] args){
        String firstname, lastname;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter your first name : ");
        firstname = read.nextLine();
        
        System.out.print("Enter your last name : ");
        lastname = read.nextLine();
        
        
        System.out.println("Hello\n" +firstname+ " " +lastname );
        
        
        
    }
    
    
}
