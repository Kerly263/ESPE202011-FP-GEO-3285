/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println(" -- Factorial  --");
        int number = 5;
        int fact = 0;
        int result = 0;

        fact = ShowTheFactorial(number);

        System.out.println("Please enter the number");
        number = input.nextInt();

        System.out.println(" Fact of " + number + " is equal to --> " + ShowTheFactorial(number));
        fact = ShowTheFactorial(number);

        
    
        System.out.println(" -- Recursion Sum  --");
        result = SumRecursion(number);

        System.out.println("Please enter the number");
        number = input.nextInt();

        System.out.println(" The sum of " + number + " is equal to --> " + SumRecursion(number));
        number = SumRecursion(number);

               
        
        System.out.println(" -- Recursion of a word  --");

        String word = "Programming";
        System.out.println(InvertWord(word, word.length() - 1));

    }

    public static int ShowTheFactorial(int number) {
        int result;

        if (number == 1) {
            return 1;
        } else {
            result = number * ShowTheFactorial(number - 1);
        }
        return result;
    }

    public static int SumRecursion(int number) {

        int result;

        if (number == 1) {
            return 1;
        } else {
            result = number + SumRecursion(number - 1);
        }
        return result;
    }

    public static String InvertWord(String word, int length) {

        if (length == 0) {
            return word.charAt(length) + "";
        } else {
            return word.charAt(length) + (InvertWord(word, length - 1));
        }
    }
}
