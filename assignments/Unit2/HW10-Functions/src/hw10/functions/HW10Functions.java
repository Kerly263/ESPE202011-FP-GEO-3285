/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int dividend;
        int divisor;
        float quotient;

        int y = 0;
        int x = 0;
        int number;
        int result;

        int top = 12;
        int product;
        int table;
        int multiplicand;


        System.out.println(" ～～ WELCOME ～～");

        System.out.println(" -- Division --");
        System.out.println("Please enter dividend -->");
        dividend = input.nextInt();
        System.out.println("Please enter divisor -->");
        divisor = input.nextInt();
        quotient = (int) divideTwoNumbers(dividend, divisor);
        System.out.println("The quorient is -> " + quotient);

        System.out.println(" -- Square of a number --");
        System.out.println("Please enter number  -->");
        x = input.nextInt();
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

        System.out.println(" -- Function g(x) --");
        System.out.println("Please enter the value of x  -->");
        x = input.nextInt();
        y = g(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

        System.out.println(" -- Multiplication table  --");
        System.out.println("Please enter the number to multiply -->");
        multiplicand = input.nextInt();
        for (int multiplier = 1 ; multiplier <= top ; multiplier++) {
            product = gettable (multiplicand, multiplier);
            System.out.println(+multiplicand + "*" + multiplier + "=" + product);

        }

    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

    public static int gettable(int multiplicand, int multiplier) {
        int product;

        product = multiplicand*multiplier;

        return product;

    }

}
