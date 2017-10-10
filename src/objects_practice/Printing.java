/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects_practice;


import java.util.Scanner;
/**
 *
 * @author 45643
 */
public class Printing { //uml modeling 
    
     public static void main(String[] args) {
            
     
     Scanner x = new Scanner(System.in);
     
     double copy = x.nextDouble();
     
               if (copy>=0 && copy<=99 ){
        System.out.println("Price per copy is : 0.30" );
        System.out.println("Total Cost :" + copy * 0.30);
               }
        else if (copy>=100 && copy<=499 ){
        System.out.println("Price per copy is : 0.28" );
        System.out.println("Total Cost :" + copy * 0.28);
      }
        else if (copy>=500 && copy<=749 ){
        System.out.println("Price per copy is : 0.27" );
        System.out.println("Total Cost :" +copy * 0.27);
      }
        else if (copy>=750 && copy<=1000 ){
        System.out.println("Price per copy is : 0.26" );
        System.out.println("Total Cost :" + copy * 0.26);
      }
        else if (copy>=1000){
        System.out.println("Price per copy is : 0.25" );
        System.out.println("Total Cost :" + copy * 0.25);
        }
        
     }
}


               

       

        
        
      
    
    
    
    

        
    
    
   



    



