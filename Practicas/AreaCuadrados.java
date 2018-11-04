import javax.swing.JOptionPane;
public class AreaCuadrados {
	public static void main(String[] args) {
		int ladoCuadrado;
		int cantidadCuadrados = 5;
		ladoCuadrado = JOptionPane.showInputDialog(null, "Ingresa la medida de un lado del cuadrado: ");
		int Entero = Integer.parseInt(ladoCuadrado);
		JOptionPane.showMessageDialog(null, "El area de 5 cuadrados con la medida del lado que ingreso es de: " + ((ladoCuadrado)*5) + " unidades cuadradas");
	}
}
