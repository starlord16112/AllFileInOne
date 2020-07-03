/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E6P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class DLNhanVien {
        private static int n = 50;
        private static int k = 0;
        private static NhanVien[] dsnv = new NhanVien[n];

  
        
        static Scanner s = new Scanner(System.in);
        public static void NhapNhanVien()
        {
            System.out.print("Nhap ma nv: ");
            String Manv = new Scanner(System.in).next();
            System.out.print("Nhap ho ten: ");
            String Hoten = new Scanner(System.in).nextLine();
            System.out.print("Nhap que quan: ");
            String  Que = new Scanner(System.in).nextLine();
            System.out.print("Nhap he so luong: ");
            double hesoluong = s.nextDouble();
            
            NhanVien nv = new NhanVien(Manv,Hoten,Que,hesoluong);
            dsnv[k++] = nv;          
        }
        public static void HienThiNhanVien()
        {
        System.out.println("STT\t\tMaNv\t\tHoten\t\t\tQue\t\tHesoluong");
        for(int i = 0;i < n ;i++)
         {
             System.out.println((i + 1)+"\t\t"+dsnv[i].getManv()+"\t\t"+dsnv[i].getHoten()+"\t\t\t"+dsnv[i].getQue()+"\t\t"+dsnv[i].getHesoluong());
         }
            
        }
        public static void TimKiemNhanVien(String HoTen)
        {
            
        }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Scanner myVar = new Scanner(System.in);
        do
        {
            System.out.print("Nhap vao thong tin 1 nv(y or n): ");
            char kt = myVar.next().charAt(0);
            if(kt == 'n')
                break;  
            DLNhanVien.NhapNhanVien(); 
        }
        while(DLNhanVien.k  < n);
        System.out.println("Danh sach nhan vien: ");
        DLNhanVien.HienThiNhanVien();
        System.out.print("Nhap ten nhan vien can tim kiem: ");
        String ten = new Scanner(System.in).nextLine();
        DLNhanVien.TimKiemNhanVien(ten);
        
       
        
    }
    
}
