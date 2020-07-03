/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3E4P1;

/**
 *
 * @author DELL
 */
public class PhuongTrinhBacNhat {
    
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int b;

    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(int b) {
        this.b = b;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public PhuongTrinhBacNhat() {
    }
    
    public String toString()
    {
        String kq = a + "x" + " + " + b  + " = 0";
        return kq;
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
    public String GiaiPT()
    {
        String kq = "";
        if(this.a != 0)
        {
            kq = "x = " + (- this.b * (1.0) / this.a);
        }
        else
        {
            if(this.b != 0)
            {
                kq = "Vô nghiệm";
            }
            else
            {
                 kq = "Vô số nghiệm";
                
            }
        }
        return kq;
    }

}
