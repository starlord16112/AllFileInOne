package S1E1P1;

import java.util.Scanner;

public class PhepToan {

	public static void main(String[] args) {
		Scanner myVar = new Scanner(System.in);
		System.out.print("nhập hai số thực a,b và 1 phép toán: ");
		double a = myVar.nextDouble();
		double b = myVar.nextDouble();
		char phepToan = myVar.next().charAt(0);
	    switch (phepToan)
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
	    		System.out.println("không chia được");
	    	}
	    	break;
	    default:
	    	System.out.println("lỗi");
	    	
	    }

	}

}
