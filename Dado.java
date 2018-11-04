/*Autor: José Alfredo Velázquez Ayala.
 *Fecha: Viernes 2 de Noviembre del 2018.
 *Diseñar la clase Dado, la cual tiene un constructor que aleatoriamente pone el valor del dado y un método de consulta para ese campo.
 */

import java.util.Random;
public class Dado {
	int dado;
	Random r = new Random();
	public int getDado() {
	dado = r.nextInt((6 - 1) + 1) + 1;
	return dado;
	}
}
