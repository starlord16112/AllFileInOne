/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3E2P1;

/**
 *
 * @author DELL
 */
public class PhepTinh {
    private int ToanHang1;
    private int ToanHang2;
    private char ToanTu;

    public PhepTinh()
    {
        
    }

    public PhepTinh(int ToanHang1, int ToanHang2, char ToanTu) {
        this.ToanHang1 = ToanHang1;
        this.ToanHang2 = ToanHang2;
        this.ToanTu = ToanTu;
    }
    
    public int getToanHang2() {
        return ToanHang2;
    }

    public int getToanHang1() {
        return ToanHang1;
    }

    public char getToanTu() {
        return ToanTu;
    }

    public void setToanHang1(int ToanHang1) {
        this.ToanHang1 = ToanHang1;
    }

    public void setToanHang2(int ToanHang2) {
        this.ToanHang2 = ToanHang2;
    }

    public void setToanTu(char ToanTu) {
        this.ToanTu = ToanTu;
    }
    public boolean KiemTra(String s)
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
    public double TinhToan()
    {
       double kq = 0;
        switch(this.ToanTu)
        {
            
            case '+':
               
                kq += (this.ToanHang1 + this.ToanHang2);
                break;
              
            case '-':
                
                kq += (this.ToanHang1 - this.ToanHang2);
                break;
            case '*':
                
                kq += (this.ToanHang1 * this.ToanHang2);
                break;
            case '/':        
                if(this.ToanHang2 != 0)
                {
                    
                    kq += (this.ToanHang1 * 1.0 / this.ToanHang2);
                    
                }
              
               
                
                
                
                
                    
        }
        return kq;
    }
}
