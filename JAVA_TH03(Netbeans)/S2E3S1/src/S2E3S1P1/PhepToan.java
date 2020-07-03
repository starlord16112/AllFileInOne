/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E3S1P1;

/**
 *
 * @author DELL
 */
public class PhepToan {
    
    private double a;

    public PhepToan(double a, double b, char pheptoan) {
        this.a = a;
        this.b = b;
        this.pheptoan = pheptoan;
    }

    public PhepToan() {
    }
    
    private double b;

    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public double getB() {
        return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(double b) {
        this.b = b;
    }

    private char pheptoan;

    /**
     * Get the value of pheptoan
     *
     * @return the value of pheptoan
     */
    public char getPheptoan() {
        return pheptoan;
    }

    /**
     * Set the value of pheptoan
     *
     * @param pheptoan new value of pheptoan
     */
    public void setPheptoan(char pheptoan) {
        this.pheptoan = pheptoan;
    }


    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public double getA() {
        return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
    public void setA(double a) {
        this.a = a;
    }
    public void Calculate()
    {
        switch(this.pheptoan)
        {
                     case '+':
	    	System.out.print(a +" + "+b+" = "+(a+b));
	    	break;
	    case '-':
	    	System.out.print(a +" - "+b+" = "+(a-b));
	    	break;
	    case '*':
	    	System.out.print(a +" * "+b+" = "+(a*b));
	    	break;
	    case '/':
	    	if(b != 0)
	    	{
	    	System.out.print(a +" / "+b+" = "+(a/b));
	    	}
	    	else
	    	{
	    		System.out.println("error  divided by 0 ");
	    	}
	    	break;
	    default:
	    	System.out.println("error");
            
            
                
            
        }
    }

    
}
