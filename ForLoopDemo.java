/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Adam Harris
 */
/*public class ForLoopDemo {
    public static void main(String[] args){
        System.out.println("Printing Numbers from 10 to 1");
        for(int count = 10; count >= 1; count--){
            System.out.println(count);
        }
    }
    
}*/

/*public class ForLoopDemo {
    public static void main(String[] args){
        System.out.println("Printing Number from 1 to 10");
        int count = 1;
        while (count <= 10){
            System.out.println(count);
            count++;
        }
    }
}*/
    

/*public class ForLoopDemo {
    public static void main(String[] args){
        for (int i =1;i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
}*/

public class ForLoopDemo {
    public static void main(String[] args){
        

        for (int i = 1; i <= 5; i++) {
            
            for (int j = 5; j > i; j--) {
                System.out.print(" "); 
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        for (int i = 1; i <= 8; i++) { //kebawah
            for (int j = 1; j <= 2; j++) { //ketepi
                System.out.print("  |"); 
            }
            System.out.println(); 
        }
        for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= 9; j++) { 
                System.out.print("#"); 
            }
            System.out.println(); 
        }

        
                

}

}
    
        
    

