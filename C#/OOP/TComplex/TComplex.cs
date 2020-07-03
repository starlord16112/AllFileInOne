using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoPhuc
{
    class TComplex
    {
        double phanThuc, phanAo;
        public TComplex()
        {

        }
        public TComplex(double pt,double pa)
        {
            this.phanThuc = pt;
            this.phanAo = pa;
        }
        public void nhap()
        {
            Console.Write("nhap phan thuc: ");
            phanThuc = Convert.ToDouble(Console.ReadLine());
            Console.Write("nhap phan ao: ");
            phanAo = Convert.ToDouble(Console.ReadLine());
        }
        public void hienthi()
        {
            Console.WriteLine(this.phanThuc + "+" + this.phanAo + "i");
           
        }
        public static TComplex operator + (TComplex sp1, TComplex sp2)
        {
            TComplex sp3 = new TComplex();
            sp3.phanThuc = sp1.phanThuc + sp2.phanThuc;
            sp3.phanAo = sp1.phanAo + sp2.phanAo;   
            return sp3;
        }
        public static TComplex operator -(TComplex sp1, TComplex sp2)
        {
            TComplex sp3 = new TComplex();
            sp3.phanThuc = sp1.phanThuc - sp2.phanAo;
            sp3.phanAo = sp1.phanAo - sp2.phanAo;
            return sp3;
        }
        public static TComplex operator *(TComplex sp1, TComplex sp2)
        {
            TComplex sp3 = new TComplex();
            sp3.phanThuc = sp1.phanThuc * sp2.phanThuc - sp1.phanAo * sp2.phanAo;
            sp3.phanAo = sp1.phanThuc * sp2.phanAo + sp1.phanAo * sp2.phanThuc;
            return sp3;
        }
    }
}
