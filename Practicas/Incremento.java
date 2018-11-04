public class Incremento {
	public static void main(String[] args) {
		double salario = 1500;
		prediceIncremento(salario);
		System.out.println("Ganas mucho");
	}
	public static void  prediceIncremento(double salario) {
		double nuevaCantidad;
		final double INCREMENTO = 1.10;
		nuevaCantidad = salario*INCREMENTO;
		System.out.println("El metodo salario con incremento es: " + nuevaCantidad);
	}
}
