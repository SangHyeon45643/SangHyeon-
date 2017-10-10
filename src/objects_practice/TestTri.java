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
public class TestTri {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Triangle t = new Triangle();
        
        System.out.println("Enter the x"); 
        double x = s.nextDouble();  t.setSide1(x);
        System.out.println("Enter the y"); 
        double y = s.nextDouble(); t.setSide2(y);
        System.out.println("enter the z");
        double z = s.nextDouble(); t.setSide3(z);
        
         System.out.println("Area : " + t.getArea());
         System.out.println("Perimeter : " + t.getPerimeter());
         
                 
         
    }
    
}
