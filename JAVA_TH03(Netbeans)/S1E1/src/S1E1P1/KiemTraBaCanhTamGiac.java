package S1E1P1;

import java.util.Scanner;

public class KiemTraBaCanhTamGiac {
	public static void main(String[] args)
	{
		//Nhập 3 số nguyên dương
		Scanner myVar = new Scanner(System.in);
		double a,b,c;
		do{
			System.out.print("Nhập số nguyên dương a: ");
			a = myVar.nextDouble();
		}
		while(a <= 0);
		do{
			System.out.print("Nhập số nguyên dương b: ");
			b = myVar.nextDouble();
		}
		while(b <= 0);
		do{
			System.out.print("Nhập số nguyên dương c: ");
			c = myVar.nextDouble();
		}
		while(c <= 0);
		//kiểm tra a,b,c có hợp thành 1 tam giác không
		if (a + b > c && a + c > b && b + c > a)
		{
			double nuaChuVi = (a + b + c)/2;
			double dienTich = Math.sqrt(nuaChuVi*(nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));
			System.out.println("chu vi tam giac đó là: "+2*nuaChuVi);
			System.out.println("diện tích tam giác là: "+dienTich);
		}
		else
		{
			System.out.println("không phải độ dài 3 cạnh tam giác");
		}
	}

}
