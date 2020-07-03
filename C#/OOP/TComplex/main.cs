using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace SoPhuc
{
    class main
    {
        static void Main(string[] args)
        {
            TComplex sp1, sp2, sp3;
            sp1 = new TComplex(3, 5);
            sp2 = new TComplex(1, 2);
            sp3 = new TComplex();

            sp3 = sp1 - sp2;
            TComplex sp4 = sp1 + sp2;
            TComplex sp5 = sp4 * sp3;
            

            sp1.hienthi();
            sp2.hienthi();
            sp3.hienthi();
            sp4.hienthi();
            sp5.hienthi();
        }
    }
}
