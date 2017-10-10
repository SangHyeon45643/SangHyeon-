/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printing;

import java.util.Scanner;


public class TestPrinting {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //do we care about what the scanner contains? we only want to create
        Printing p = new Printing(); // Variable's Data type is Printing
        
        System.out.print("Enter number of copies to be printed");
        int c = input.nextInt();
        
        p.setNumOfCopies(c);
        
        System.out.println("Price per copy: " + p.getPricePerCopy());
        System.out.println("Total cost: " + p.getTotalCost());
        
    }
    
}
