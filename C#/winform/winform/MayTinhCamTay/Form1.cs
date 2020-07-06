using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MayTinhCamTay
{
    public partial class Form1 : Form
    {

        int toanHang1;
        int toanHang2;
        char toanTu;
        public Form1()
        {
            InitializeComponent();
        }

        private void fontToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (fontDialog1.ShowDialog() == DialogResult.OK)
            {

                foreach (Button x in tableLayoutPanel1.Controls)
                {
                    x.Font = fontDialog1.Font;
                }



            }
        }

        private void colorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (colorDialog1.ShowDialog() == DialogResult.OK)
            {
                foreach (Button x in tableLayoutPanel1.Controls)
                {
                    x.BackColor = colorDialog1.Color;
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
            txt_temp.Text += "1";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "2";
            txt_temp.Text += "2";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "3";
            txt_temp.Text += "3";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            toanTu = '+';
            txt_bt.Text += "+";
            try
            {
                toanHang1 = Convert.ToInt32(txt_temp.Text);
            }
            catch (Exception) {
                
            };
           
            txt_temp.Text = "";
        }
        
        private void button5_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "4";
            txt_temp.Text += "4";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "5";
            txt_temp.Text += "5";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "5";
        }

        private void button8_Click(object sender, EventArgs e)
        {

            toanTu = '-';
            txt_bt.Text += "-";
            try
            {
                toanHang1 = Convert.ToInt32(txt_temp.Text);
            }
            catch (Exception)
            {
               
            };

            txt_temp.Text = "";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "7";
            txt_temp.Text += "7";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "8";
            txt_temp.Text += "8";
        }

        private void button11_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "9";
            txt_temp.Text += "9";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            toanTu = '*';
            txt_bt.Text += "*";
            try
            {
                toanHang1 = Convert.ToInt32(txt_temp.Text);
            }
            catch (Exception)
            {
               
            };

            txt_temp.Text = "";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            txt_bt.Text += "0";
            txt_temp.Text += "0";
        }

        private void button14_Click(object sender, EventArgs e)
        {
            txt_bt.Text = "";
            txt_kq.Text = "";
            txt_temp.Text = "";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            toanTu = '/';
            txt_bt.Text += "/";
            try
            {
                toanHang1 = Convert.ToInt32(txt_temp.Text);
            }
            catch (Exception)
            {
                
            };

            txt_temp.Text = "";
        }

        private void button17_Click(object sender, EventArgs e)
        {
          
            txt_bt.Text = txt_bt.Text.Substring(0, txt_bt.Text.Length - 1);
        }

        private void button15_Click(object sender, EventArgs e)
        {
            toanHang2 = Convert.ToInt32(txt_temp.Text);
          
            switch(toanTu)
            {
                
                case '+':
                    txt_kq.Text = ""+ (toanHang1 + toanHang2);
                    txt_temp.Text = "" + (toanHang1 + toanHang2);

                    break;
                case '-':
                    txt_kq.Text = "" + (toanHang1 - toanHang2);
                    txt_temp.Text = "" + (toanHang1 - toanHang2);

                    break;
                case '*':
                    txt_kq.Text = "" + (toanHang1 * toanHang2);
                    txt_temp.Text = "" + (toanHang1 * toanHang2);

                    break;
                case '/':
                    try
                    {
                        txt_kq.Text = "" + (toanHang1 / toanHang2);
                        txt_temp.Text = "" + (toanHang1 / toanHang2);
                    }
                    catch(Exception)
                    {

                    }
                    break;


            }
        }
    }
            
}    
        
