/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int []ratings = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x;
        int result;
        
        System.out.println("Enter the grade to search -->");
        x = input.nextInt();
        result = search(ratings, x);
        System.out.println("The ratings is -->" +result);
    }

    public int search(int ratings[], int x) {
        int n = ratings.length;

        for (int i = 0; i < n; i++) {
            if (ratings[i] == x) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(int ratings[], int left, int right, int x) 
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (ratings[mid] == x) 
                return mid;
            
            if (ratings[mid] > x) 
                return binarySearch(ratings, left, mid - 1, x);
            
            return binarySearch(ratings, mid + 1, right, x);
        }
        
        return -1;
    }
}
