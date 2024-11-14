/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Adam Harris
 */
/*public class ContinueExample {
    public static void main(String[] args){
        System.out.println("Number 1 - 10");
        for(int i = 1; i <= 10; i++){
            if (i==5)
                continue;
        System.out.println( i +"\t");
        System.out.println("Skip printing 5");
        
    }
    }
}*/


public class ContinueExample{
    public static void main(String[] args){
        String searchMe = "A skunk sat on a stump and thunk the stump stunk, but the stump thunk the skunk stunk";
        int max = searchMe.length();
        int numts = 0;
        int nums = 0;
        for (int i = 0; i < max; i++){
            if ( searchMe.charAt(i)!='t')
                continue;
            numts++;}
        for (int b = 0; b < max; b++){
            if ( searchMe.charAt(b)!='s')
                continue;
            nums++;}
        System.out.println(max);
        System.out.println(" Found " +numts+ " t's in the string. ");
         System.out.println(" Found " +nums+ " s in the string. ");
    }
}