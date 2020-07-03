using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/* nhập vào 3 số nguyên
 * kiểm tra ngày tháng năm hợp lệ
 * hợp lệ thì in ra ngày tiếp theo
 */
namespace ReNhanh
{
    class Program
    {
        static void Main(string[] args)
        {
            bool kt = true;
            //nhập 3 số nguyên từ bàn phím
            Console.WriteLine("nhap 3 so nguyen: ");

            Console.Write("a = ");
            int a = Convert.ToInt32(Console.ReadLine());//ngày
            Console.Write("b = ");
            int b = Convert.ToInt32(Console.ReadLine());//tháng
            Console.Write("c = ");
            int c = Convert.ToInt32(Console.ReadLine());//năm

            //kiểm tra 3 số có phải ngày tháng năm hay không
            switch (b)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (a >= 1 && a <= 31)
                    {
                        Console.WriteLine("ngay {0}/{1}/{2} hop le", a, b, c);

                    }
                    else
                    {
                        Console.WriteLine("ngay {0}/{1}/{2} ko hop le", a, b, c);
                        kt = false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (a >= 1 && a <= 30)
                    {
                        Console.WriteLine("ngay {0}/{1}/{2} hop le", a, b, c);

                    }
                    else
                    {
                        Console.WriteLine("ngay {0}/{1}/{2} ko hop le", a, b, c);
                        kt = false;
                    }
                    break;
                case 2:
                    if ((c % 4 == 0 && c % 100 != 0 && a == 29) || a == 28)
                    {
                        Console.WriteLine("ngay {0}/{1}/{2} hop le", a, b, c);
                    }
                    else
                    {
                        Console.WriteLine("ngay {0}/{1}/{2} ko hop le", a, b, c);
                        kt = false;

                    }
                    break;
                default:
                    Console.WriteLine("ngay {0}/{1}/{2} ko hop le", a, b, c);
                    kt = false;
                    break;
            }

            //đưa ra ngày tiếp theo
            if(kt)
                {
                if (b != 2)
                {
                    if (a == 31 && (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12))
                    {
                        a = 1;
                        if(b == 12)
                        {
                            b = 1;
                            c++;
                        } 
                        else
                          b++;
                    }
                    else if (a == 30 && (b == 4 || b == 6 || b == 9 || b == 11))
                    {
                        a = 1;
                        b++;
                    }
                    else
                    {
                        a++;
                    }
                }
                else
                {
                    if(c % 4 ==0 && c % 100 != 0)
                    {
                        if(a == 29)
                        {
                            b++;
                            a = 1;
                        }    
                        else
                        {
                            a++;
                        }    
                    }   
                    else
                    {
                        if (a == 28)
                        {
                            b++;
                            a = 1;
                        }
                        else
                        {
                            a++;
                        }

                    }    
                }    


                    Console.WriteLine("ngay tiep theo {0}/{1}/{2}", a, b, c);
                }    
            
                    



                
        }
    }
}
