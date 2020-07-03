using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Human
{
    class ConNguoi
    {
        string hoTen;
        int tuoi;
        string queQuan;
        bool gioiTinh;//true--nam,false --nữ
        string phuongTien;
        
        public ConNguoi()
        {
            

        }
        public ConNguoi(string name,int age,string add,bool sex,string phuongtien)
        {
            this.hoTen = name;
            this.tuoi = age;
            this.queQuan = add;
            this.gioiTinh = sex;
            this.phuongTien = phuongtien;
        }
        public void nhap()
        {
            Console.Write("nhap ten: ");
            hoTen = Console.ReadLine();

            Console.Write("nhap tuoi: ");
            tuoi = Convert.ToInt32(Console.ReadLine());

            Console.Write("nhap dia chi: ");
            queQuan = Console.ReadLine();

            Console.Write("nhap gioi tinh(true or false): ");
            gioiTinh = Convert.ToBoolean(Console.ReadLine());

            Console.Write("nhap phuong tien di lai: ");
            phuongTien = Console.ReadLine();

        }
        public void xuat()
        {
          
            Console.Write("{0,-25}{1,-25}{2,-25}",hoTen,gioiTinh == true?"nam":"nu",phuongTien);
           

        }
    }
}
