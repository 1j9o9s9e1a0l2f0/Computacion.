/*Autor: José Alfredo Velázquez Ayala.
 *Fecha: viernes 2 de Noviembre del 2018.
 *Esta clase es usada para crear una versión del juego de dados Pig, en el cual un usuario juega contra la computadora.
 *El objetivo del juego es ser el primero en alcanzar 100 puntos. El usuario y la computadora toman turno para lanzar un par de dados siguiendo las siguientes reglas:
 *En cada turno, cada jugador “lanza” dos dados. Si no aparece ningún uno, los valores de los dados son sumados a su total,
 *y el jugador puede escoger si lanza otra vez, o le pasa el turno al otro jugador.
 *Si un uno aparece en alguno de los dados, nada es agregado al total del jugador, y el turno pasa al otro jugador.
 *Cuando ambos dados tienen uno entonces el total del jugador se pierde, y su turno termina.
 *En esta versión del juego, cuando la computadora no lanza algún uno entonces para decidir sí lanza otra vez se hace generando
 *un valor aleatorio entre 0 y 1. La computadora seguirá lanzando los dados sí el valor es igual, o mayor a 0.5 y la computadora pasa el turno al jugador cuando es valor es menor a 0.5
 */

import java.util.Random;
import javax.swing.JOptionPane;
public class Pig {
	public static void main(String[] args) {
		int turno = 1;
		int dado1;
		int dado2;
		int totalJugador = 0;
		int totalComputadora = 0;

		Dado d = new Dado();
		while((totalJugador <= 100) && (totalComputadora  <= 100)) {
			if(turno == 1) {
			JOptionPane.showMessageDialog(null, "Es tu turno da enter para continuar.");
			dado1 = d.getDado();
			dado2 = d.getDado();
			System.out.println(" Jugador");
			System.out.println(" " + dado1);
			System.out.println(" " + dado2);
			System.out.println(" ");
				if((dado1 != 1) && (dado2 != 1)) {
					totalJugador = totalJugador + dado1 + dado2;
					turno = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n 1) Lanzar de nuevo. \n 2) Dar la oportunidad al otro jugador. "));
					if((dado1 == 1) && (dado2 == 1)) {
						totalJugador = 0;
						turno = 2;
					}
				}
				else {
				turno = 2;
				}
			}
			else if(turno == 2) {
				JOptionPane.showMessageDialog(null, "Es el turno de la PC");
				dado1 = d.getDado();
				dado2 = d.getDado();
				System.out.println("Computadora:");
				System.out.println("	" + dado1);
				System.out.println("	" + dado2);
				System.out.println("	");

				if((dado1 != 1) && (dado2 != 1)) {
					totalComputadora = totalComputadora + dado1 + dado2;
					if((dado1 == 1) && (dado2 == 1)) {
						totalComputadora = 0;
						turno = 1;
					}
					double random = new Random().nextDouble();
					double result = (random + (1 - 0));

					if(result < 0.5) {
						turno = 2;
					}
					else {
					turno = 1;
					}
				}
				else {
				turno = 1;
				}
			}
			System.out.println("El total de puntos de Jugador es: " + totalJugador);
			System.out.println("El total de puntos de la Computadora es: " + totalComputadora);
	}
		if(totalJugador >= 100) {
			JOptionPane.showMessageDialog(null, "Tienes suerte pz has ganado, Felicidades!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Uuuu lo siento pero la computadora ha ganado, jajaja");
		}
	}
}
