/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AUTHOR: KERLY NAYELI MARIÑO");
        Scanner input = new Scanner(System.in);
        
        int days = 0;
        int sheets = 7;
        
        float blackInk = 0.0F;
        double blackInkOfDays = 0.5;

        System.out.println("Leaf consumption per day");
        System.out.println("Please enter enter the number of days  -->");
        days = input.nextInt();
        SheetConsumption(days, sheets);
        
        
        
        System.out.println("Ink cartridge consumption");
        System.out.println("Enter the amount of black ink (ml)");
        blackInk = input.nextInt();
        System.out.println("Enter the number the days ");
        blackInkOfDays = input.nextInt();
        BlackInkConsumption(blackInk, (int) blackInkOfDays);
    }

    public static void BlackInkConsumption(float blackInk, int blackInkOfDays) {
        int totalblackInk;
        totalblackInk = (int) (blackInk /blackInkOfDays);
        System.out.println("You will consume" + totalblackInk);
    }

    public static void SheetConsumption(int days, int sheets) {
        int totalsheets;
        totalsheets = days*sheets;
        System.out.println("You will consume" + totalsheets + "sheets in" + days);
    }
    
}
