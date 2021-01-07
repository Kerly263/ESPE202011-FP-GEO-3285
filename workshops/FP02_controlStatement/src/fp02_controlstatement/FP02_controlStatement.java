/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FP02_controlStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner scanner = new Scanner (System.in);
          System.out.println("Please enter an integer");
          int n = scanner .nextInt();
          System.out.println("You entered --> "+n);
          if(n%2==0) {
            System.out.printf("number %d is even!\n" , n); 
           } 
          else 
            System.out.printf("number %d is odd!\n" , n); 
    	}
    }     