/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariñokerlyq11;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MariñoKerlyQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. Multiplication tables -> ");
            System.out.println("2. -> Exit");

            System.out.println("Enter the table that you want to study --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    int top = 12;
                    int product;
                    int multiplying;
                    int multiplier;
                    int table
                    for (int j = 1; j <= top; j++) {
                        System.out.println("enter multiplying ->");
                        multiplying = input.nextInt();
                        System.out.println("enter multiplier ->");
                        multiplier = input.nextInt();
                        product = multiplying * multiplier;
                        System.out.println("The product is -> " + product);
                        break;
                    }
                case 2:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        }  
    }
}
