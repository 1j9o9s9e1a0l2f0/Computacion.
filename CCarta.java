public class CCarta {
	private char figura;
	private int numero;

	public char getFigura() {
		return figura;
	}
	public int getNumero() {
		return numero;
	}

	public void setFigura( char f ) {
		if( f=='e' || f=='c' || f=='d' || f=='t' )
			figura = f;
		else
			figura = 'e';
	}
	public void setNumero( int v ) {
		if( v<1 || v>13 ) // fuera de rango entonces asignar 1
			numero = 1;

		else
			numero = v;
	}
}
