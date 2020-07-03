/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E7S1P1;

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
        System.out.print("Nhập n = ");
        int n = myVar.nextInt();
        if(n > 0)
        {
            TinhTong obj = new TinhTong(n);
            System.out.println("Tổng cần tính: "+obj.Tong());       
        }
        else
        {
            System.out.println(n + " không hợp lệ");
        }
        
    }
    
}
