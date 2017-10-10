/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printing;

/**
 *
 * @author 45643
 */
public class Printing {
    
    int numCopies;
    double pricePerCopy; 
    
    public void setNumOfCopies(int nc){ //expect to get user input
            numCopies = nc;
                    }
    
    public double getPricePerCopy(){ //유저에 의해서 제공받는게 아니라서 Setter and getter 만들필요 없음.
        if( numCopies >=0 && numCopies <= 99){
            pricePerCopy=0.3;
        }else if(numCopies >=100 && numCopies <= 499){
            pricePerCopy=0.28;
        }else if(numCopies >=500 && numCopies <= 749){
            pricePerCopy=0.27;}
        else if(numCopies >=750 && numCopies <= 100){
            pricePerCopy=0.26;}
        else if(numCopies >=1000){
            pricePerCopy=0.25;
            
        }
        
            return pricePerCopy;
             
}
         
        
    public double getTotalCost(){
            return numCopies * pricePerCopy;
        }
    public double getExtraCost(){
        numCopies % 12 * get
    }
    
}


