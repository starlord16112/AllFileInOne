using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MayTinhCamTay
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void fontToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (fontDialog1.ShowDialog() == DialogResult.OK)
            {
             
                foreach(Button x in tableLayoutPanel1.Controls)
                {
                    x.Font = fontDialog1.Font;
                }    



            }
        }

        private void colorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(colorDialog1.ShowDialog() == DialogResult.OK)
            {
                foreach (Button x in tableLayoutPanel1.Controls)
                {
                    x.BackColor= colorDialog1.Color;
                }
            }    
        }

        private void backToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (colorDialog1.ShowDialog() == DialogResult.OK)
            {
                foreach (Button x in tableLayoutPanel1.Controls)
                {
                    x.BackColor = colorDialog1.Color;
                }
            }
        }

        private void textToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (colorDialog1.ShowDialog() == DialogResult.OK)
            {
                foreach (Button x in tableLayoutPanel1.Controls)
                {
                    x.ForeColor = colorDialog1.Color;
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "1";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "2";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "3";
        }

        private void button15_Click(object sender, EventArgs e)
        {
        
            string s = txt_bt.Text;
            string toantu = null;
            int s1 = 0;
            int s2 = 0;
            for(int i = 0;i < s.Length;i++)
            {
                try
                {                  
                    s1 += Convert.ToInt32(s[i]);
                }
                catch(Exception)
                {

                    toantu = Convert.ToString(s[i]);
                    for(int j = i;j < s.Length;j++)
                    {
                        s2 += Convert.ToInt32(s[j]);
                    }    
                    
                }
            }
            switch (toantu)
            {
                case "+":
                    txt_kq.Text =  Convert.ToString(s1 + s2);
                    break;
                default:
                    break;
            }    
        }

        private void button5_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "4";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "6";
        }
    

        private void button6_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "5";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "7";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "8";
        }

        private void button11_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "9";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "+";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "-";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "*";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "/";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "0";
        }

        private void button14_Click(object sender, EventArgs e)
        {
            txt_bt.Text = "";
        }
    }
}
   



