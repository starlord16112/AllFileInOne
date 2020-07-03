/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E7S1P1;

/**
 *
 * @author DELL
 */
public class TinhTong {
    //tính tổng s = 1/2+1/4+...+1/2*n
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

    public TinhTong() {
    }

    public TinhTong(int n) {
        this.n = n;
    }
    public double Tong()
    {
        double sum = 0;
        for(double i = 1; i <= n;i++)
        {
            sum += 1/(2 * i);      
        }
        return sum;
    }
    

    
}
