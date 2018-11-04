/*Autor: José Alfredo Velázquez Ayala
 *Fecha: lunes 09 de Octubre del 2018.
 *Crear la clase DatosSangre con campos para guardar el tipo de sangre
 *(los cuatro tipos sanguíneos son O, A, B, y AB) y un factor Rh (los
 *factores son + y -). Crear un constructor por defecto (sin parámetros)
 *que ponga los campos a “O” y “+”, y un constructor sobrecargado que
 *requiera valores para ambos campos. Incluir métodos mutadores y accesores para cada campo.
*/

public class ProbarDatosSangre {
	public static void main(String[] args){
		DatosSangre Sangre1 = new DatosSangre("A","+");
		DatosSangre Sangre2 = new DatosSangre("A","-");
		DatosSangre Sangre3 = new DatosSangre("B","+");
		DatosSangre Sangre4 = new DatosSangre("B","-");
		DatosSangre Sangre5 = new DatosSangre("AB","+");
		DatosSangre Sangre6 = new DatosSangre("AB","-");
		DatosSangre Sangre7 = new DatosSangre("O","+");
		DatosSangre Sangre8 = new DatosSangre("O","-");
	//	Sangre.settipoSangre("A");
	//	Sangre.setfactor("+");
		System.out.println("Tipos de Sangre: ");
		System.out.println(Sangre1.gettipoSangre() + Sangre1.getfactor());
		System.out.println(Sangre2.gettipoSangre() + Sangre2.getfactor());
		System.out.println(Sangre3.gettipoSangre() + Sangre3.getfactor());
		System.out.println(Sangre4.gettipoSangre() + Sangre4.getfactor());
		System.out.println(Sangre5.gettipoSangre() + Sangre5.getfactor());
		System.out.println(Sangre6.gettipoSangre() + Sangre6.getfactor());
		System.out.println(Sangre7.gettipoSangre() + Sangre7.getfactor());
		System.out.println(Sangre8.gettipoSangre() + Sangre8.getfactor());
	}
}
