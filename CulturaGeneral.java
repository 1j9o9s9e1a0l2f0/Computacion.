/*Autor: José Alfredo Velázquez Ayala.
 *Fecha: 20 de Octubre del 2018.
 *Actividad: Escribir la aplicación CulturaGeneral para realizar una prueba.
 *La prueba debe contener al menos cinco preguntas de cultura general.
 *Cada pregunta debe ser de opción múltiple, con al menos 4 opciones.
 *Cuando la respuesta del usuario es correcta, se debe mostrar un mensaje de felicitación,
 *de otra forma se deberá volver a preguntar mientras la pregunta sea incorrecta.
*/


import java.util.Scanner;
public class CulturaGeneral {
	public static void main(String[] args) {
		int pregunta1;
		int pregunta2;
		int pregunta3;
		int pregunta4;
		int pregunta5;
	System.out.println("	Hola buen dia, a continuacion le presento algunas preguntas de cultura general	");
		Scanner respuesta = new Scanner(System.in);
		System.out.println("¿cual es el lugar mas frio del  mundo?\n 1)	El mar. \n 2)	La selva. \n 3)	Canada. \n 4)	Antartida. ");
		pregunta1 = respuesta.nextInt();
		while(pregunta1 != 4) {
		System.out.println("La respiuesta es incorrecta. Intentelo de nuevo");
		System.out.println();
		System.out.println("¿cuale es el lugar mas frio del mundo?\n 1)	El mar. \n 2)	La selva. \n 3)	Canada. \n 4)	Antartida.");
		pregunta1 = respuesta.nextInt();
		}
		System.out.println("Felicidades, en efecto el lugar mas frio del mundo es la antartida");
		System.out.println();
		System.out.println("¿Cual es el rio mas largo del mundo?\n 1)	Nilo. \n 2)	Amazonas. \n 3)	Bravo. \n 4)	Mississipi.");
		pregunta2 = respuesta.nextInt();
		while(pregunta2 != 2) {
		System.out.println("La respuesta es incorrecta. Intentelo de nuevo.");
		System.out.println();
		System.out.println("¿Cual es el rio mas largo del mundo?\n 1)	Nilo. \n 2)	Amazonas. \n 3)	Bravo. \n 4)	Mississipi.");
		pregunta2 = respuesta.nextInt();
		}
		System.out.println("Felicidades, en efecto el rio mas largo del mundo es el Amazonas. ");
		System.out.println();
		System.out.println("¿En qué continente está Ecuador?\n 1)	America. \n 2)	Europa. \n 3)	Africa. \n 4)	Asia.");
		pregunta3 = respuesta.nextInt();
		while(pregunta3 != 1) {
		System.out.println("La respuesta es incorrecta. Intentelo de nuevo.");
		System.out.println();
		System.out.println("¿En qué continente está Ecuador?\n 1)	Ameria. \n 2)	Europa. \n 3)	Africa. \n 4)	Asia.");
		pregunta3 = respuesta.nextInt();
		}
		System.out.println("Felicidades, en efecto le ecuador se encuentra en America. ");
		System.out.println();
		System.out.println("¿Qué cantidad de huesos tiene el cuerpo humano?\n 1)	100. \n 2)	150. \n 3)	206. \n 4)	250.");
		pregunta4 = respuesta.nextInt();
		while(pregunta4 != 3) {
		System.out.println("La respuesta es incorrecta. Intentelo de nuevo.");
		System.out.println();
		System.out.println("¿Qué cantidad de huesos tiene el cuerpo humano?\n 1)	100. \n 2)	150. \n 3)	206. \n 4)	250.");
		pregunta4 = respuesta.nextInt();
		}
		System.out.println("Felicidades, en efecto el cuerpo humano tiene 206 huesos.");
		System.out.println();
		System.out.println("¿Cómo se llama el fundador de Facebook?\n 1)	Mark Zuckerberg. \n 2)	Jean Claude Vann Dame. \n 3)	Miguel Hidalgo. \n 4)	Hector Tejeda.");
		pregunta5 = respuesta.nextInt();
		while(pregunta5 != 1) {
		System.out.println("La respuesta es iincorrecta. Intente de nuevo. ");
		System.out.println();
		System.out.println("¿Como se llama el fundador de Facebook? \n 1)	Mark Zuckerberg. \n 2)	Jean Claude Vann Dame. \n 3)	Miguel Hidalgo. \n 4)	Hector Tejeda.");
		pregunta5 = respuesta.nextInt();
		}
		System.out.println("Felicidades compañero has respondio todas las preguntas correctamente");
	}
}
