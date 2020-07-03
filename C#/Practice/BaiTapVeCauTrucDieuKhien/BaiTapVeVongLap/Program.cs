using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*Viết một chương trình cho phép lặp đi lặp lại việc sau cho đến khi người dùng
không muốn chơi nữa:
a. Hiển thị một menu có các lựa chọn để thực hiện các phép toán cơ bản
b. Nhập vào 2 số a, b và một toán tử
c. In ra kết quả của phép toán giữa hai số a, b và toán tử vừa nhập
d. Hiển thị câu hỏi xem người dùng còn muốn chơi nữa không? Nếu không
thì bấm vào phím N để thoát khỏi chương trình
S
 */
namespace BaiTapVeVongLap
{
    class Program
    {
        static void Main(string[] args)
        {
            {
                int a, b;
                string toanTu, c;
                do
                {
                    Console.WriteLine("*************************");
                    Console.WriteLine("** tro choi tinh nhanh **");
                    Console.WriteLine("** +:tinh tong    **");
                    Console.WriteLine("** -:tinh hieu   **");
                    Console.WriteLine("** *:tinh phep nhan    **");
                    Console.WriteLine("** /:tinh phep chia   **");
                    Console.WriteLine("nhap hai so va 1 toan tu: ");

                    Console.Write("nhap so a = ");
                    a = Convert.ToInt32(Console.ReadLine());
                    Console.Write("nhap so b = ");
                    b = Convert.ToInt32(Console.ReadLine());
                    Console.Write("nhap toan tu: ");
                    toanTu = Console.ReadLine();
                    switch (toanTu)
                    {
                        case "*":
                            Console.WriteLine(a + " * " + b + " = " + (a * b));
                            break;
                        case "+":
                            Console.WriteLine(a + " + " + b + " = " + (a + b));
                            break;
                        case "-":
                            Console.WriteLine(a + " - " + b + " = " + (a - b));
                            break;
                        case "/":
                            if (b != 0)
                            {
                                Console.WriteLine(a + " / " + b + " = " + (a / b));
                            }
                            else
                            {
                                Console.WriteLine("không chia được");
                            }
                            break;
                        default:
                            Console.WriteLine("error");
                            break;
                    }
                    Console.WriteLine("choi tiep nha(y or n)");
                    c = Console.ReadLine();
                }
                while (c == "y");
            }
        }
    }
}
