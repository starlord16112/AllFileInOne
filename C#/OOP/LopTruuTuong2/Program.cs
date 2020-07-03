using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LopTruuTuong2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("chon phuong tien:");
            Console.WriteLine("1 --      oto");
            Console.WriteLine("2 --  may bay");
            Console.WriteLine("3 -- tau thuy");
            var c = Console.Read();
            switch (c)
            {
                case '1':
                    Car obj1 = new Car();
                    Console.WriteLine(obj1.diChuyen());
                    break;
                case '2':
                    Plane obj2 = new Plane();
                    Console.WriteLine(obj2.diChuyen());
                    break;
                case '3':
                    Ship obj3 = new Ship();
                    Console.WriteLine(obj3.diChuyen());
                    break;
                default:
                    Console.WriteLine("khong hop le");
                    break;
            }
        }
    }
}
