/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Adam Harris
 */
public class Task3Q2 {
    public static void main(String[] args){
        
        int n = 5;
        
        long factorial = 1;
        
        for (int i =1; i <= n; i++){
            factorial *= i;
        }
        
        System.out.println("Factorial of" + n + "is:" + factorial);
    }
    
}
