/*Autor: José Alfredo Velázquez Ayala
 *Fecha: 18 de Octubre del 2018.
 *Escribir la aplicación OperacionBinaria la cual pide al usuario dos enteros y luego pide que ingrese una
 *opción para hacer una de las siguientes operaciones: 1 para sumar los dos enteros, 2 para sustraer el
 *segundo entero del primero, 3 para multiplicar los enteros, 4 para dividir el primer entero por el segundo
 *y 5 para elevar el primer entero al segundo entero. Mostrar un mensaje de error si el usuario ingresa una
 *opción que no esté entre 1 y 5, o si el usuario escogió dividir entre cero.
*/

import javax.swing.JOptionPane;
public class OperacionBinaria {
		private static double solucion = 0;
	public static void main(String[] args) {
		int onenumber = 0;
		int twonumber = 0;
		int operacion = Integer.parseInt(JOptionPane.showInputDialog("Elija el numero de la operacion que desea realizar: \n 1)	Suma.  \n 2)	Resta.  \n 3)	Multiplicacion.  \n 4) Divicion.  \n 5)	Elevar a la potencia."));

		if(operacion == 1) {
		onenumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor que sera parte de la suma: "));
		twonumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor que sera parte de la suma: "));
		double Resultado = resultadoSuma(onenumber, twonumber);
		JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + Resultado );
		}
		else{if(operacion ==2) {
		onenumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor al cual le quiere restar: "));
		twonumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que quiere restar: "));
		double Resultado = resultadoResta(onenumber, twonumber);
		JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + Resultado);
		}
		else{if(operacion == 3) {
		onenumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea multiplicar: "));
		twonumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que multiplicara: "));
		double Resultado = resultadoMultiplicacion(onenumber, twonumber);
		JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + Resultado);
		}
		else{if(operacion == 4) {
		onenumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que sera dividendo: "));
		twonumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor: "));
		double Resultado = resultadoDivicion(onenumber, twonumber);
		JOptionPane.showMessageDialog(null, "el resulatdo de la divicion es: " + Resultado);
		}
		else{if(operacion == 5) {
		onenumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero que sera elevado al exponente x: "));
		twonumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
		double Resultado = resultadoExponente(onenumber, twonumber);
		JOptionPane.showMessageDialog(null, "El resultado de elevar al exponente es: " + Resultado);
		}
		else{
		JOptionPane.showMessageDialog(null, "Esta opcion no es valida");
	}
	}
	}
	}
	}
}

		public static double resultadoSuma(int onenumber, int twonumber) {
			return solucion = (onenumber+twonumber);
	}
		public static double resultadoResta(int onenumber, int twonumber) {
			return solucion = (onenumber-twonumber);
	}
		public static double resultadoMultiplicacion(int onenumber, int twonumber) {
			return solucion = (onenumber*twonumber);
	}
		public static double resultadoDivicion(int onenumber, int twonumber) {
			return solucion = (onenumber/twonumber);
	}
		public static double resultadoExponente(int onenumber, int twonumber) {
			return solucion = Math.pow(onenumber,twonumber);
	}
}

		//Si se pudo:).
