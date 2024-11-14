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

public class Task3Q2v2 {
    public static void main(String[] atgs) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int n = read.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("factorial of " + n + "is: " + factorial);
    }
    
}
