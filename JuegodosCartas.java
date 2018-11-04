public class JuegodosCartas {
	public static void main(String[] args) {
		CCarta cartaJugador = new CCarta();
		CCarta cartaMaquina = new CCarta();

		seleccionarCarta( cartaJugador );
		seleccionarCarta( cartaMaquina );

		System.out.println("Carta jugador: "+cartaJugador.getFigura() + " " + cartaJugador.getNumero());
		System.out.println("Carta de la maquina: "+cartaMaquina.getFigura() + " " + cartaMaquina.getNumero());
		if( cartaJugador.getFigura()==cartaMaquina.getFigura() && cartaJugador.getNumero()==cartaMaquina.getNumero() )
			System.out.println("Asignación no valida de cartas");
		else if( cartaJugador.getNumero() > cartaMaquina.getNumero() )
			System.out.println("Ud. tiene la carta mayor, felicidades");
		else if( cartaJugador.getNumero() < cartaMaquina.getNumero() )
			System.out.println("La maquina tiene la carta mayor, lo siento.");
		else
			System.out.println("Hay empate.");
	}

	public static void seleccionarCarta( CCarta c ) {
		// codificar tipo
		int numTipo = (int) (Math.random()*4);
		char tipo;
		if( numTipo == 0)
			tipo='e';
		else if( numTipo == 1)
			tipo='c';
		else if( numTipo == 2)
			tipo='d';
		else
			tipo='t';

		c.setFigura( tipo );

		int numero = (int) (Math.random()*13 + 1);
		c.setNumero( numero );
	}
}
