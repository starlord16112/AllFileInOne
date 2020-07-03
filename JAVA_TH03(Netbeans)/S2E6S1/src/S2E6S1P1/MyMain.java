/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E6S1P1;

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
        Scanner myVar = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = myVar.nextInt();
        System.out.print("Nhap b: ");
        int b = myVar.nextInt();
         System.out.print("Nhap c: ");
        int c = myVar.nextInt();
        PhuongTrinhBac2 obj = new PhuongTrinhBac2(c,a,b);
    }
    
}
