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

public class Converter {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int choice;
        float myrtousd, amount, mass, kg, km, distance;
        
        System.out.println("Converter available :");
        System.out.println("1. Currency (MYR - USD)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - m)");
        
        System.out.print("Choose your choice : ");
        choice = read.nextInt();
        
        switch (choice) {
            case 1: 
                System.out.print("Enter Amount in MYR: ");
                amount = read.nextFloat();
                myrtousd = amount * 4.47171f;
                System.out.println("RM " +amount+ " = " +myrtousd+ " USD");
                break;
            
            case 2:
                System.out.print("Enter amount in kg : ");
                kg = read.nextFloat();
                mass = kg * 2.20462f;
                System.out.println("kg " +kg+ " = " +mass+ " pound ");
                break;
                
            case 3:
                System.out.print("Enter distance in km : ");
                km = read.nextFloat();
                distance = km * 1000;
                System.out.println(+km+ " = " +distance+ " m");
                break;
                
            default:
                System.out.println("Invalid choice. please try again");
            
                
                
                
            
        }
    }
}
