/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author USER
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;
        
        System.out.println("==== This is while loop from 1 to 10 ====");

        while (i < 27) {
            System.out.println(" i -> " + (i + 1));
            i++;
        }

        System.out.println("Multiplication Tables : 27");

        int top = 12;
        int product = 0;
        int table = 27;

        for (int j = 1; j <= top; j++) {
            product = table * j;
            System.out.println(" 27 * " + j + " = " + product);
        }
    }
}
                    System.out.println("The subtraction is");
                    System.out.println("The division is");
