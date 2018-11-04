import javax.swing.JOptionPane;
public class DialogoNumeros {
	public static void main(String[] args ) {
		int diasCredito = 30;
		JOptionPane.showMessageDialog(null, "" + diasCredito);
		JOptionPane.showMessageDialog(null, "Cada factura es por " + diasCredito + " días");
	}
}
