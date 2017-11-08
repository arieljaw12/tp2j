package modelo;

public class Jugador {
	private String nombre;
	private int dinero;

	public Jugador(String unNombre) {
		nombre = unNombre;
		dinero = 100000;
	}

	public Jugador() {
		nombre = "";
		dinero = 100000;
	}

	public int foo() {
		return 0;
	}

	public String tuNombreEs() {
		return nombre;
	}

	public int dineroDisponible() {
		return dinero;
	}

	public void caerEnCasillero(Casillero unCasillero) {
		unCasillero.afectarJugador(this);
		
	}

	public void entregarDinero(int unMonto) {
		dinero += unMonto;
	}

}
