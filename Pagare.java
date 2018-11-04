/*Autor: Jose Alfredo Velazquez Ayala
 *Fecha: 14 de octubre del 2018.
 *Crear la aplicación interactiva PruebaPagare la cual pide al usuario datos para dos objetos Pagare. Pide al usuario el número de pagaré, nombre, fecha de apertura y monto para crear cada Pagare, y luego instancia los objetos. Muestra todos los valores, incluyendo la fecha de vencimiento. 
*/

public class Pagare {
		private int numero;
		Pagare(int numpag) {
			numero = numpag;
	}
		public int getnumpag(){
			return numero;
	}
		public void setnumpag(int num) {
			numero = num;
	}
}
