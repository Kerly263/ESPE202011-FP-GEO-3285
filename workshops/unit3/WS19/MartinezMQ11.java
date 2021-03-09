package martinezmq11;

import java.util.Scanner;

public class MartinezMQ11 {

    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int result;
        int num[] = {12, 23, 34, 98, 87, 65, 0};
        boolean theNumberThis = false;

        int x;

        System.out.print("Program that calculates the sum \n \n");
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the first number:");
        number1 = reader.nextInt();
        System.out.println("enter the second number:");
        number2 = reader.nextInt();
        System.out.println("enter the third number:");
        number3 = reader.nextInt();
        System.out.println("enter the fourth number:");
        number4 = reader.nextInt();
        System.out.println("enter the fifth number :");
        number5 = reader.nextInt();
        result = showTheAdd(number1, number2, number3, number4, number5);
        System.out.println("the sum of " + number1 + " + " + number2 + " + " + number3 + " + " + number4 + " + " + number5 + " = " + result);
        System.out.print("Program that calculates the average of three numbers \n \n");

        System.out.print("enter the first number:");
        int n1 = reader.nextInt();

        System.out.print("enter the second number:");
        int n2 = reader.nextInt();

        System.out.print("enter the third number:");
        int n3 = reader.nextInt();

        float Result = showTheAverage(n1, n2, n3);
        System.out.print("the result of the average of three numbers is:" + Result);
         System.out.println("");
        System.out.print("Program that checks the number within the array \n \n");
        System.out.println("");
        System.out.println("enter the number:");
         

        System.out.print("search number: ");
        int numero;
        numero=reader.nextInt();

        for(x=0;x<num.length;x++){
            if (numero == num[x]) {
                System.out.println("The number is in the index "+x+", in position "+(x+1));
                theNumberThis = true;
            }
        }

        if(theNumberThis ==false) {
            System.out.println("The number is not");
        }


   } private static float showTheAverage(int n1, int n2, int n3) {
        float Result = (float) (n1 + n2 + n3) / 3;
        return Result;
    }

    private static int showTheAdd(int number1, int number2, int number3, int number4, int number5) {
        int result;
        result = number1 + number2 + number3 + number4 + number5;
        return result;
    }
}
