package p1;
public class OperacionesCalculadora {

	//Metodo para operacionar
	public static String opResultado(String operacion, int n1, int n2){
		switch(operacion){
		case "^":
			if(n2 !=0){
				double potencia = Math.pow(n1, n1);
				return potencia + "";
			}
			break;
		case "/":
			if (n1>0 && n2>0){
				int divicion = n1/n2;
				return divicion +""; 
			}else {
				return "No es posible dividir entre 0";
			}
		case"+":
			int suma= n1 + n2;
			return suma+"";
			
		case "-":
			int resta=n1 - n2;
			return resta+"";	
			
		case "*":
			int multiplicacion = n1 * n2;
			return multiplicacion+"";
			
		default: 
			return"";
		}
		return null;	
	}	
}
