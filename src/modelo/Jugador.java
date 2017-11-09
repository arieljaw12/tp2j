package modelo;

public class Jugador {
	private String nombre;
	private int capital;
	private Casillero casilleroActual;

	public Jugador(String unNombre) {
		nombre = unNombre;
		capital = 100000;
	}

	public Jugador(String string, Casillero salida) {
		this.nombre = "";
		this.capital = 100000;
		this.casilleroActual = salida;
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
	
	public Casillero getCasilleroActual() {
		return casilleroActual;
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

	public void desplazar(int cantidadCasilleros) {
		for (int i = 0; i <= cantidadCasilleros;i++) {
			//this.avanzarUnCasillero();
		}
	}
	
	private void avanzarUnCasillero() {
		this.casilleroActual = this.casilleroActual.getCasilleroSiguiente();
	}

}
