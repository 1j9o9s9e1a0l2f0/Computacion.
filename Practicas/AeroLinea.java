import javax.swing.JOptionPane;
public class AeroLinea {
	public static void main(String[] args) {
		int seleccion;
		boolean esSi;
		seleccion = JOptionPane.showConfirmDialog(null, "¿Desea Ascender a primera clase?");
		esSi = (seleccion == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "Usted respondio " + esSi );
	}
}
