/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 45643
 */
import java.util.ArrayList;
import java.util.Scanner;



public class For {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Type your int input");
        
        printhello(input.nextInt()); // 어떠한 것이든지 받을수 있고 받아야만 한다. 그냥 숫자이던, 유저인풋이던, 바뀌어서 int형이 되어야 한다.
        
        
        
        
    }

    public static void printhello(int inputuser) { //int인것은 
    
        
      int x[] = new int[inputuser]; //문제를 풀면 실웃음이 나와요
      
      for (int i=1; i<x.length; i++ ){
          
          x[i]= input.nextInt(); // for 문안에 유저인풋을 넣는 신의 한수. "반복하고 싶은 동작이 무엇인가?" 라는 질문을 하고 그 동작을 for문 안에 넣는것이 해결의 실마리였다.
          
      }
          
          
           
          System.out.println(x);
      
          
      System.out.println(inputuser);
        
    }

    
    

}
        
        
               

