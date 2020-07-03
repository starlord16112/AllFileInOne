/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E3S1P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b;
        char c;
        Scanner myVar = new Scanner(System.in);
        System.out.print("nhập a: ");
        a = myVar.nextDouble();
        System.out.print("nhập b: ");
        b = myVar.nextDouble();
        System.out.print("nhập một phép toán: ");
        c = new Scanner(System.in).next().charAt(0);
        PhepToan obj = new PhepToan(a,b,c);
        obj.Calculate();
    }
    
}
