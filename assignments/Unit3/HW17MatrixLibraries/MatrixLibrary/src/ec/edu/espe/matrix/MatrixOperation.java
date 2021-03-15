/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MatrixOperation {
    
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
    public static void ReadMatrix2Elements(int row2, int column2, int[][] m2, Scanner input) {
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.println("Please enter the value of the element " + i + "," + j + ": ");
                m2[i][j] = input.nextInt();
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

    public static void ShowMatrixSumResult(int row1, int column2, int column1, int[][] mR, int[][] m1, int[][] m2) {
        for(int i = 0 ; i < row1 ; i++){
            for (int j = 0 ; j < column2 ; j++) {
                for (int h = 0; h < column1; h++) {
                    mR[i][j] = m1[i][j] + m2[i][j];
                }
                System.out.print(mR[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void ShowMatrixSubtractionResult(int row1, int column2, int column1, int[][] mR, int[][] m1, int[][] m2) {
        for(int i = 0 ; i < row1 ; i++){
            for (int j = 0 ; j < column2 ; j++) {
                for (int h = 0; h < column1; h++) {
                    mR[i][j] = m1[i][j] - m2[i][j];
                }
                System.out.print(mR[i][j] + " ");
            }
            System.out.println("");
        }
    }
        public static void ShowMatrixMultiplicationResult(int row1, int column2, int column1, int[][] mR, int[][] m1, int[][] m2) {
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
}    
    
