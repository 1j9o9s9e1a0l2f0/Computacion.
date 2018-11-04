//Autor: José Alfredo Velázquez Ayala
//Fecha: Jueves 27 de Septiembre del 2018
/* Escribir la aplicación CincoNumeros la cual usa un cuadro
de dialogo que encadena cinco numeros. Esta cadena sera convertida 
al entero que represente un numero multiplicado por el dia de tu 
cumpleaños usando un cuadro de dialogo.*/

import javax.swing.JOptionPane;
public class CincoNumeros {
	public static void main (String [] args ) {
		String CincoNumeros;
		int DiadeCumpleaños = 20;
		CincoNumeros=JOptionPane.showInputDialog("Ingrese un numero de 5 digitos: ");
		int Entero=Integer.parseInt(CincoNumeros);
		JOptionPane.showMessageDialog(null,"El numero multiplicado por el cumpleaños es: " + (Entero*DiadeCumpleaños) + ".");
	}
}

