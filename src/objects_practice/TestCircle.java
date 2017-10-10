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
public class TestCircle {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Circle c = new Circle();
        
        System.out.println("Enter the value of radius");
        double user_input = input.nextDouble();
        c.setRadius(user_input);
        
        System.out.println("Area : " + c.getArea());
        
        
        System.out.println("Perimeter : " + c.getPeri());
        
        
        
           
                
        
        
        
        
        
    }
    
}

// Data type Boolean x = true; The value that variable can hold is either True or False. 
// char y = "y" ASCII
// primitive data type : hold only simple value, like character, decimal etc.....

