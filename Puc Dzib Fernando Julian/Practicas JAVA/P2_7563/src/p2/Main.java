package p2;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
public class Main extends Frame implements MouseMotionListener, MouseListener{
	Dibujo espacio;
	Button btn1, btn2,btn3, btn4, btn5, btn6, btn8;
	Circulo btnDevolver;
	
	
	public Main() {
		//Instanciar la clase dibujo
		espacio= new Dibujo();
		btnDevolver = new Circulo("DEVOLVER", Color.YELLOW, Color.GREEN);
		//Instanciar los botones
		btn1= new Button("A");
		btn2= new Button("R");
		btn3= new Button("V");
		btn4= new Button("G");
		btn5= new Button("Az");
		btn6= new Button("O");
		
		

		 //Define 40 como Radio.
		//Dis. BTN
		// x y 

		btn1.setBackground(Color.YELLOW);
		btn1.setBounds(690, 350, 30, 30);
		
		btn2.setBackground(Color.PINK);
		btn2.setBounds(660, 390, 30, 30);
		
		btn3.setBackground(Color.GREEN);
		btn3.setBounds(710, 390, 30, 30);
		
		btn4.setBackground(Color.GRAY);
		btn4.setBounds(660, 430, 30, 30);
		
		btn5.setBackground(Color.BLUE);
		btn5.setBounds(710, 430, 30, 30);
		
		btn6.setBackground(Color.ORANGE);
		btn6.setBounds(690, 470, 30, 30);
		
		btnDevolver.setBounds(200, 50, 100, 100);

		
		//Llamar
		btn1.addMouseMotionListener(this);
		btn1.addMouseListener(this);
		btn2.addMouseMotionListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseMotionListener(this);
		btn3.addMouseListener(this);
		btn4.addMouseMotionListener(this);
		btn4.addMouseListener(this);
		btn5.addMouseMotionListener(this);
		btn5.addMouseListener(this);
		btn6.addMouseMotionListener(this);
		btn6.addMouseListener(this);
		
		btnDevolver.addMouseListener(this);
	

		espacio.addMouseListener(this);
		cerrarVentana();
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btnDevolver);
		this.add(espacio);
		this.setBounds(200, 200, 1000, 700);
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==btnDevolver){
			regresarFigura(btn1);
			regresarFigura(btn2);
			regresarFigura(btn3);
			regresarFigura(btn4);
			regresarFigura(btn5);
			regresarFigura(btn6);
		}
	}
	@Override 
	public void mousePressed(MouseEvent e) {		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==btn1)
			validarCollision(btn1);
		
		if(e.getSource()==btn2) 
			validarCollision(btn2);
		
		if(e.getSource()==btn3) 
			validarCollision(btn3);
		
		if(e.getSource()==btn4)
			validarCollision(btn4);
		
		if(e.getSource()==btn5) 
			validarCollision(btn5);
		
		if(e.getSource()==btn6) 
			validarCollision(btn6);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==btn1) 
			moverOjeto(e,btn1);
		
		if(e.getSource()==btn2)
			moverOjeto(e,btn2);
		
		if(e.getSource()==btn3)
			moverOjeto(e,btn3);
		
		if(e.getSource()==btn4)
			moverOjeto(e,btn4);
		
		if(e.getSource()==btn5)
			moverOjeto(e,btn5);

		if(e.getSource()==btn6) 
			moverOjeto(e,btn6);
	}
	@Override
	public void mouseEntered(MouseEvent e) {		
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {	
	}
	
	 //Metodos para hacer fucioar el juego
	
	public void cerrarVentana() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void validarCollision(Button btn) {
		int x = btn.getX();
		int y = btn.getY();
		if(x>=100 & x<=370 & y>230 & y<500);
		else 
			regresarFigura(btn);	
	}
	public void regresarFigura(Button btn) {
		if(btn.equals(btn1))
			btn1.setBounds(690, 350, 30, 30);
		
		if(btn.equals(btn2))
			btn2.setBounds(660, 390, 30, 30);
		
		if(btn.equals(btn3))
			btn3.setBounds(710, 390, 30, 30);
		
		if(btn.equals(btn4))
			btn4.setBounds(660, 430, 30, 30);
		
		if(btn.equals(btn5))
			btn5.setBounds(710, 430, 30, 30);
		
		if(btn.equals(btn6))
			btn6.setBounds(690, 460, 30, 30);
	}
	public void moverOjeto(MouseEvent g, Button btn) {
		btn.setLocation(
		        btn.getX() + g.getX() - btn.getWidth() / 2,
		        btn.getY() + g.getY() - btn.getHeight() / 2
		);
	}
	
	public static void main(String args[]) {
		Main miventana = new Main();
	}
}

