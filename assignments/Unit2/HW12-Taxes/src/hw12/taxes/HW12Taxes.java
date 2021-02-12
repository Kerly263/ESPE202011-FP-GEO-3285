/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.taxes;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        

        System.out.println(" ========== Tax inquiry ========== ");
        System.out.println(" ======= IVA ====== ");
        System.out.println(" Please enter the net value of the product");
        double product = 0;
        product = input.nextInt();
        double iva = 0;
        iva = (double) (product * 0.12);
        System.out.println(" The IVA the product is " + (iva));
        
        
        
        System.out.println(" ========= Income Tax ======= ");               
        float AnnualIncome;
        float AnnualDeducible = 0.0F;
        float total = 0.0F;
        float taxBase = 0.0F;
        float basicFraction = 0.0F;
        float overBaseTax = 0.0F;
        float incomeTax = 0.0F;

        System.out.println("Enter your Annual Salary");
        AnnualIncome = input.nextFloat();
        System.out.println("Enter your Annual Deducible");
        AnnualDeducible = input.nextFloat();
        total = TaxBase( AnnualIncome, AnnualDeducible);
        System.out.println("Your basic fraction is " + total);
        
        System.out.println("Your Tax Base is --> " + taxBase);
        basicFraction = computeBasicFraction(taxBase, (int) basicFraction);
        System.out.println("Your basic fraction is " + basicFraction);
        overBaseTax = computeIncomeTax(taxBase, overBaseTax);
        System.out.println("The value of the Income Tax over base is --> " + overBaseTax);
        incomeTax = basicFraction + overBaseTax;
        System.out.println("Your Income Tax to pay is $" + incomeTax);        
        
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= ISD =======");
            System.out.println("1. -> Transfer of money abroad");
            System.out.println("2. -> International transfers and sending currency");
            System.out.println("3. -> Public shows");
            System.out.println("4. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            int amount;

            switch (option) {

                case 1:              
                    System.out.println("Total Amount->");
                    amount = input.nextInt();
                    total = (int) TransferMoneyAbroad(amount);
                    System.out.println("Total to pay -> " + total);
                    break;
                
                case 2:
                    System.out.println("Total Amount->");
                    amount = input.nextInt();
                    total = (int) InternationalTransfers(amount);
                    System.out.println("Total to pay -> " + total);
                    break;
                    
                case 3:
                    System.out.println("Total Amount->");
                    amount = input.nextInt();
                    total = (int) PublicShows(amount);
                    System.out.println("Total to pay -> " + total);
                    break;
                    
                 
                case 4:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } 
    while (option != 5);    
    
   }
        
    public static int computeBasicFraction(float taxBase, int basicFraction) {
        if (taxBase < 11212) {
            return 0;
        } else {
            if (taxBase < 14285) {
                return 0;
            } else {
                if (taxBase < 17854) {
                    return 154;
                } else {
                    if (taxBase < 21442) {
                        return 511;
                    } else {
                        if (taxBase < 42874) {
                            return 64297;
                        } else {
                            if (taxBase < 64297) {
                                return 4156;
                            } else {
                                if (taxBase < 85729) {
                                    return 8440;
                                } else {
                                    if (taxBase < 144288) {
                                        return 13798;
                                    } else {
                                        if (taxBase > 144288) {
                                            return 22366;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return basicFraction;
    }
    public static float computeIncomeTax(float taxBase, float overBaseTax) {
        if (taxBase < 11212) {
            return 0;
        } else {
            if (taxBase < 14285) {
                return (float) ((taxBase - 11212) * 0.05);
            } else {
                if (taxBase < 17854) {
                    return (float) ((taxBase - 14285) * 0.10);
                } else {
                    if (taxBase < 21442) {
                        return (float) ((taxBase - 17854) * 0.12);
                    } else {
                        if (taxBase < 42874) {
                            return (float) ((taxBase - 21442) * 0.15);
                        } else {
                            if (taxBase < 64297) {
                                return (float) ((taxBase - 42874) * 0.20);
                            } else {
                                if (taxBase < 85729) {
                                    return (float) ((taxBase - 64297) * 0.25);
                                } else {
                                    if (taxBase < 144288) {
                                        return (float) ((taxBase - 85729) * 0.30);
                                    } else {
                                        if (taxBase > 144288) {
                                            return (float) ((taxBase - 144288) * 0.35);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return overBaseTax;
    }
         public static float TaxBase( float AnnualIncome, float AnnualDeducible){
        float total = 0.0F;

        total = (int)(AnnualIncome - AnnualDeducible);
        
        return total;     
    }

    public static double TransferMoneyAbroad(int amount) {

        float total = 0.0F;
        double freeAmount = 1200.00;
        double tariff = 0.05;
        
        total = (int) (( amount -  freeAmount) *  tariff);

        return total;
    }
    public static double InternationalTransfers(int amount) {

        float total = 0.0F;
        double freeAmount = 5017.33;
        double tariff = 0.05;
        
        total = (int) (( amount -  freeAmount) *  tariff);

        return total;
    }
    public static double PublicShows(int amount) {
        
        float total = 0.0F;
        double tariff = 0.05;
        
        total = (int) (amount *  tariff);

        return total;   
    }
}
