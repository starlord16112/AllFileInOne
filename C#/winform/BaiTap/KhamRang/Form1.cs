using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace KhamRang
{
    public partial class Form1 : Form
    {
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
            double price = 0;
            if (checkBox1.Checked)
            {
                price += 100000;
            }
            if (checkBox2.Checked)
            {
                price += 1200000;
            }
            if (checkBox3.Checked)
            {
                price += 150000;
            }
            if (checkBox4.Checked)
            {
                price += 100000;
            }
            price += Convert.ToInt32(numericUpDown1.Value * 90000);
            textBox2.Text = Convert.ToString(price);
            dataGridView
         

        }

        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {
           
        }
    }
}
