/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author USER
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        addend1 = 5;
        addend2 = 18;
        
        
        int minuend;
        int subtrahend;
        int difference;
        
        minuend = -23;
        subtrahend = -6;
        
        int multiplying;
        int multiplier;
        int product;
        
        multiplying = 13;
        multiplier = 2;
        
        int dividend;
        int divisor;
        int quotlent;
        
        dividend = 16;
        divisor = 4;
        
        int module;
        
        //operation
        sum = addend1 +addend2;
        
        System.out.println("The addition of " + addend1 + " + " +  addend2 + 
                " is equal to --> " + sum);
       
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum " + (++sum));
        
        
        System.out.println("The subtraction of " + minuend + " - " + subtrahend + 
                " is equal to --> " + (minuend-subtrahend));
        
        
        System.out.println("The multiplication of " + multiplying + " * " + multiplier + 
                " is equal to --> " + (multiplying*multiplier));
        
        
        System.out.println("The division of " + dividend + " / " + divisor + 
                " is equal to --> " + (dividend/divisor));
        
        
        System.out.println(" The modulo of the division " + dividend + " / " + divisor + 
                " is equal to --> " + (divisor/dividend));
        
    }
    
}
