import java.util.Scanner;
public class MeteValorChico {
	public static void main(String[] args) {
		int entradaUsuario;
		final int LIMITE = 3;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar un entero que no se mayor a " +LIMITE + ">");
		entradaUsuario = teclado.nextInt();
		while( entradaUsuario > LIMITE ) {
			System.out.println("El numero ingresado es incorrecto. ");
			System.out.print("Ingresar un entero no mayor a " + LIMITE + " > ");
			entradaUsuario = teclado.nextInt();
		}
		System.out.println("Se ingreso correctamente " + entradaUsuario );
	}
}
