package S1E4P1;

import java.util.Scanner;

public class PhanSoToiGian 
{

	public static void main(String[] args) 
	{
		Scanner myVar = new Scanner(System.in);
		System.out.println("Nhập vào hai số nguyên là tử số và mẫu số: ");
		System.out.print("tử số = ");
		int tuSo = myVar.nextInt();
		int mauSo;
		boolean kt = false;//kt để đánh dấu phân số âm hoặc dương
		//điều kiện mẫu phải khác 0,nhập sai thì nhập lại
		do
		{
			 System.out.print("mẫu số = ");
			 mauSo = myVar.nextInt();
		}
		while(mauSo == 0);
		//xét phân số âm
		if((tuSo < 0 && mauSo < 0) || (tuSo > 0 && mauSo > 0))
		{
			tuSo = Math.abs(tuSo);
			mauSo = Math.abs(mauSo);
		}
		else
		{
			kt = true;
			tuSo = Math.abs(tuSo);
			mauSo = Math.abs(mauSo);
			
		}
		int i = 2;
	    while(true)
	    {
	    	if(mauSo == 1 || tuSo == 0)
	    	{
	    		if (kt == true)
	    		{
	    		System.out.println("Phân số tối giản: "+(-tuSo/mauSo));
	    		break;
	    		}
	    		else
	    		{
	    			System.out.println("Phân số tối giản: "+(tuSo/mauSo));
	    			break;
	    		}
	    			
	    	}
	    	else if(i > tuSo || i > mauSo)
	    	{
	    		if (kt == true)
	    		{
	    			System.out.println("Phân số tối giản: "+(-tuSo)+"/"+mauSo);
	    			break;
	    		}
	    		else
	    		{	    		
	    		System.out.println("Phân số tối giản: "+tuSo+"/"+mauSo);
	    		break;
	    		}
	    	}    		
	    	else
	    	{
		    	if(tuSo % i == 0 && mauSo % i == 0)
		    	{
			    	tuSo /= i;
		    		mauSo /= i;
		    	}
		    	else
		    	{
		    		i++;
		    	}	    	  	
	        }
	    }
	      
	}
}
