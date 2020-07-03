/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E2P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
  
  private int n = 50;
  private int k = 0;
  private HocVien[] dshv = new HocVien[n];
  Scanner s = new Scanner(System.in);
  public void NhapHocVien()
  {
      if(k < n)
      {
            System.out.println("input infor of this student: ");
            System.out.print("Ho ten: ");
            String ht = (new Scanner(System.in)).nextLine();
            System.out.print("Ma hv: ");
            String ma = (new Scanner(System.in)).nextLine();
            System.out.print("Que quan: ");
            String qq = (new Scanner(System.in)).nextLine();
            System.out.print("Diem: ");
            double d = s.nextDouble();
            dshv[k] = new HocVien(d,ht,qq,ma);
            k++;
      }
      else
      {
          System.out.print("stack overflow");
      }
      
      
      
      
      
  }
  public void HienThiHocVien()
  {
      System.out.println("list student: ");
      for(int i = 0;i < k;i++)
      {
          System.out.println(dshv[i].getMahv()+"--"+dshv[i].getHoten());
      }     
  }
  public void TimKiemHocVien(String s)
  {
       for(int i = 0;i < k;i++)
      {
          if(dshv[i].getHoten() == s)
          {
              System.out.print(dshv[i].getMahv()+"--"+dshv[i].getQuequan()+"--"+dshv[i].getDiemThi());
              break;
              
          }
      }     
       System.out.print("no exsist");
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Test t1 = new Test();
       while(true)
       {
           System.out.print("do you want input a student?????? (enter 'n' for break):  ");
           char c = (new Scanner(System.in)).next().charAt(0);
           if(c == 'n')
               break;
           else
           {
              t1.NhapHocVien();
           }
       }
       t1.HienThiHocVien();
       System.out.print("input full name of student for search: ");
       String s = (new Scanner(System.in)).nextLine();
       t1.TimKiemHocVien(s);
        
    }
    
}
