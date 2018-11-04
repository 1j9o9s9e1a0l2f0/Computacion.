/*
 *Autor: José Alfredo Velázquez Ayala
 *Fecha: Domingo 30 de de Septiembre del 2018.
 *Escribir la aplicación PreciosGasolina la cual tiene declarada una
 *variable entera en el método main(), para guardar el precio del barril
 *de gasolina, y este es asignado por un valor dado desde el teclado por
 *el usuario. Cuando el barril de gasolina está en 2,000 pesos, entonces
 *el precio al consumidor en la gasolinera está entre 18 y 20 pesos por litro.
 *Crear un método al cual se le pasa el precio del barril. El método muestra
 *el rango de precios por litro. Por ejemplo, si la gasolina está en 2,400
 *pesos por barril, entonces el precio en la gasolinera deberá estar entre 21.60 y 24 pesos. 
*/

import java.util.Scanner;
public class PreciosGasolina {
		public static void main(String [] args) {
		int CostoBarril;
		Scanner dispEntr = new Scanner (System.in);
		System.out.print("Ingresa el costo del barril de gasolina: $");
		CostoBarril = dispEntr.nextInt();
		Precios(CostoBarril);
	}
	public static void Precios(int CostoBarril){
		int CostoMinimo = CostoBarril/111;
		int CostoMaximo = CostoBarril/100;
		System.out.println("El precio de un lt de gasolina se encuentra entre  $" + CostoMinimo + " y $" + CostoMaximo + " pesos.");
	}
}

	
	
