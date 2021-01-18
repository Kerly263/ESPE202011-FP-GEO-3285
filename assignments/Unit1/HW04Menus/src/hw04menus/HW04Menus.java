/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        
        int option;
                
        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Module");
            System.out.println("2. -> Area Of A Triangle");
            System.out.println("3. -> Perimeter Of a Triangle");
            System.out.println("4. -> Volume Of a Cylinder");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    int module;
                    int division;
                    int divisor;      
                    System.out.println("enter division --> ");
                    division = input.nextInt ();
                    System.out.println("enter divisor --> ");
                    divisor = input.nextInt ();
                    module = divisor / division;
                    System.out.println(" The module is --> " + module);
                    break;
                case 2:
                    int area;
                    int base;
                    int height;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height-> ");
                    height = input.nextInt();
                    area = base * height / 2;
                    System.out.println(" The area of the triangle --> " + area);
                    break;     
                case 3:
                    int perimeter;
                    int side;
                    System.out.println("enter side --> ");
                    side = input.nextInt();
                    perimeter = side + side + side;
                    System.out.println(" The perimeter of the triangle --> " + perimeter);
                    break;
                    
                case 4:
                    int volume;
                    int radius;
                    int π;
                    
                    System.out.println("enter radius --> ");
                    radius = input.nextInt ();
                    System.out.println("enter π --> ");
                    π = input.nextInt ();
                    volume = (4/3) * π * (radius*radius*radius);
                    System.out.println(" The volume of sphere --> " + volume);
                    break;
                    
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (option != 5);
    }
    
}


