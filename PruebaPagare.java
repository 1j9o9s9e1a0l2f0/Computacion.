/*Autor: Jose Alfredo Velazquez Ayala
 *Fecha: 14 de octubre del 2018.
 *Crear la clase Pagare. La clase contiene campos de datos que guardan un número de pagaré, apellido paterno del cuentahabiente, monto, fecha de apertura y fecha de vencimiento, usar objetos GregorianCalendar para cada fecha. Proporcionar métodos accesores y mutadores para cada campo. También proporcionar un constructor que requiera parámetros para poner los primeros cuatro campos, y calcule la fecha de vencimiento un año después de la fecha de apertura.
La clase GregorianCalendar es útil cuando se trabaja con fechas y tiempos. Tiene siete constructores disponibles para crear objetos. El método de instancia get con diferentes constantes devuelve información relativa a la fecha, como el año, o el mes. Consultar la documentación para mayor información. 
*/



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
public class PruebaPagare {
	public static void main(String[] args) {
		Pagare numerop = new Pagare();
		Date fecha = new Date();
		Date vencimient = new Date();
		GregorianCalendar apert = new GregorianCalendar();
		apert.setTime(fecha);
		System.out.println(fecha);
		System.out.println("Fecha de apertura	"  + apert.get(Calendar.YEAR) +  "/" + apert.get(Calendar.MONTH) + "/" + apert.get(Calendar.DAY_OF_MONTH));
		GregorianCalendar vencimiento = new GregorianCalendar();
		vencimiento.setTime(vencimient);
		System.out.println(vencimient);
		System.out.println("Fecha de vencimiento es:	" + vencimiento.get(Calendar.YEAR));
		System.out.println("Vencimientos" + vencimiento);
		Scanner numeropp = new Scanner(System.in);
		System.out.println("Ingresa el numero de pagare");
		numeropp.setnumpag.nextInt();
		numerop = (numeropp.setnumpag.nextInt());
		System.out.println("El numero de pagare es: " + numerop.getnumpag());
	}
}
