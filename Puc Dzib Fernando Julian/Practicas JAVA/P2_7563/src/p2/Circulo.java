package p2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.border.Border;

class Circulo extends JButton{
	private boolean round;
	private Color colorFondo, colorPresionado;
	//Constructor forma de elipse
	 public Circulo(String rotulo, Color fon, Color pre) {
	        super(rotulo);
	        round = true;
	        colorFondo = fon;
	        colorPresionado = pre;
	        setContentAreaFilled(false);
	    } private int f, f1;
	//Constructor forma rectangulo bordes curvos
	public Circulo(String rotulo, Color fon, Color pre, int i, int i1) {
	        super(rotulo);
	        f=i;
	        f1=i1;
	        round = false;
	        colorFondo = fon;
	        colorPresionado = pre;
	        setContentAreaFilled(false);
	    }

	 @ Override
	    protected void paintComponent(Graphics g) {
	        if (getModel().isArmed()) {
	            g.setColor(colorPresionado);
	        } else {
	            g.setColor(colorFondo);
	        }
	        if (round) {
	            g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
	        } else {
	            g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, f, f1);
	        }
	        super.paintComponent(g);
	    }
	//Sobreescritura del borde
	@ Override
	    protected void paintBorder(Graphics g) {
	        g.setColor(Color.black);

	        if (round) {
	            g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	        } else {
	            g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, f, f1);
	        }
	    }
	}