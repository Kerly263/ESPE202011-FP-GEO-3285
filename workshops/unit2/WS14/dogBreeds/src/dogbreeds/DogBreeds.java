/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogbreeds;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DogBreeds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]dogBreeds;
        String[] dogs = {"Bulldog, Poodle, Husky"};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops -->");
        n = input.nextInt();
        
        dogBreeds = new int[n];
//        chickens = new String [20];
//        weightsByCoop = new float [n];
        
//        eggsByCoop[0] = 7;
//        eggsByCoop[1] = 9;
//        eggsByCoop[2] = 3;
//        eggsByCoop[3] = 9;
//        eggsByCoop[4] = 8;

        for(int i=0; i < n; i++){
            System.out.println("Enter the number of eggs of the coop " + (i+1) + "-->");
            dogBreeds[i] = input.nextInt();    
        }
        for (int eggs : dogBreeds){
            System.out.println("egss of coop are " + eggs);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("eggs of the coop " + (i + 1) + " -> " + dogBreeds[i]);
        }
        for (String chicken : dogs) {
            System.out.println("chicken name -> " + chicken);
        }
        for (int i = 0; i < weightsByCoop.length ; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + weightsByCoop[i]);
        }
    }
    
}
