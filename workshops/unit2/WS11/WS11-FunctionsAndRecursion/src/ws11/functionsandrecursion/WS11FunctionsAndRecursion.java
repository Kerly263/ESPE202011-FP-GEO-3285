/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.functionsandrecursion;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class WS11FunctionsAndRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int dividend;
        int divisor;
        float quotient = 0;

        int y = 0;
        int x = 0;
        int result;

        int top = 12;
        int product;
        int table;
        int multiplying;

        

        System.out.println(" ～～ WELCOME ～～");

        System.out.println(" -- Division --");
        System.out.println("Please enter dividend -->");
        dividend = input.nextInt();
        System.out.println("Please enter divisor -->");
        divisor = input.nextInt();
        quotient = divideTwoNumbers(dividend, divisor);
        System.out.println("The quorient is -> " + quotient);

        System.out.println(" -- Square of a number --");
        System.out.println("Please enter number  -->");
        x = input.nextInt();
        y = ComputeSquare(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

        System.out.println(" -- Function g(x) --");
        System.out.println("Please enter the value of x  -->");
        x = input.nextInt();
        y = ComputeParabola(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

        System.out.println(" -- Multiplication table  --");
        System.out.println("Please enter the number to multiply -->");
        multiplying = input.nextInt();
        for (int multiplier = 1; multiplier <= top; multiplier++) {
            product = ShowTheMultiplicationTable(multiplying, multiplier);
            System.out.println(+multiplying + "*" + multiplier + "=" + product);
        }
        
        
        System.out.println(" -- Factorial  --");
        int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int ComputeSquare(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int ComputeParabola(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

    public static int ShowTheMultiplicationTable(int multiplying, int multiplier) {
        int product;

        product = multiplying * multiplier;

        return product;
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }   
}
