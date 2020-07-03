using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace KhamRang
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
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
            price += Convert.ToInt32(numericUpDown1.Value) * 90000;
            textBox2.Text = "" + price;
        }

        private void button2_Click(object sender, EventArgs e)
        {
           
            this.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
           int n = dataGridView2.Rows.Add();
           dataGridView2.Rows[n].Cells[0].Value = textBox1.Text;
           dataGridView2.Rows[n].Cells[1].Value = textBox2.Text;
          

        }

        private void button4_Click(object sender, EventArgs e)
        {
            double sum = 0;
            for (int i = 0; i < Convert.ToInt32(dataGridView2.Rows.Count); i++)
            {
                sum += Convert.ToDouble(dataGridView2.Rows[i].Cells[1].Value);
            }
            textBox3.Text = "" + sum;
          
        }

    }
}
