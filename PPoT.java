import java.util.Random;
import java.util.Scanner;
public class PPoT {
	public static void  main(String[] args){
	int ran;
	char Usuario;
	String compu;
	Scanner eleccion = new Scanner(System.in);
	System.out.println("Escribe tu respuesta: ");
	Usuario = eleccion.next().charAt(0);
	System.out.println("la eleccion del usuario es: " + Usuario);

	Random rdm = new Random();
	ran = rdm.nextInt((3 - 1) + 1) +1;
	System.out.println("el " + ran);

	if(ran == 1) {
		compu = 'tijeras';
		System.out.println("La respuesta de la computadora es: " + compu);
	}
	}
}
