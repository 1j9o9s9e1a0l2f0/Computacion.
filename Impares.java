/*Autor:José Alfredo Velázquez Ayala.
 *Fecha: 18 de Octubre del 2018.
 *Actividad:Escribir la aplicación Impares, la cual muestra todos los números
 *impares entre el 1 y el 99 inclusive. También se inicia una línea nueva
 *después de que se muestran 9 números en una línea.
*/

public class Impares {
	public static void main(String[] args) {
		System.out.println("Los numeros impares que se encuentran entre en el numero 1 y el 99 son: ");
		final int Max = 49;
		int contador = 0;
		for(int n = 2; n <= Max; n = n+1) {
		System.out.println(((2*n)-1));
		if(contador == 9) {
		contador = 0;
		System.out.println();
		}
		contador++;
	}
	}
}
