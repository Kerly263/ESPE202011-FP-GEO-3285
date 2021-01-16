/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

/**
 *
 * @author USER
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option;
        
        do {

            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");            
            System.out.println("Enter you menu option -->");
            option = input.nextInt();
            
            switch(option) {
                
                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 2:
                    int minuend;
                    int subtrahend;
                    int difference;
                    System.out.println("enter minuend ->");
                    minuend = input.nextInt ();
                    System.out.println("enter subtrahend ->");
                    subtrahend = input.nextInt ();
                    difference = minuend - subtrahend;
                    System.out.println("The difference is -> " + difference);
                    break;
                case 3:
                    int multiplying;
                    int multiplier;
                    int product;
                    System.out.println("enter multiplying ->");
                    multiplying = input.nextInt ();
                    System.out.println("enter multiplier ->");
                    multiplier = input.nextInt ();
                    product = multiplying * multiplier;
                    System.out.println("The product is -> " + product);
                    break;
                case 4:
                    int dividend;
                    int divisor;
                    int quorient;
                    System.out.println("enter dividend ->");
                    dividend = input.nextInt ();
                    System.out.println("enter divisor ->");
                    divisor = input.nextInt ();
                    quorient = dividend/divisor;
                    System.out.println("The quorient is -> " + quorient);
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