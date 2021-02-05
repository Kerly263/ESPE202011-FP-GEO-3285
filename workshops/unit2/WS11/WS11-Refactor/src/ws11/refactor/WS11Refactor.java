/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.refactor;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class WS11Refactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int operator1;
        int operator2;
        int result;
        char option;

        do {

            System.out.print("Enter the operator 1: ");
            operator1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the operator 2: ");
            operator2 = scanner.nextInt();
            scanner.nextLine();

            if (operator1 % 2 == 0 && operator2 % 2 == 0) {
                ShowMultiplication(operator1, operator2);

            } else if (operator1 % 3 == 0 && operator2 % 3 == 0) {
                ShowAddition(operator1, operator2);

            } else if (operator1 % 7 == 0 && operator2 % 7 == 0) {
                ShowModulus(operator1, operator2);

            } else if (operator1 % 11 == 0 && operator2 % 11 == 0) {
                ShowMultiplicateTables(operator1, operator2);
            } else if (operator1 % 13 == 0 && operator2 % 13 == 0) {
                ShowDivision(operator1, operator2);
            } else {
                System.out.println("The program does not calculate this operation");
            }
                System.out.println("Do you want try it again? ,"
                    + " if you don’t, select w  ");
            option = scanner.nextLine().charAt(0);

        } while (option != 'w');
    }

    private static void ShowDivision(int operator1, int operator2) {
        int result;
        result = (operator1 / operator2);
        System.out.println("The division is:  " + operator1 + " / " + operator2 + " = " + result);
    }

    private static void ShowModulus(int operator1, int operator2) {
        int result;
        result = operator1 % operator2;
        System.out.println("The module is: " + operator1 + " % " + operator2 + " = " + result);
    }

    private static void ShowAddition(int operator1, int operator2) {
        int result;
        result = operator1 + operator2;
        System.out.println("The sum is: " + operator1 + " + " + operator2 + " = " + result);
    }

    private static void ShowMultiplication(int operator1, int operator2) {
        int result;
        result = operator1 * operator2;
        System.out.println("The multiplication is : " + operator1 + " x " + operator2 + " = " + result);
    }

    public static void ShowMultiplicateTables(int paramOperator1, int paramOperator2) {
        int result;

        System.out.println("The multiplication table of operand 1 is: ");
        for (int i = 1; i <= 12; i++) {
            result = (paramOperator1 * i);

            System.out.println(paramOperator1 + " x " + i + " = " + result);
        }
        System.out.println("The multiplication table of operand 2 is: ");
        if (paramOperator1 != paramOperator2) {
            for (int k = 1; k <= 12; k++) {
                System.out.println(paramOperator2 + " x " + k + " = " + (paramOperator2 * k));
            }
        }
    }
}
