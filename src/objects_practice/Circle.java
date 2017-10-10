/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects_practice;

/**
 *
 * @author 45643
 */
public class Circle {
    
    double radius; //expecting the radius is the form of double.
    

public void setRadius(double l){ // normaly has the parameter //variable decoration 
    radius = l;
}    

public double getArea(){
    
        double circlearea = (radius * radius) * (Math.PI); //this method gives the value
        return circlearea; //local variable
    
}

public double getPeri(){
    return  2 * Math.PI * Math.pow(radius, 2); // Mass is a class that Java made. pow method is defined to having two parameters.
    
}

}
