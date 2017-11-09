package modelo;

public class BuenosAiresSur extends Terreno{

	// Constructor por defecto crea con precio del enunciado.
	public BuenosAiresSur() {
		precio = 20000;
		propietario = null;
	}
	
	// Habria que contemplar en un futuro la opcion de que el jugador no quiera comprar el terreno.
	// Creo que el afectarJugador le enviaria un mensaje mas bien del tipo ofrecerTerreno() al jugador
	// Pero esto implica cuestiones de la VISTA creo.
	@Override
	public void afectarJugador(Jugador unJugador) {
		if(unJugador.venderTerrenoEn(this, this.precio)) {
			propietario = unJugador;
		}
		
	}
	public Jugador propietario() {
		return propietario;
	}


}
