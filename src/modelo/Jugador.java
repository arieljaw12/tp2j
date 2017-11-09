package modelo;

public class Jugador {
	private String nombre;
	private int capital;

	public Jugador(String unNombre) {
		nombre = unNombre;
		capital = 100000;
	}

	public Jugador() {
		nombre = "";
		capital = 100000;
	}

	public String tuNombreEs() {
		return nombre;
	}

	public int capitalTotal() {
		return capital;
	}

	public void caerEnCasillero(Casillero unCasillero) {
		unCasillero.afectarJugador(this);
		
	}

	public void entregarDinero(int unMonto) {
		capital += unMonto;
	}

	// En principio devuelve boolean, pero habria que contemplar en que momento el jugador decide
	// por si o por no a comprar el terreno. Siempre y cuando tenga el capital suficiente.
	public boolean venderTerrenoEn(Terreno unTerreno, int precio) {
		if(precio <= capital) {
			capital-= precio;
			return true;
		}
		return false;
	}




}
