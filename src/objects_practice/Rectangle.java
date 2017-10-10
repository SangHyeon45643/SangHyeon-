
package objects_practice;

/**
 *
 * @author 45643
 */
public class Rectangle { // 파일 이름과 같아야 함public access modifier
    
    // concrete class의 characteristic/state을 보통 글로벌 변수로 바꾼다.
    
    double length; // global scope of class variable can be used to any method
    double width;
     
    
    public void setLength(double le){  // behavior is translated into function(method) //set method의 excute될 code block 즉 statement가 외부 입력을 필요로 하기 때문에
        length = le;                  // parameter을 만들어서 "catch" the value from the outside 또한 이것은 지역변수이다.
    }
    //why we 
    public double getLength(){ 
       return length; // 
    }
    
    public void setWidth(double wi){//give the flexibiliy to the user that can set the value of width
            width = wi;
    }
   
    public double getWidth(){
           return width;
    }
    
    public double getArea(){
        return length*width;
    }
    // Width, Length는 concrete class의 state가 되는 가장 기본적인 Global variable이였고, 이 value들을 set하고 그 set한 값을 get하는 기본적인 setter,getter method가 있었다 
    // getArea,getPerimeter 같은 메소드는 setters and getters 메소드가 아닌 다른 응용적인 기능을 수행하기 위한 메소드이다.

    public double getPerimeter(){
            return 2* (length + width);
    } 
    
    
    //shape : no dimension
    // rectengle: concrete class every state 
    
    
    //the purpose of the class is reusuable and changable rectangular
    //function
}
