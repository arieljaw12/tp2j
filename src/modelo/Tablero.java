package modelo;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<Casillero> casilleros;
	
	public Tablero () {
		this.casilleros = new ArrayList<Casillero>();
		
		Salida salida = new Salida();
		casilleros.add(salida);
		Quini6 quini6 = new Quini6();
		casilleros.add(quini6);
	}
	
	public Casillero getCasilleroSalida() {
		return casilleros.get(0);
	}

	public Casillero getQuini6() {
		return casilleros.get(1);
	}
	
	public Casillero getCasilleroSiguiente(Casillero unCasillero) {
		int indexCasilleroSiguiente = casilleros.indexOf(unCasillero) + 1;
		if (indexCasilleroSiguiente > casilleros.size()) {
			indexCasilleroSiguiente = 0;
		}
		return casilleros.get(indexCasilleroSiguiente);
	}

	
}
