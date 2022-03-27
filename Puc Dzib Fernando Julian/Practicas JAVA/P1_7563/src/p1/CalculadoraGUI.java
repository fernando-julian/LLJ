package p1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraGUI extends JFrame {
	//Atributos
	int primerNumero;
	int segundoNumero;
	JPanel barraMenu;
	JPanel ctNum;
	JTextField txtResultado;
	JLabel C1, C2, C3, Op;
	JButton btnC, btn1, btn2, btn3, btn4, btn5, btn6,
	btn7, btn8, btn9, btn0;
	JButton btnResta, btnSuma, btnDiv, btnMult, btnPot, btnIgual;
	String operador;	
	
	//Metodo para cerrar la ventana y el main
	public static void main(String[] args){
		CalculadoraGUI cal=new CalculadoraGUI("Calculadora Simple");
		cal.addWindowListener(new WindowAdapter(){
			public void windowClosin(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public CalculadoraGUI(String titulo){
		super(titulo);
		operar();
	}
	public void operar(){
 
		 //Instanciar componentes
		txtResultado=new JTextField();
		barraMenu=new JPanel();

		btnC=new JButton("Vaciar");
		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		btn5=new JButton("5");
		btn6=new JButton("6");
		btn7=new JButton("7"); 
		btn8=new JButton("8");
		btn9=new JButton("9");
		btn0=new JButton("0");
		btnSuma=new JButton("+");
		btnResta=new JButton("-");
		btnDiv=new JButton("/");
		btnMult=new JButton("*");
		btnPot=new JButton("^");
		btnIgual=new JButton("=");

		C1=new JLabel("C1");
		C2=new JLabel("C2");
		C3=new JLabel("C3");
		Op=new JLabel("OP");
		ctNum=new JPanel();
		
		//Diseno componentes
			
		btn1.setFocusable(false);
		btn1.setFont(new Font ("Fonts Example", 30, 30));
		btn1.addActionListener(evt ->btn1ActionPerformed(evt));

		btn2.setFocusable(false);
		btn2.setFont(new Font ("Fonts Example", 30, 30));
		btn2.addActionListener(evt ->btn2ActionPerformed(evt));
		
		btn3.setFocusable(false);
		btn3.setFont(new Font ("Fonts Example", 30, 30));
		btn3.addActionListener(evt ->btn3ActionPerformed(evt));
		
		btn4.setFocusable(false);
		btn4.setFont(new Font ("Fonts Example", 30, 30));
		btn4.addActionListener(evt ->btn4ActionPerformed(evt));
		
		btn5.setFocusable(false);
		btn5.setFont(new Font ("Fonts Example", 30, 30));
		btn5.addActionListener(evt ->btn5ActionPerformed(evt));
		
		btn6.setFocusable(false);
		btn6.setFont(new Font ("Fonts Example", 30, 30));
		btn6.addActionListener(evt ->btn6ActionPerformed(evt));
		
		btn7.setFocusable(false);
		btn7.setFont(new Font ("Fonts Example", 30, 30));
		btn7.addActionListener(evt ->btn7ActionPerformed(evt));
		
		btn8.setFocusable(false);
		btn8.setFont(new Font ("Fonts Example", 30, 30));
		btn8.addActionListener(evt ->btn8ActionPerformed(evt));
		
		btn9.setFocusable(false);
		btn9.setFont(new Font ("Fonts Example", 30, 30));
		btn9.addActionListener(evt ->btn9ActionPerformed(evt));
		
		btn0.setFocusable(false);
		btn0.setFont(new Font ("Fonts Example", 30, 30));
		btn0.addActionListener(evt ->btn0ActionPerformed(evt));
		
		btnSuma.setFocusable(false);
		btnSuma.setBackground(Color.LIGHT_GRAY);
		btnSuma.setFont(new Font ("Fonts Example", 30, 30));
		btnSuma.addActionListener(evt ->btnSumaActionPerformed(evt));
		
		btnResta.setFocusable(false);
		btnResta.setBackground(Color.LIGHT_GRAY);
		btnResta.setFont(new Font ("Fonts Example", 30, 30));
		btnResta.addActionListener(evt ->btnRestaActionPerformed(evt));

		btnDiv.setFocusable(false);
		btnDiv.setBackground(Color.LIGHT_GRAY);
		btnDiv.setFont(new Font ("Fonts Example", 30, 30));
		btnDiv.addActionListener(evt ->btnDivActionPerformed(evt));
		
		btnMult.setFocusable(false);
		btnMult.setBackground(Color.LIGHT_GRAY);
		btnMult.setFont(new Font ("Fonts Example", 30, 30));
		btnMult.addActionListener(evt ->btnMultActionPerformed(evt));
		
		btnPot.setFocusable(false);
		btnPot.setBackground(Color.LIGHT_GRAY);
		btnPot.setFont(new Font ("Fonts Example", 30, 30));
		btnPot.addActionListener(evt ->btnPotActionPerformed(evt));
		
		btnIgual.setFocusable(false);
		btnIgual.setBackground(Color.LIGHT_GRAY);
		btnIgual.setFont(new Font ("Fonts Example", 30, 30));
		btnIgual.addActionListener(evt ->btnIgualActionPerformed(evt));
		
		btnC.setFocusable(false);
		btnC.setFont(new Font ("Fonts Example", 6, 20));
		btnC.setBackground(Color.CYAN);
		btnC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnC.addActionListener(evt -> btnCActionPerformed(evt));
		
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Fonts Exampl",1,18));
		txtResultado.setForeground(new Color(28, 27, 23));
		txtResultado.setText("0123456789");
		txtResultado.setPreferredSize(new Dimension(460,44)); 
		
		barraMenu.add(txtResultado,BorderLayout.WEST);
		barraMenu.add(btnC,BorderLayout.EAST); 
				
		this.setLayout(new BorderLayout());
				
	
	
		C1.setFont(new Font("open Sans",1,14));
		C1.setHorizontalAlignment(SwingConstants.CENTER);
		
		C2.setFont(new Font("Open Sans",1,14));
		C2.setHorizontalAlignment(SwingConstants.CENTER);	
		
		C3.setFont(new Font("Open Sans",1,14));
		C3.setBackground(Color.CYAN);
		C3.setHorizontalAlignment(SwingConstants.CENTER);
		
		Op.setFont(new Font("Open Sans",1,14));
		Op.setHorizontalAlignment(SwingConstants.CENTER);	
				
		
		ctNum.setLayout(new GridLayout(5,4,20,20));
			
		ctNum.add(C1);
		ctNum.add(C2);
		ctNum.add(C3);
		ctNum.add(Op);
		ctNum.add(btn1);
		ctNum.add(btn2);
		ctNum.add(btn3);
		ctNum.add(btnSuma);
		ctNum.add(btn4);
		ctNum.add(btn5);
		ctNum.add(btn6);
		ctNum.add(btnResta);
		ctNum.add(btn7);
		ctNum.add(btn8);
		ctNum.add(btn9);
		ctNum.add(btnDiv);
		ctNum.add(btnMult);
		ctNum.add(btn0);
		ctNum.add(btnPot);
		ctNum.add(btnIgual);
	
		this.add(barraMenu,BorderLayout.NORTH);
		this.add(ctNum, BorderLayout.CENTER);
		this.setSize(600,500);
		this.setVisible(true);
	}
	
	//Metodos calculadora Simple
	//Validacio 
	private void validarRango(){
		if(txtResultado.getText().length()>20){
			JOptionPane.showMessageDialog(null,"Desbordamiento");
			btnC.doClick();
		}
	}
	
	//Eventos de mis botones
	private void btnCActionPerformed(ActionEvent e){
		this.txtResultado.setText("");
	}
	private void btn1ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn1.getText());
		validarRango();
	}
	private void btn2ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn2.getText());
		validarRango();
	}
	private void btn3ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn3.getText());
		validarRango();
	}
	private void btn4ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn4.getText());
		validarRango();
	}
	private void btn5ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn5.getText());
		validarRango();
	}
	private void btn6ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn6.getText());
		validarRango();
	}
	private void btn7ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn7.getText());
		validarRango();
	}
	private void btn8ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn8.getText());
		validarRango();
	}
	private void btn9ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn9.getText());
		validarRango();
	}
	private void btn0ActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btn0.getText());
		validarRango();
	}
	private void btnSumaActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="+";
		txtResultado.setText("");
	}
	private void btnRestaActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="-";
		txtResultado.setText("");
	}
	private void btnDivActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="/";
		txtResultado.setText("");
	}
	private void btnMultActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="*";
		txtResultado.setText("");
	}
	private void btnPotActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="^";
		txtResultado.setText("");
	}
	private void btnIgualActionPerformed(ActionEvent e){
		segundoNumero=Integer.parseInt(txtResultado.getText());
		txtResultado.setText(OperacionesCalculadora.opResultado(operador,primerNumero, segundoNumero));
	}
}


