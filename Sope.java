/*Autor: José Alfredo Velázquez Ayala.
 *Fecha: Jueves 4 de octubre del 2018.
 *Actividad: Crear la clase Sope con los siguientes campos de datos: un String 
 *para el ingrediente principal, como queso, frijoles, papa, etc., otro String 
 *para el tipo de masa, como maíz blanco, maíz de color, nopal, etc., y un double 
 *para el precio, como 10.00. Incluir métodos accesores y mutadores para cada 
 *uno de los campos.
*/


public class Sope {
	private String ingredienteP;
	private String tipoMasa;
	private double precio;
		public String getIngredientes() {
			return ingredienteP;
	}
		public void setIngredientes(String ingrediente) {
			ingredienteP = ingrediente;
	}
		public String getMasas() {
			return tipoMasa;
	}
		public void setMasas(String Masitas) {
			tipoMasa = Masitas;
	}
		public double getPrecios() {
			return precio;
	}
		public void setPrecios(double precioSope) {
			precio = precioSope;
	}
}
