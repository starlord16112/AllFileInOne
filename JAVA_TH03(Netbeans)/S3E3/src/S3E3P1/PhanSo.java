/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3E3P1;

/**
 *
 * @author DELL
 */
public class PhanSo {
    private int TuSo;
    private int MauSo;

    public PhanSo()
    {
        
    }
    public int getMauSo() {
        return MauSo;
    }

    public int getTuSo() {
        return TuSo;
    }

    public void setMauSo(int MauSo) {
        this.MauSo = MauSo;
    }

    public void setTuSo(int TuSo) {
        this.TuSo = TuSo;
    }

    public PhanSo(int TuSo, int MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
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
    public String rutgon()
    {
                String kq = "";
                boolean kt = false;//kt để đánh dấu phân số âm hoặc dương		
		//xét phân số âm
		if((this.TuSo < 0 && this.MauSo < 0) || (this.TuSo > 0 && this.MauSo > 0))
		{
			this.TuSo = Math.abs(this.TuSo);
			this.MauSo = Math.abs(this.MauSo);
		}
		else
		{
			kt = true;
			this.TuSo = Math.abs(this.TuSo);
			this.MauSo= Math.abs(this.MauSo);
			
		}
		int i = 2;
	    while(true)
	    {
	    	if(this.MauSo == 1 || this.TuSo == 0)
	    	{
	    		if (kt == true)
	    		{
	    		kq += -this.TuSo + "/" +this.MauSo;
	    		break;
	    		}
	    		else
	    		{
                            kq += this.TuSo + "/" +this.MauSo;    			
	    		    break;
	    		}
	    		
	    	}
	    	if(i > this.TuSo || i > this.MauSo)
	    	{
	    		if (kt == true)
	    		{
	    			kq += -this.TuSo +"/"+ this.MauSo;
	    			break;
	    		}
	    		else
	    		{
                            kq += this.TuSo+"/"+this.MauSo;
	    		
	    		break;
	    		}
	    	}    		
	    	else
	    	{
		    	if(this.TuSo % i == 0 && this.MauSo % i == 0)
		    	{
			    	this.TuSo /= i;
		    		this.MauSo /= i;
		    	}
		    	else
		    	{
		    		i++;
		    	}	    	  	
	        }
	    }
        return kq;
    }
    public double Tinhtoan()
    {
        double s = this.TuSo * 1.0 / this.MauSo;
        return s;
    }
            
   
    
}
