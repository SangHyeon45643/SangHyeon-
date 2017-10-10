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
public class Triangle {
    
    
    double side1;
    double side2;
    double side3;
      

public void setSide1(double s1){
    
    side1=s1;
}

public double getSide1(){
    return side1;
}
  
public void setSide2(double s2){
    
    side2=s2;
}

public double getSide2(){
    return side2;
}

public void setSide3(double s3){
    
    side3=s3;
}

public double getSide3(){
    return side3;
}


public double getArea(){
    
  double p = (side1 + side2 + side3)/2;
  double area = Math.sqrt(p * (p - side1) * ( p - side2) * (p - side3));
  return area;
    
    
}

public double getPerimeter(){
    
    double q = (side1 + side2 + side3);
    return q;
    
    
}


}


