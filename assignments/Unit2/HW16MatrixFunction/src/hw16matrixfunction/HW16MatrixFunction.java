/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunction;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW16MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix 1: ");
        int row1 = scanner.nextInt();
        System.out.println("Enter the number of columns in matrix 1: ");
        int column1 = scanner.nextInt();
        System.out.println("Enter the number of rows in matrix 2: ");
        int row2 = scanner.nextInt();
        System.out.println("Enter the number of columns in matrix 2: ");
        int column2 = scanner.nextInt();
        
        System.out.println(" ~~~ Dimensions entered ~~~");
        System.out.println("-- Matrix 1 the: " + row1 + "x" + column1 + " --");
        System.out.println("-- Matrix 2 the: " + row2 + "x" + column2 + " --");
        
        if (column1 == row2) {
            int[][] m1 = new int[row1][column1];
            int[][] m2 = new int[row2][column2];
            int[][] mR = new int[row1][column2];
            System.out.println("");
            System.out.println(" ~~Matrix 1 values~~");
            ReadMatrix1Elements(row1, column1, m1, scanner);
            
            System.out.println("~~Matrix 2 values~~");
            ReadMatrix2Elements(row2, column2, m2, scanner);

            System.out.println("~~~ Result of multiplication ~~~");
            ShowMatrixResult(row1, column2, column1, mR, m1, m2);
        } else {
            System.out.println("Error");    
        }    
    }

    public static void ShowMatrixResult(int row1, int column2, int column1, int[][] mR, int[][] m1, int[][] m2) {
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int h = 0; h < column1; h++) {
                    mR[i][j] += m1[i][h] * m2[h][j];
                }
                System.out.print(mR[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void ReadMatrix2Elements(int row2, int column2, int[][] m2, Scanner scanner) {
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.println("Please enter the value of the element " + i + "," + j + ": ");
                m2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 2");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void ReadMatrix1Elements(int row1, int column1, int[][] m1, Scanner scanner) {
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.println("Please enter the value of the element " + i + "," + j + ": ");
                m1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matrix 1");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
                        