package S1E2P1;

import java.util.Scanner;

public class TinhGiaiThuaCuaN {
    public static void main(String[] args)
    {
    	Scanner myVar = new Scanner(System.in);
    	System.out.print("nhap số nguyên n: ");
    	int n = myVar.nextInt();
    	int giaiThua = 1;
    	if (n > 0)
    	{
    		int i = 1;
    		while(i <= n)
    		{
    			giaiThua *= i;
    			i++;
    		}
    		System.out.println(n + " giai thừa = "+giaiThua);
    	}
    	else if (n == 0)
    	{
    		System.out.println(n + " giai thừa = "+giaiThua);
    	}
    	else
    	{
    		System.out.println(n + " nhỏ hơn 0");
    	}
    }
}
