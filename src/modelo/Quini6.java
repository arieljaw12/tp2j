package modelo;

import java.util.concurrent.ConcurrentHashMap;

public class Quini6 extends Casillero{
	
	private ConcurrentHashMap<Jugador, Integer> jugadores;
	
	public Quini6() {
		this.jugadores = new ConcurrentHashMap<>();

	}

	@Override
	public void afectarJugador(Jugador unJugador) {
		if (!jugadores.containsKey(unJugador)) {
			unJugador.entregarDinero(50000);
			jugadores.put(unJugador, 1);
		}
		else if (jugadores.get(unJugador) == 1) {
			unJugador.entregarDinero(30000);
			jugadores.put(unJugador, 2);
		}		
	}
}
