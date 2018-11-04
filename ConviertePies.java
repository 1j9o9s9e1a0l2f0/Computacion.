
/*
 *Autor: José Alfredo Velazquez Ayala
 *Jueves 27 de Septiembre del 2018.
 *Escribir la aplicacion ConviertePies que acepte una cantidad de pies y los convierta a centimetros y metros.
 */

import java.util.Scanner;
public class ConviertePies {
	public static void main(String [] args) {
		float pies;
			Scanner entrada = new Scanner( System.in );
			System.out.print("Ingresa la cantidad de pies: " );
			pies = entrada.nextFloat ();
			System.out.println("La cantidad de Centimetros es: " + (pies * 30.48) + " cm.");
			System.out.println("La cantidad de metros es: " + (pies * 0.3048) + " m.");
	}
}
