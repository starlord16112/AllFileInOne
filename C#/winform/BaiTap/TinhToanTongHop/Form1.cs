using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TinhToanTongHop
{
    public partial class Form1 : Form
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
            while (i <= n)
            {
                if (n % i != 0)
                    i++;
                else
                {
                    break;
                }
            }
            if (i == n)
            {
                return true;
            }
            return false;

        }
        static bool hoanChinh(int n)
        {
            int sum = 0;
            for (int i = 1; i < n; i++)
            {
                if (n % i == 0)
                    sum += i;
            }
            if (sum == n)
                return true;
            return false;
        }
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < Convert.ToInt32(textBox1.Text); i++)
            {
                if (nguyenTo(i))
                {
                    label2.Text = label2.Text + i + " ";
                }
            }
            for (int i = 0; i < Convert.ToInt32(textBox1.Text); i++)
            {
                if (chinhPhuong(i))
                {
                    label3.Text = label3.Text + i + " ";
                }
            }
            for (int i = 0; i < Convert.ToInt32(textBox1.Text); i++)
            {
                if (hoanChinh(i))
                {
                    label4.Text = label4.Text + i + " ";
                }
            }


        }

        private void textBox1_Leave(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || Convert.ToInt32(textBox1.Text) < 0 || Convert.ToInt32(textBox1.Text) >1000)
            {
                MessageBox.Show("nhap 0 < n < 1000");
            }

    }
    }
}
