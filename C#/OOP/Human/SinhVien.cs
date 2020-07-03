using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Human
{
    class SinhVien : ConNguoi
    {
        double diemToan, diemVan, diemAnh;
        public SinhVien()
        {
         
        }
        public SinhVien(string n, int a, string ad, bool s, string pt,double dt,double dv,double da) :base(n,a,ad,s,pt)
        {
            this.diemToan = dt;
            this.diemVan = dv;
            this.diemAnh = da;
        }
        public void nhap()
        {
            base.nhap();

            Console.Write("diem toan: ");
            diemToan = Convert.ToInt32(Console.ReadLine());

            Console.Write("diem van: ");
            diemVan = Convert.ToInt32(Console.ReadLine());

            Console.Write("diem anh: ");
            diemAnh = Convert.ToInt32(Console.ReadLine());
        }
        public void xuat()
        {
            base.xuat();

            Console.WriteLine("{0,-25}", this.diemTB());
        }
        
        public double diemTB()
        {
            return (diemToan + diemVan + diemAnh)/ 3;
        }
    }
}
