/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquiz;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ArraysQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int HardwareStroreProducts=0;
        String[] products;
        float[] price;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Please enter the number the products ->");
        HardwareStroreProducts = scanner.nextInt();
        
        products = new String[HardwareStroreProducts];
        price = new float [HardwareStroreProducts];
        
        
        for (int i = 0; i < HardwareStroreProducts; i++){
            scanner.nextLine();
            System.out.print("Please enter the name of products" + i + "-->");
            products[i] = scanner.nextLine();
            System.out.println("Please enter" + products[i]+ "price -->");
            price[i] = scanner.nextFloat();
        }
        System.out.println(" Product -> /t price ");
        
        for (int i = 0; i < HardwareStroreProducts; i++){
            System.out.println(products[i] + "-->  /t" + price[i]);
        }
    }    
}
