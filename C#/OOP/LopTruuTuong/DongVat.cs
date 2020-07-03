using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace LopTruuTuong
{
    public  abstract class DongVat
    {

        protected string name;
        public abstract string diChuyen();
        public abstract string eat();
        public abstract string sound();


    }
    class Dog : DongVat
    {
        public Dog(string n)
        {
            this.name = n;
        }
        public override string diChuyen()
        {
            return name+" di bang 4 chan";
        }
        public override string eat()
        {
            return name+" an thit va an ca";
        }
        public override string sound()
        {
            return name +" keu gau gau";
        }
    }
    class Cat : DongVat
    {
        public Cat(string n)
        {
            this.name = n;
        }
        public override string diChuyen()
        {
            return name + " di bang 4 chan";
        }
        public override string eat()
        {
            return name + " an thit va an ca hoac bat chuot";
        }
        public override string sound()
        {
            return name + "  meo meo";
        }
    }
}
