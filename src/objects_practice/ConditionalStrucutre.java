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
public class ConditionalStrucutre { 
    
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt(); //not a next double.
        
        if (age >= 15 && age <= 19){ // == is not the same thing with = 
            
            System.out.println("You're in high shcool");
            
            }else if (age >= 11 && age <=14){ 
                System.out.println("You're in Middle school");
            }else if ( age >= 7 && age<= 10){
                System.out.println("You're in Elem");
            }else if ( age>= 3 && age <= 6){
                System.out.println("you are in preschool");
            }else {
                System.out.println("Yor are out of school");
            } // error 
                              
        
    }
    
    
    
}



//not about object, depending on 