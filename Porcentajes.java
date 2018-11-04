/*
 *Autor: José Alfredo Velázquez Ayala
 *Fecha: Domingo 30 de Septiembre del 2018.
 *Actividad: Escribir la aplicación Porcentajes, la cual acepta dos valores double
 *del usuario desde el teclado, dejando estos en un par de variables. 
 *Luego se pasan estas variables a un método que muestra los dos valores
 *y el valor del primer número como un porcentaje del segundo. Por ejemplo,
 *si los números son 2.0 y 5.0 el método deberá mostrar algo como “2.0 es 40% 
 *de 5.0”. Después se llama a este método por segunda ocasión, invirtiendo los
 *argumentos. 
*/

import java.util.Scanner;
public class Porcentajes{
	public static void main (String [] args){
		double a1;
		double a2;
		Scanner dispEntr = new Scanner (System.in);
		System.out.print("Introduce una cantidad: ");
		a1 = dispEntr.nextDouble();
		System.out.print("Introduce otra cantidad: ");
		a2 = dispEntr.nextDouble();
		System.out.println( a1 + " es el " + (a1/a2)*100 + "% de " + a2);
	}
}
