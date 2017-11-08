package modelo;

import java.util.concurrent.ConcurrentHashMap;

public class Quini6 extends Casillero{
	
	private ConcurrentHashMap<Jugador, Integer> jugadores;
	
	public Quini6() {

	}

	@Override
	public void afectarJugador(Jugador unJugador) {
		unJugador.entregarDinero(50000);
		//Habría que modificar de alguna manera el valor de un jugador en el mapa cuando es afectado.
	}

	public void registrarJugador(Jugador jugador) {
		jugadores.put(jugador, 2);		
	}
}
