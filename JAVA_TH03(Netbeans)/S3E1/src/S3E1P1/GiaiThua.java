/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3E1P1;

/**
 *
 * @author DELL
 */
public class GiaiThua {
    
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public GiaiThua() {
    }

    public GiaiThua(int n) {
        this.n = n;
    }
    public int TinhGT()
    {
        int giaiThua = 1,i = 1;
         while( i  <= n )
            {
                giaiThua *= i;
                i++;
            }          
        
        return giaiThua;
    }
    public boolean KiemTra()
    {
        
         
              return n  > 0;
      
      
    }
    
    
}
    

    

