/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eggapplication;

/**
 *
 * @author 45643
 */
public class Eggapplication {
    
    int numOfEggs;
    double priceofEggs;
    
    public void setNumOfEggs(int ne){ //expect to get user input
            numOfEggs = ne;
                    }
    public int getNumOfEggs(){
        return numOfEggs;
    }
   
    public double getPricePerCopy(){ //유저에 의해서 제공받는게 아니라서 Setter and getter 만들필요 없음.
        if(  numOfEggs>=0 && numOfEggs <= 48){
            priceofEggs =  0.5;    
        }else if((numOfEggs >=48) && (numOfEggs <= 72)){
            priceofEggs= 0.45;
        }else if((numOfEggs >=72 )&& (numOfEggs <= 132)){
            priceofEggs= 0.40;
        }else if(numOfEggs >=132){
            
            priceofEggs= 0.35;  
        } else {
            while (numOfEggs>12){
                int i = numOfEggs - 12;
                
                System.out.println(numOfEggs);
                
            }
            
        }
        
       return priceofEggs; 
        
    }
    
    public double getTotalPrice(){
        return priceofEggs * numOfEggs;
    }
    
    public double getPriceForRemainder(){
       
        return (numOfEggs % 12) *(priceofEggs/2);
        
    }
      
 
    
    
}