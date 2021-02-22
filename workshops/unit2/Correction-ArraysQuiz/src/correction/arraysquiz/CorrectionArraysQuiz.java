/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correction.arraysquiz;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CorrectionArraysQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total0fPlayers=0;
        String[] players;
        float[] goalAverages;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Please enter the amount of players you want to record ->");
        total0fPlayers = scanner.nextInt();
        
        players = new String[total0fPlayers];
        goalAverages = new float [total0fPlayers];
        
        
        for (int i = 0; i < total0fPlayers; i++){
            scanner.nextLine();
            System.out.print("Please enter the name of player # " + i + "-->");
            players[i] = scanner.nextLine();
            System.out.println("Please enter" + players[i]+ "goals average -->");
            goalAverages[i] = scanner.nextFloat();
        }
        System.out.println(" Player -> /t goal average ");
        
        for (int i = 0; i < total0fPlayers; i++){
            System.out.println(players[i] + "-->  /t" + goalAverages[i]);
        }
    }    
}
