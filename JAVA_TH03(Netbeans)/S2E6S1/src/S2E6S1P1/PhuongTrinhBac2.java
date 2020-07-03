/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E6S1P1;

/**
 *
 * @author DELL
 */
public class PhuongTrinhBac2 {

    public PhuongTrinhBac2(int c, int a, int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }

    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private int a;

    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public int getA() {
        return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
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

    public PhuongTrinhBac2() {
    }
    public boolean kt()
    {
        return (a != 0);
    }
    public void giaiPT()
    {
                         if(kt())
                         {
                                   double delta = Math.pow(b,2) - 4 * a * c;
		if (delta < 0)
		{
			System.out.println("phương trình vô nghiệm");
		}
		else if(delta == 0)
		{
			System.out.println("phương trình có nghiệm kép x1 = x2 = "+(-b/2*a));
			
		}
		else
		{
			System.out.println("phương trình có hai nghiệm phân biệt: ");
			System.out.println("x1 = "+((-b + Math.sqrt(delta))/2 * a));
			System.out.println("x2 = "+((-b - Math.sqrt(delta))/2 * a));

		}
                         }
                         else
                         {
                             System.out.println("a phải khác 0");
                         }
    }
    
}
