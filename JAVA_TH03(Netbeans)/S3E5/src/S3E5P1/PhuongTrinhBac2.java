/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3E5P1;

/**
 *
 * @author DELL
 */
public class PhuongTrinhBac2 {

    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public PhuongTrinhBac2(int a, int b, int c) {
        this.c = c;
        this.a = a;
        this.b = b;
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
    public String toString()
    {
        String kq = a + "x^2" + " + " + b  + "x" +" + "+ c +" = 0";
        return kq;
    }

    public String GiaiPT()
    {
        String kq = "";
                double delta = Math.pow(b,2) - 4 * a * c;
		if (delta < 0)
		{
			 kq += "phương trình vô nghiệm";
		}
		else if(delta == 0)
		{
			kq += "x1 = x2 = "+((-b * 1.0 )/ (2 * a));
			
		}
		else
		{
			
			kq += "x1 = "+((-b + Math.sqrt(delta))/2 * a) + "; x2 = "+((-b - Math.sqrt(delta))/2 * a);

		}
                return kq;
    }
    public PhuongTrinhBac2() {
    }

    
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
