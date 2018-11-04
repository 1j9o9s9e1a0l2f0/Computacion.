import java.util.Scanner;
public class Crunch {
	public static void main( String[] args) {
		String nom;
		String crunch;
		int edad;
		Scanner teclado = new Scanner( System.in );
		System.out.print("¿quien te gusta? ");
		crunch = teclado.nextLine();
		System.out.print("¿Cual es tu nombre? ");
		nom = teclado.nextLine();
		System.out.print("¿Cuantos Años tienes? ");
		edad = teclado.nextInt();
		System.out.println("Tu nombre es " + nom);
		System.out.println("Tienes " + edad + "años.");
		System.out.println("Si te gusta " + crunch + " llegale no pierdes nada.");
	}
}
