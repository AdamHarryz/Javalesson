/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Adam Harris
 */
public class Chapter4task2 {
    public static void main(String[] args){
        //for loop
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("Sum of 10 using for loop is = " + sumFor);

        //while loop
        int sumWhile = 0;
        int j = 1;
        while (j <= 10) {
            sumWhile += j;
            j++;
        }
        System.out.println("Sum of 10 using while loop is = " + sumWhile);

        //do-while loop
        int sumDoWhile = 0;
        int k = 1;
        do {
            sumDoWhile += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum of 10 using do-while loop is = " + sumDoWhile);
    }
}
    
    

