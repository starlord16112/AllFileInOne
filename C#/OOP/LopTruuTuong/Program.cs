using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LopTruuTuong
{
    class Program
    {
        static void Main(string[] args)
        {
           
                Console.WriteLine("chon con vat yeu thich:");
                Console.WriteLine("1 -- cho");
                Console.WriteLine("2 -- meo");
                int c = Convert.ToInt32(Console.ReadLine());
            switch (c)
            {
                case 1:
                    Console.Write("nhap ten con vat: ");
                    string n1 = Console.ReadLine();
                    Console.WriteLine(n1 + " la con cho");
                    Dog obj1 = new Dog(n1);
                    Console.WriteLine(obj1.sound());
                    Console.WriteLine(obj1.diChuyen());
                    Console.WriteLine(obj1.eat());
                    break;
                case 2:
                    Console.Write("nhap ten con vat: ");
                    string n2 = Console.ReadLine();
                    Console.WriteLine(n2 + " la con meo");
                    Cat obj2 = new Cat(n2);
                    Console.WriteLine(obj2.sound());
                    Console.WriteLine(obj2.diChuyen());
                    Console.WriteLine(obj2.eat());
                    break;
                default:
                    Console.WriteLine("khong hop le");
                    break;
            }    
           
        }
    }
}
