using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Human
{
    class CanBo : ConNguoi
    {
        double heSoLuong;
        int thamNien;
        public CanBo()
        {
        }
        public CanBo(string n, int a, string ad, bool s, string pt,double hsl,int thamnien) :base(n,a,ad,s,pt)
        {
            this.heSoLuong = hsl;
            this.thamNien = thamnien;

        }
        public void nhap()
        {
            base.nhap();

            Console.Write("nhap he so luong: ");
            heSoLuong = Convert.ToDouble(Console.ReadLine());

            Console.Write("nhap tham nien cong tac: ");
            thamNien = Convert.ToInt32(Console.ReadLine());

        }
        public void xuat()
        {
            base.xuat();

            Console.Write("{0,-25} ",tinhLuong());




        }
        public double tinhLuong()
        {
            return heSoLuong * 1300 + thamNien * 100;
        }
    }
}
