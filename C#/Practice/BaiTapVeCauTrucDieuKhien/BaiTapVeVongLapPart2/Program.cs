using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*Viết chương trình nhập vào một số nguyên dương <100000.
a) In ra màn hình tất cả các số chính phương nhỏ hơn số vừa nhập
b) In ra màn hình tất cả các số nguyên tố nhỏ hơn số vừa nhập
c) Tìm và in ra màn hình tất cả các số đối xứng nhỏ hơn số vừa nhập (số đối
xứng là số có dạng abcba)
d) Tìm và in ra màn hình tất cả các số Amstrong nhỏ hơn số vừa nhập (Một số
nguyên dương N có k chữ số được gọi là số amstrong, nếu nó bằng tổng các
lũy thừa bậc k của nó. VD: abc = a3 + b3 + c3
)
e) In ra màn hình tất cả các số hoàn chỉnh nhỏ hơn số vừa nhập (số hoàn chỉnh
là số có tổng các ước nguyên dương của nó bằng chính nó)
 * 
 */
namespace BaiTapVeVongLapPart2
{
    class Program
    {
        static bool chinhPhuong(int n)
        {

            
            int x = Convert.ToInt32(Math.Sqrt(n));
            if (x * x == n)
                return true;
            return false;
        }
        static bool nguyenTo(int n)
        {
            int i = 2;
            while(i <= n)
            {
                if (n % i != 0)
                    i++;
                else
                {
                    break;
                }
            }
            if(i == n)
            {
                return true;
            }
            return false;

        }
        static bool doiXung(int n)
        {
          string s = "";
          string  m = Convert.ToString(n);
          for(int i = m.Length - 1;i >= 0;i--)
            {
                s += m[i];
            }  
          if(s == m)
            {
                return true;
            }
            return false;
        }
        static bool amstrong(int n)
        {
            int alt = n;
            int length = (Convert.ToString(n).Length);
            int sum = 0;
            while(n != 0)
            {
                sum += Convert.ToInt32(Math.Pow((n % 10), length));
                n /= 10;
            }
            if (sum == alt)
                return true;
            return false;
        }
        static bool hoanChinh(int n)
        {
            int sum = 0;
            for(int i = 1;i < n;i++)
            {
                if (n % i == 0)
                    sum += i;
            }
            if (sum == n)
                return true;
            return false;
        }
        static void Main(string[] args)
        {
            int n;

            do
            {
                Console.Write("nhap so nguyen n: ");
                n = Convert.ToInt32(Console.ReadLine());
            }
            while (n < 0 && n > 100000);

            Console.WriteLine("cac so chinh phuong: ");
            for(int i = 1;i < n;i++)
            {
                if (chinhPhuong(i))
                    Console.Write("{0} ", i);

            }

            Console.WriteLine();

            Console.WriteLine("cac so nguyen to: ");
            for (int i = 1; i < n; i++)
            {
                if (nguyenTo(i))
                    Console.Write("{0} ", i);

            }

            Console.WriteLine();

            Console.WriteLine("cac so doi xung: ");
            for (int i = 0; i < n; i++)
            {
                if (doiXung(i))
                    Console.Write("{0} ", i);

            }

            Console.WriteLine();

            Console.WriteLine("cac so amstrong: ");
            for (int i = 0; i < n; i++)
            {
                if (amstrong(i))
                    Console.Write("{0} ", i);

            }

            Console.WriteLine();

            Console.WriteLine("cac so hoan chinh: ");
            for (int i = 1; i < n; i++)
            {
                if (hoanChinh(i))
                    Console.Write("{0} ", i);

            }


        }
    }
}
