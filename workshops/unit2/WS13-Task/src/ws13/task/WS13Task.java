/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        float area = 0.0F;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Area of A Rhombus");
            System.out.println("2. -> Area Of A Circule");
            System.out.println("3. -> Area of A Trapeze");
            System.out.println("4. -> Kinetic energys");
            System.out.println("5. -> Elastic potential energy");
            System.out.println("6. -> Mechanical work");
            System.out.println("7. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    int D;
                    int d;

                    System.out.println("Enter the major diagonal --> ");
                    D = input.nextInt();
                    System.out.println("Enter the minor diagonal --> ");
                    d = input.nextInt();
                    area = AreaRhombus(D, d);
                    System.out.println(" The area of a rhombus is --> " + area);
                    break;
                case 2:
                    int r;
                    double π = 3.14;
                    System.out.println("Enter the radius -> ");
                    r = input.nextInt();
                    area = AreaCircule(r, π);
                    System.out.println(" The area of triangle --> " + area);
                    break;
                case 3:
                    int B;
                    int b;
                    int h;
                    System.out.println("Enter the major base --> ");
                    B = input.nextInt();
                    System.out.println("Enter the minor base --> ");
                    b = input.nextInt();
                    System.out.println("Enter the height --> ");
                    h = input.nextInt();
                    area = Areatrapeze(B, b, h);
                    System.out.println(" The area of trapeze is --> " + area);
                    break;
                case 4:
                    float m = 0.0F;
                    int v;
                    float Ec = 0.0F;

                    System.out.println("Enter the mass in kg --> ");
                    m = input.nextInt();
                    System.out.println("Enter the speed in (m / s) --> ");
                    v = input.nextInt();
                    Ec = KineticEnergys(v, m);
                    System.out.println(" The Kinetic energys is --> " + Ec);
                    break;
                case 5:
                    float k = 0.0F;
                    int x;
                    int Epe;
                    System.out.println("Elastic constant (N/m) -> ");
                    k = input.nextInt();
                    System.out.println("deformation (m -> ");
                    x = input.nextInt();
                    Epe = (int) ElasticPotentialEnergy(k, x);
                    System.out.println("The elastic potential energy is --> " + Epe);
                    break;
                case 6:
                    int F;
                    int displacement;
                    int W;
                    System.out.println("Enter the force (N)--> ");
                    F = input.nextInt();
                    System.out.println("Enter the displacement (m) --> ");
                    displacement = input.nextInt();
                    W = (int) MechanicalWork(F, displacement);
                    System.out.println(" The Mechanical work --> " + W);
                    break;

                case 7:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (option != 7);
    }

    public static float AreaRhombus(int D, int d) {
        float area = 0.0F;

        area = (D * d) / 2;

        return area;
    }

    public static float AreaCircule(int r, double π) {
        float area = 0.0F;

        area = (float) (π * (r * r));

        return area;
    }

    public static float Areatrapeze(int B, int b, int h) {
        float area = 0.0F;

        area = ((B + b) * h) / 2;

        return area;
    }

    public static float KineticEnergys(int v, float m) {
        float Ec = 0.0F;

        Ec = m * (v * v) / 2;

        return Ec;
    }

    public static float ElasticPotentialEnergy(float k, int x) {
        float Epe = 0.0F;

        Epe = (int) (k * (x * x) / 2);

        return Epe;
    }

    public static float MechanicalWork(int F, int displacement) {
        float W = 0.0F;

        W = F * displacement;

        return W;
    }
}