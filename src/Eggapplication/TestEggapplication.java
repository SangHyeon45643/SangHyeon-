/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eggapplication;

import java.util.Scanner;

/**
 *
 * @author 45643
 */
public class TestEggapplication {
    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
         
         Eggapplication eg = new Eggapplication();
        
         System.out.println("Put your number of eggs");
          int c = input.nextInt();
          
         eg.setNumOfEggs(c); 
         
         
         System.out.println(eg.getPricePerCopy());
          
          
          
          
          
         
         
         
         
         
        
    }
    
   
    
    
    
    
}
