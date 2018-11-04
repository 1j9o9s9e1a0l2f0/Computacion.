/*Autor:José Alfredo Velazquez Ayala
 *Fecha: Lunes 09 de Octubre del 2018.
 *Crear la clase llamada Facturacion que incluye tres métodos sobrecargados calculaFactura() para un negocio de fotocopias de libros.
 *Cuando calculaFactura() recibe un sólo parámetro, este representa el precio de un libro fotocopiado. Agrega 16% de impuesto, y regresa el total del adeudo.
 *Cuando calculaFactura() recibe dos parámetros, estos representan el precio de un libro fotocopiado y la cantidad ordenada. Multiplicar los dos valores, agregar 16% de impuesto, y regresar el total del adeudo.
 *Cuando calculaFactura() recibe tres parámetros, estos representan el precio de un libro fotocopiado, la cantidad ordenada, y un cupón de descuento. Multiplicar el precio y la cantidad, luego reducir el resultado anterior con el valor del cupón, y agregar el 16% de impuestos. Regresar el total del adeudo.
*/

public class DatosSangre {
		private String tipoSangre;
		private String factorRH;

		public DatosSangre(String tipoSangre, String factor) {
			this.tipoSangre = tipoSangre;
			this.factorRH = factor;
	}
			public String gettipoSangre() {
				return tipoSangre;
		}
			public void settipoSangre(String Sangre) {
				tipoSangre = Sangre;
		}
			public String getfactor() {
				 return factorRH;
		}
			public void setfactor(String factor) {
				factorRH = factor;
		}
}
