/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Adam Harris
 */
public class ForWhileTask {
    public static void main(String[] args){
        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        System.out.println("While loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // do-while loop
        System.out.println("Do while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
        System.out.println();
    }
}
    
    

