/*Autor: José Alfredo Velázquez Ayala
 *Fecha: Lunes 09 de Octubre del 2018.
 *

import javax.swing.JOptionPane;
public class Facturacion {
		private static double adeudo = 0;
		private static double Iva = 0;
	public static void main(String[] args) {
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de parametros que deseas ingresar:\n 1.- un parametro \n 2.- dos parametros \n 3.- tres parametros"));
		double Precio = 0;
		int Cantidad = 0;
		int Cupon = 0;
		if(opcion == 1) {
		Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio:"));
		double Total = calcularFacturacion1(Precio);
		JOptionPane.showMessageDialog(null, "Adeudo total es: " + Total);
		}
		else{if(opcion == 2){
		Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio: "));
		Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
		double Total = calcularFacturacion2(Precio, Cantidad);
		JOptionPane.showMessageDialog(null, "Adeudo total es: " + Total);
		}
		else{if(opcion == 3){
		Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio: "));
		Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
		Cupon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje del cupon: "));
		double Total = calcularFacturacion3(Precio, Cantidad, Cupon);
		JOptionPane.showMessageDialog(null, "Adeudo total es: " + Total);
		}
		else{
		JOptionPane.showMessageDialog(null, "Esta opcion no es valida");
		}

	}
	}
}

	public static  double calcularFacturacion1(double Precio){
		Iva = (Precio*0.16);
		return adeudo = ((Precio) + Iva);
	}

	public static  double calcularFacturacion2(double Precio, int Cantidad){
		Iva = ((Precio*Cantidad)*0.16);
		return adeudo = ((Precio*Cantidad)+Iva);
	}

	public static double calcularFacturacion3(double Precio, int Cantidad, double Cupon){
		double Descuento = ((Precio*Cantidad)*(Cupon/100));
		Iva = ((Precio*Cantidad)*0.16);
		return adeudo = (((Precio*Cantidad)-Descuento)+Iva);
	}
}
