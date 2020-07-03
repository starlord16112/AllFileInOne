using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BaiTapMang
{
    class Program
    {
        static void nhapMang(int[] arr,int n)
        {
            for(int i = 0;i < n;i++)
            {
                Console.Write("nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = Convert.ToInt32(Console.ReadLine());
            }    

        }
        static void xuatMang(int[] arr, int n)
        {
            for (int i = 0; i < n; i++)
            {
                Console.Write(arr[i] + " ");

               
            }
            Console.WriteLine();


        }
        static void swap(int x,int y)
        {

        }
        static void Main(string[] args)
        {
            int n;

            do
            {
                Console.Write("nhap so phan tu cua mang: ");
                n = Convert.ToInt32(Console.ReadLine());
            }
            while (n <= 0 || n > 1000);

            int[] myArr = new int[n];

            nhapMang(myArr, n);

            Console.WriteLine("mang cua ban: ");
            xuatMang(myArr, n);

            Console.WriteLine("phan tu lon nhat trong mang la: ");
        }
    }
}
