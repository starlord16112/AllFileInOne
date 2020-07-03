using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LopTruuTuong2
{
    public abstract class PhuongTien
    {
        public abstract string diChuyen();
    }
    class Car : PhuongTien
    {
        public override string diChuyen()
        {
            return "oto chay bang 4 banh tren duong";
        }
    }
    class Plane : PhuongTien
    {
        public override string diChuyen()
        {
            return "may bay bay tren troi";
        }
    }
    class Ship : PhuongTien
    {
        public override string diChuyen()
        {
            return "tau chay tren bien";
        }
    }
}
