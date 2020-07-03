/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

    
public class Main {
    static boolean KiemTra(String s)
    {
     boolean kq = true;
     try
     {
         int kt = Integer.parseInt(s);
     }
     catch(Exception e)
     { 
         kq = false;
     }
     return kq;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "mmmmfanf";
        if(KiemTra(a))
        {
            System.out.println("true");
        }
                
    }
    
}
