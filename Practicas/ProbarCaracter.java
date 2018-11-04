import java.util.Scanner;
public class ProbarCaracter {
	public static void main(String[] args) {
	char unChar ;
	Scanner teclado  = new Scanner( System.in);
	System.out.println( " Ingresar un caracter : ");
	unChar = teclado.nextLine().charAt(0);
	System.out.println( "El caracter es: " + unChar);
	if(Character.isUpperCase(unChar))
	System.out.println( unChar + " esta en mayusculas");
		 else
			System.out.println( unChar + " no esta en mayusculas");
	if (Character.isLowerCase(unChar))
		System.out.println( unChar + " esta en minusculas");
		else{
			System.out.println( unChar + " no esta en minusculas");
			unChar = Character.toLowerCase(unChar);
			System.out.println("Despues de toLowerCase(), unChar es " + unChar);
			unChar = Character.toUpperCase(unChar);
			System.out.println( "Despues de toUpperCase(), un Char es " + unChar);
		}
	if (Character.isLetterOrDigit(unChar))
		System.out.println( unChar + " es una letra o digito");
		else
			System.out.println( unChar + " ni es una letra ni un digito");
	if(Character.isWhitespace(unChar))
		System.out.println(unChar + " es un blanco.");
		else
			System.out.println(unChar + " No es un blanco.");
	}
}
