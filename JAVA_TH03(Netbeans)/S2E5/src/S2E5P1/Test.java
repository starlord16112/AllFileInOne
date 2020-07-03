/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E5P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.print("Nhap n =  ");
        int n = myVar.nextInt();
        GiaiThua obj = new GiaiThua(n);        
        if(obj.KiemTra())
        {
           System.out.print(obj.getN()+" != "+obj.TinhGT());
        }
        else
        {
              System.out.print(obj.getN()+" không hợp lệ");

        }
            
             
               
        /*do
        {*/
               
       /* }
        while(!obj.KiemTra());*/
        
        
        
        
    }
    
}
