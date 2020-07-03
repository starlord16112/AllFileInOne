/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E5P1;

/**
 *
 * @author DELL
 */
public class GiaiThua {
    
    private int n;

    /**
     * Get the value of n
     *
     * @return the value of n
     */
    public int getN() {
        return n;
    }

    /**
     * Set the value of n
     *
     * @param n new value of n
     */
    public void setN(int n) {
        this.n = n;
    }

    public GiaiThua() {
    }

    public GiaiThua(int n) {
        this.n = n;
    }
    public boolean KiemTra()
    {
        
         
              return n  > 0;
      
      
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

    
}
