/*Autor:Jose Alfredo Velazquez Ayala
 *Fecha: 15 de octubre del 2018.
 *Diseñar la clase Carta con un campo char para guardar el tipo de la figura de la carta ('e' para espadas, 'c' para corazones, 'd' para diamantes, o 't' para tréboles) y otro campo entero para un valor entre 1 y 13. Incluir métodos set y get para cada campo. Los métodos set deben incluir código que verifiquen que la asignación sea correcta, si no son válidos entonces la figura será 'e' y el valor 1.
*/
public class Carta {
	public char carta;
	public int valor;

	public Carta(char cart, int val) {
		carta = cart;
		valor = val;
	}
		public char getcart() {
			return carta;
	}
		public void setcart(char cart) {
			carta = cart;
	}
		public int getval() {
			return valor;
	}
		public void setval(int val) {
			valor = val;
	}
}
