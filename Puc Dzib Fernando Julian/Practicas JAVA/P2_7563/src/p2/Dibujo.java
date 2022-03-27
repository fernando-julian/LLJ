package p2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas{
	private Color fondo, presion;
	//Constructor
	public Dibujo() {
	}
	//Metodo Paint
	public void paint(Graphics g) {
		
		g.setColor(Color.GRAY);
		g.drawLine(600, 400, 700, 300);
		g.drawLine(600, 400, 700, 500);
		g.drawLine(800, 400, 700, 300);
		g.drawLine(800, 400, 700, 500);	
		
		g.setColor(Color.RED);
		g.fillRect(100, 200, 300, 300);		

	}
}
