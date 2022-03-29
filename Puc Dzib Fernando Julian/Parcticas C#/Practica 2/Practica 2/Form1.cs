using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica_2
{
    public partial class Form1 : Form
    {

        bool down = false;
        Point inicial;
        Graphics papel;
        Pen lapiz;
        Control ctr;
        public Form1()
        {
            InitializeComponent();
            this.Controls.OfType<Control>().Where(ctr => ctr is Button).ToList().ForEach(ctr =>
            {
                ctr.MouseDown += Ctr_MouseDown;
                ctr.MouseUp += Ctr_MouseUp;
                ctr.MouseMove += Ctr_MouseMove;
            });
        }

        //Metodo que controla los movimientos de los botones arrastrables
        private void Ctr_MouseMove(object sender, MouseEventArgs e)
        {
            ctr = (Control)sender;
            if (down)
            {
                repintar();
                ctr.Left = e.X + ctr.Left - inicial.X;
                ctr.Top = e.Y + ctr.Top - inicial.Y;
            }
        }

        private void Ctr_MouseUp(object sender, MouseEventArgs e) => down = false  ;

        private void Ctr_MouseDown(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
                down = true;
                inicial = e.Location;
        }
        //Diujar uestro area contenedor 
        private void button1_Click(object sender, EventArgs e)
        {
           papel = pictureBox1.CreateGraphics();
           lapiz = new Pen(Color.Red);
           papel.DrawRectangle(lapiz, 30, 140, 300, 250);

        }
        
        private void col()
        {
            int x = 2;
            int y = 2;
            if (x >= 100 & x <= 300 & y > 130 & y < 250) ;
            else
                regresarFigura(btn1);
                regresarFigura(btn2);

        }
        //Metodos para  hacer que fucioe el juego
        public void repintar()
        {
            papel = pictureBox1.CreateGraphics();
            SolidBrush c = new SolidBrush(Color.Red);
            lapiz = new Pen(c);
            papel.DrawRectangle(lapiz, 30, 140, 300, 250);

        }

        public void regresarFigura(Button btn)
        {
            if (btn.Equals(btn1))
                btn1.SetBounds(495, 288, 30, 30);

            if (btn.Equals(btn2))
                btn2.SetBounds(495, 330, 30, 30);

            if (btn.Equals(btn3))
                btn3.SetBounds(495, 370, 30, 30);

            if (btn.Equals(btn4))
                btn4.SetBounds(532, 288, 30, 30);

            if (btn.Equals(btn5))
                btn5.SetBounds(532, 330, 30, 30);
            
            if (btn.Equals(btn6))
                btn6.SetBounds(532, 370, 30, 30);
        }
        
        private void btnRegresar_Click(object sender, EventArgs e)
        {
            regresarFigura(btn1);
            regresarFigura(btn1);
            regresarFigura(btn2);
            regresarFigura(btn3);
            regresarFigura(btn4);
            regresarFigura(btn5);
            regresarFigura(btn6);
        }
    }
}
