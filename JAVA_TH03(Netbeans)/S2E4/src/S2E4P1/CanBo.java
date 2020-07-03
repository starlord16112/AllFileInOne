/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E4P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CanBo extends GiangVien {
    private  String ChucVu;
    private double HeSo;
    Scanner  s = new Scanner(System.in);

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public void setHeSo(double HeSo) {
        this.HeSo = HeSo;
    }


    public String getChucVu() {
        return ChucVu;
    }

    public double getHeSo() {
        return HeSo;
    }


    public CanBo(String ChucVu, double HeSo, String Ma, String HoTen, String DiaChi) {
        super(Ma, HoTen, DiaChi);
        this.ChucVu = ChucVu;
        this.HeSo = HeSo;
    }

    public CanBo() {
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma: ");
        this.setMa(s.next());
        System.out.print("Nhap ho ten: ");
        this.setHoTen(new Scanner(System.in).nextLine());
        System.out.print("Nhap dia chi: ");
        this.setDiaChi(new Scanner(System.in).nextLine());
        System.out.print("Nhap he so: ");
        this.setHeSo(s.nextDouble());
        System.out.print("Nhap chuc vu: ");
        this.setChucVu(new Scanner(System.in).nextLine());
    }
    public void HienThi()
    {
        System.out.println(this.getMa()+"\t"+this.getHoTen()+"\t\t\t"+this.getDiaChi()+"\t\t"+this.getChucVu()+"\t\t"+this.getHeSo());       
    }
    
    public boolean KiemTra(String HoTen)
    {
        boolean kt = false;
        if(this.getHoTen().equals(HoTen))
            return kt = true;
        return kt;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myVar = new Scanner(System.in);
        CanBo[] cbList= new CanBo[100];
        int count = 0;
        
        while(count < 100)
        {
            System.out.print("Nhap vao thong tin 1 can bo(y or n): ");
            char kt = myVar.next().charAt(0);
            if(kt == 'n')
                break;
            cbList[count]= new CanBo();
            cbList[count++].Nhap();
        }
        System.out.println("Danh sach can bo: ");
        System.out.println("STT\tMa\tHoten\t\t\tDiachi\t\tHeso\t\tChucvu");
        for(int i = 0;i  < count;i++)
        {
            System.out.print((i+1)+"\t");
            cbList[i].HienThi();
        }
        System.out.print("Nhap ten can bo can tim kiem: ");
        String cb = new Scanner(System.in).nextLine();
        System.out.println("Danh sach can bo can tim kiem: ");
        for(int i = 0; i < count;i++)
        {
            int dem = 0;
            if(cbList[i].KiemTra(cb))
            {
                    System.out.print((dem++)+"\t");
                    cbList[i].HienThi();
            }
            
        }
        
        
    }
    
}
