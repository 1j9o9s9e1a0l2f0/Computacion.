/*Autor: José Alfredo Velázquez Ayala
 *Fecha:jueves 4 de Octubre del 2018.
 *Actividad: Crear la aplicación Cenaduria la cual instancia al menos tres

 *objetos Sope con la finalidad de crear una carta de productos disponibles.
 *El programa deberá mostrar la carta, es decir, cada uno de los tipos de
 *sopes disponibles.
*/


public class Cenaduria {
	public static void main(String[] args) {
		public Sope (

		Sope ingredienteP1 = new Sope();
		Sope ingredienteP2 = new Sope();
		Sope ingredienteP3 = new Sope();
		Sope ingredienteP4 = new Sope();
		Sope tipoMasa1 = new Sope();
		Sope tipoMasa2 = new Sope();
		Sope tipoMasa3 = new Sope();
		Sope precio1 = new Sope();
		Sope precio2 = new Sope();
		Sope precio3 = new Sope();
		ingredienteP1.setIngredientes("Salchicha");
		ingredienteP2.setIngredientes("Jamon");
		ingredienteP3.setIngredientes("chuleta");
		ingredienteP4.setIngredientes("Chorizo");
		tipoMasa1.setMasas("Maiz Amarillo");
		tipoMasa2.setMasas("Maiz Negro");
		tipoMasa3.setMasas("Maiz Rosa");
		precio1.setPrecios(15.00);
		precio2.setPrecios(18.00);
		precio3.setPrecios(20.00);
		System.out.println("INGREDIENTES: ");
		System.out.println("1)	" + ingredienteP1.getIngredientes());
		System.out.println("2)	" + ingredienteP2.getIngredientes());
		System.out.println("3)	" + ingredienteP3.getIngredientes());
		System.out.println("4)	" + ingredienteP4.getIngredientes());
		System.out.println();
		System.out.println("TIPO DE MASA: ");
		System.out.println("1)	" + tipoMasa1.getMasas());
		System.out.println("2)	" + tipoMasa2.getMasas());
		System.out.println("3)	" + tipoMasa3.getMasas());
		System.out.println();
		System.out.println("PRECIOS: ");
		System.out.println("Chico:	$" + precio1.getPrecios());
		System.out.println("Madiano:	$" + precio2.getPrecios());
		System.out.println("Grnade:	$" + precio3.getPrecios());
		System.out.println();
		System.out.println("Un sope al dia es la llave de la alegria.");
	}
}
