package S1E5P1;

import java.util.Scanner;

//giải phương trình bậc nhất ax + b = 0
public class PhuongTrinhBacNhat {
	public static void main(String[] args)
	{
		Scanner myVar = new Scanner(System.in);
		System.out.println("Nhập hai số nguyên a,b: ");
		double a = myVar.nextInt();
		double b = myVar.nextInt();
		System.out.println("phương trình có dạng: "+a+"x + "+b+" = 0");
		if (a == 0)
		{
			if (b == 0)
				System.out.println("phương trình có vô số nghiệm");
			else
			{
				System.out.println("phương trình vô nghiệm");
			}
		}
		else
		{
			System.out.println("phương trình có nghiệm duy nhất: x = -b/a = "+(-b/a));
		}
	}

}
