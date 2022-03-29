using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica1
{
    public partial class Form1 : Form
    {
        //Variales gloales
        int n1, n2;
        double r;
        string operador;

        public Form1()
        {
            InitializeComponent();
            //Iicializar 
            r = 0;
            n1 = 0;
            n2 = 0;
            operador = "";
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        //Metodos 
        public String hacerOperacion(String operador, int n1, int n2)
        {
            switch (operador)
            {  
                case "-":
                    var resta = n1 - n2;
                    return resta.ToString() + "";
                case "+":
                    r = n1 + n2;
                    return r.ToString() + "";
                case "^":
                    if (n1 != 0) {
                        var elevar = Math.Pow(n1, n2);
                        return elevar.ToString() + "";
                    }
                    break;
                case "/":
                    if (n1 > 0){
                        int division = n1 / n2;
                        return division.ToString() + "";
                    }
                    else{
                        return "Error, La division entre 0 no existe";
                    }
                case "*":
                    var multiplicacion = n1 * n2;
                    return multiplicacion.ToString() + "";
                default:
                    return "";
            }
            return null;
        }

        
        //Metodos de operacioes

        private void btnElevar_Click(object sender, EventArgs e)
        {
            text.ForeColor = Color.Black;
            operador = "^";
            var r = int.TryParse(text.Text, out int temporal);
            text.Text = "";
            n1 = temporal;
        }

        private void btnDividir_Click(object sender, EventArgs e)
        {
            text.ForeColor = Color.Black;
            operador = "/";
            var r = int.TryParse(text.Text, out int temporal);
            text.Text = "";
            n1 = temporal;
        }

        private void btnMultiplicar_Click(object sender, EventArgs e)
        {
            text.ForeColor = Color.Black;
            operador = "*";
            var r = int.TryParse(text.Text, out int temporal);
            text.Text = "";
            n1 = temporal;
        }
        private void btnSumar_Click(object sender, EventArgs e)
        {
            text.ForeColor = Color.Black;
            operador = "+";
            var r = int.TryParse(text.Text, out int temporal);
            text.Text = "";
            n1 = temporal;

        }

        private void btnRestar_Click(object sender, EventArgs e)
        {
            text.ForeColor = Color.Black;
            operador = "-";
            var r = int.TryParse(text.Text, out int temporal);
            text.Text = "";
            n1 = temporal;
        }

        //Metodo eveto para devolver el resultado

        private void btnIgual_Click(object sender, EventArgs e)
        {
            var r = int.TryParse(text.Text, out int temporal);
            text.Text = "";
            n2 = temporal;
            text.AppendText(hacerOperacion(operador, n1, n2).ToString());
        }


        //Metodos para estalecer limites de aceotacio
        private void b1_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("1");
        }

        private void b2_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("2");
        }

        private void b3_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("3");
        }

        private void b4_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("4");
        }

        private void b5_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("5");
        }

        private void b6_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("6");
        }

        private void b7_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("7");
        }

        private void b8_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("8");
        }

        private void b9_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("9");
        }

        private void b0_Click(object sender, EventArgs e)
        {
            if (text.Text.Length > 20)
                MessageBox.Show("Error de Desbordamiento de Memoria");
            else
                text.ForeColor = Color.Black;
                text.AppendText("0");
        }
    }
}