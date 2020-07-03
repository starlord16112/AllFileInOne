using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PhepToan
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {
            
            label3.Text = "Tổng a + b = " + (Convert.ToInt32(textBox1.Text) + Convert.ToInt32(textBox2.Text));
            label5.Text = "Hiệu a - b = " + (Convert.ToInt32(textBox1.Text) - Convert.ToInt32(textBox2.Text));
            label6.Text = "Tích a * b = " + (Convert.ToInt32(textBox1.Text) * Convert.ToInt32(textBox2.Text));
            if (textBox2.Text != "0")
                label4.Text = "Thương a / b  = " + (Convert.ToDouble(textBox1.Text) / Convert.ToDouble(textBox2.Text));
            else
                label4.Text = "b phải khác 0";
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }   
}
