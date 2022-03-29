using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace App3
{
    public partial class Form1 : Form
    {
        double total;
        public Form1()
        {
            InitializeComponent();
            total = 0;
        }

        //Que hacer cuando cambiamos el contenido 
        //Sender captura todo el texto que esta llegando
        private void textBox1_TextChanged(object sender, EventArgs e)
        {

            //MessageBox.Show(sender.ToString());
            TextBox txt = (TextBox)sender;
            if (txt.Text.Length <= 0) return; //La version ligera

            Boolean isRight = Double.TryParse(txt.Text, out double num);
            if (!isRight)
            {
                MessageBox.Show("Dato no Válido");
                String res = "";
                for (int i=0; i < txt.Text.Length; i++)
                {
                    switch (txt.Text[i])
                    {
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            res += txt.Text[i];
                            break;
                    }
                  // if (txt.Text[i] >='0' && txt.Text[i] <= '9')
                    //{
                      //  res += txt.Text[i];
                    //}//
                //Provar si pasa algo si se boraa
                }
                //txt.Text = res;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double temporal = 0.0;
            // Console.WriteLine("Este es ekl boton aceotar");
            var r = double.TryParse(textBox1.Text.Trim(), out temporal);
            if (r)
            {
                textBox1.Text = "";
                total += temporal;
            }
            else
            {
                MessageBox.Show("El valor debe de ser un numérico");
            }
        }
        private void button2_Click(object sender, EventArgs e)
        {
            textBox2.AppendText(total.ToString());
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            //Si es digito o es 
            if (!char.IsDigit(e.KeyChar) && !(e.KeyChar=='.'))
            {
                e.Handled = false;
            }
        }
    }
}
