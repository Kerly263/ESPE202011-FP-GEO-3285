/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

import java.util.*;

/**
 *
 * @author USER
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        long fact = 1;
        int num = 0;
        int stop = 15;

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = number.nextInt();
        Scanner input = new Scanner(System.in);
        for (int i = num; i > 1; i--) {
        fact = fact * i;
        }
        System.out.println(" The factorial of the number " + num + " is equal to " + fact);
    }

}