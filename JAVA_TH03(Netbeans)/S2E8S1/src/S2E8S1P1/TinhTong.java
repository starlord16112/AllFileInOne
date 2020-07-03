/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E8S1P1;

/**
 *
 * @author DELL
 */
public class TinhTong {
    
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
    public boolean KT()
    {
        return n  > 0;
    }
    public void Tong()
    {
        double sum = 0;
        if(KT())
        {
                                   for(double i = 0;i <= n;i++)
		{
			sum += 1/(2 * i + 1);
		}
                                   System.out.println(sum);
        }
        else
        {
            System.out.println(n+" không hợp lệ");
        }
        
    }

    
}
