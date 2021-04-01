/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SortedColors.controller;

/**
 *
 * @author USER
 */
public class Sorting {
    
    public int[] sortByBubbleSort(int[] colors){
    int n = colors.length;
        int temp;
   
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6 - j; i++) {
                if (colors[i] > (colors[i + 1])) {
                    
                    temp = colors[i];
                    colors[i] = colors[i + 1];
                    colors[i + 1] = temp;
                }
            }
            System.out.println("");
        }
        return colors;
    }
}
