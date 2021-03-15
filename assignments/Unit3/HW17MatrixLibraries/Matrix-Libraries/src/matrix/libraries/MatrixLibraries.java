/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.libraries;

import ec.edu.espe.matrix.MatrixOperation;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix 1: ");
        int row1 = input.nextInt();
        System.out.println("Enter the number of columns in matrix 1: ");
        int column1 = input.nextInt();
        System.out.println("Enter the number of rows in matrix 2: ");
        int row2 = input.nextInt();
        System.out.println("Enter the number of columns in matrix 2: ");
        int column2 = input.nextInt();
        
        System.out.println(" ~~~ Dimensions entered ~~~");
        System.out.println("-- Matrix 1 the: " + row1 + "x" + column1 + " --");
        System.out.println("-- Matrix 2 the: " + row2 + "x" + column2 + " --");
        
        if (column1 == row2) {
            int[][] m1 = new int[row1][column1];
            int[][] m2 = new int[row2][column2];
            int[][] mR = new int[row1][column2];
            System.out.println("");
            System.out.println(" ~~Matrix 1 values~~");
            MatrixOperation.ReadMatrix1Elements(row1, column1, m1, input);
            
            
            System.out.println("~~Matrix 2 values~~");
            MatrixOperation.ReadMatrix2Elements(row2, column2, m2, input); 
            
            System.out.println("~~~ Result of Sum~~~");
            MatrixOperation.ShowMatrixSumResult(row1, column2, column1, mR, m1, m2);
            
            System.out.println("~~~ Result of Substraction~~~");
            MatrixOperation.ShowMatrixSubtractionResult(row1, column2, column1, mR, m1, m2);

            System.out.println("~~~ Result of multiplication ~~~");
            MatrixOperation.ShowMatrixMultiplicationResult(row1, column2, column1, mR, m1, m2);
        } else {
            System.out.println("Error");    
        }    
    }   
}
