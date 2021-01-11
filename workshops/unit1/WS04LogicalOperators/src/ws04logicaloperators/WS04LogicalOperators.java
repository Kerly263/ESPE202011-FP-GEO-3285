/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws04logicaloperators;

/**
 *
 * @author USER
 */
public class WS04LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Kerly Mariño AND TRUTH TABLE odd numbers -> &&  even numbers ->||");
        System.out.println("=================================================");
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        

        p = true;
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        

        p = false;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        

        p = false;
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
    }
    
}
