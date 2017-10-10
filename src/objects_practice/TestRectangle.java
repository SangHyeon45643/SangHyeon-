package objects_practice;


import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 45643
 */

/**
TestRectangle은 코드를 실행시키기 위해서 우리가 새로 만든 Class이다.(새로만든 파일명은 public붙어있는 클래스 이름과 같다)
* 
 */
public class TestRectangle { //클라이언트 코드(테스트 목적)
    
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in); // 
             // 에러가 나는 이유는 Scanner클래스를 임포트하지 않았기 때문 
             // java(project name), util(package name), Scanner(class name)
             
             // 스캐너 클래스는 우리 프로젝트 안에 있지 않기 때문에 임포트 해야한다 반면 Rectangular는 우리 패키지와 프로젝트 안에있기 때문에, 임포트 할 필요가 없다. 
             // 클래스를 임포트 하면, 그 클래스의 메소드에 접근할 수 있다. 
    Rectangle r1 = new Rectangle();
    
    System.out.println("Enter length: ");
    double l = input.nextDouble(); // Scanner class 때문에 그클래스안의 method에 접근 할 수 있다.
    r1.setLength(l); // Rectengle class이기 때문에 그 클래스안의 method에 접근할 수 있다, setLength method가 parameter가 있는체로 정의되었기 때문에 
    
    System.out.println("Enter width : "); //out은 System클래스의 static variable 이것을 통해 variable . 의 문법으로도 메소드 사용가능함을 알수 있다
    double w = input.nextDouble();
    r1.setLength(w); // 파라미터가 있는채로 정의되어 있었으므로 파라미터를 넣어주어야 한다.
    // class name variable name = new class name   --- make new variable "which is in that class"
    // and then we can access to the method of that class 
    
    
    System.out.println("Area : " + r1.getArea());
    System.out.println("Length : " + r1.getLength());
    System.out.println("Width : " + r1.getWidth());
    System.out.println("Perimeter : " + r1.getPerimeter());
    
    
            
    
    
    
    
             
    
        
        
        
        
        
    }
    
}
