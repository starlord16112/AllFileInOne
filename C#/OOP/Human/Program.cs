using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Human
{
    class Program
    {
       
        static void Main(string[] args)
        {
             int capacity = 100, demsv = 0, demcb = 0;

             SinhVien[] sv = new SinhVien[capacity];
             CanBo[] cb = new CanBo[capacity];

             for (int i = 0;i < capacity;i++)//khởi tạo các phần tử của mảng đối tượng
             {
                 sv[i] = new SinhVien();
                 cb[i] = new CanBo();
             }    

             while (true)
             {
                 Console.WriteLine("------------------------------------------");
                 Console.WriteLine("1               them can bo");
                 Console.WriteLine("2            them sinh vien");
                 Console.WriteLine("3            khong them nua");
                 Console.WriteLine("them can bo hoac sinh vien vao danh sach: ");
                 var c = Console.ReadLine();
                 if (c == "3")
                 {
                     Console.WriteLine("danh sach sinh vien: ");
                     for (int i = 0; i < demsv - 1; i++)
                     {
                         for (int j = i + 1; j < demsv; j++)
                         {
                             if (sv[i].diemTB() < sv[j].diemTB())
                            {
                                SinhVien c3 = new SinhVien();
                                c3 = sv[i];
                                sv[i] = sv[j];
                                sv[j] = c3;
                            }    
                                
                         }
                     }
                     for (int i = 0; i < demsv; i++)
                     {
                         sv[i].xuat();
                         Console.WriteLine();
                     }

                     Console.WriteLine("danh sach can bo: ");

                     for (int i = 0; i < demcb - 1; i++)
                     {
                         for (int j = i + 1; j < demcb; j++)
                         {
                             if (cb[i].tinhLuong() < cb[j].tinhLuong())
                            {
                                CanBo c3 = new CanBo();
                                c3 = cb[i];
                                cb[i] = cb[j];
                                cb[j] = c3;
                            }     
                         }
                     }

                     for (int i = 0; i < demcb; i++)
                     {
                         cb[i].xuat();
                         Console.WriteLine();
                     }
                     break;
                 }                               
                 else
                 {
                     switch (c)
                     {
                         case "1":
                             if (demcb < capacity)
                             {
                                 cb[demcb].nhap();
                                 demcb++;
                             }
                             else
                             {
                                 Console.WriteLine("stack overflow");
                             }

                             break;
                         case "2":
                             if (demsv < capacity)
                             {
                                 sv[demsv].nhap();
                                 demsv++;
                             }
                             else
                             {
                                 Console.WriteLine("stack overflow");
                             }

                             break;

                         default:
                             Console.WriteLine("error");
                             break;



                     }

                 }
             }

            
        }
    }
}
