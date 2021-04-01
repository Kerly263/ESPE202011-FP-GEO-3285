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
public class Searcher {
    
    public int findColors(String[] array, String colors){
        int i;
        int n = array.length;
        for (i = 0; i < n; i++){
            if (colors.equals(array[i])){
                return 1;
            }
        }
        return -1;
    } 

    public int findColors(int[] colors, int dataToFind) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
