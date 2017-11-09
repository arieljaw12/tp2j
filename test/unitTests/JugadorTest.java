package unitTests;

import org.junit.Assert;
import org.junit.Test;

import modelo.BuenosAiresSur;
import modelo.Casillero;
import modelo.Jugador;
import modelo.Quini6;
import modelo.Tablero;

public class JugadorTest {
	
	
	@Test
	public void testUnJugadorSeCreaConUnCiertoNombrePasadoComoParametro() {
		Jugador jugador = new Jugador("Ariel");
		Assert.assertEquals(jugador.tuNombreEs(), "Ariel");
	}
	
	@Test
	public void testUnJugadorSeCreaConCienMilPesosDeDineroDisponible() {
		Jugador jugador = new Jugador("Ariel");
		Assert.assertEquals(jugador.capitalTotal(), 100000);
	}
	
	@Test
	public void testUnJugadorCaeEnQuini6PorPrimeraVezYSuCapitalAumentaEn50000() {
		Jugador jugador = new Jugador("Ariel");
		Quini6 quini6 = new Quini6();
		quini6.registrarJugador(jugador);
		jugador.caerEnCasillero(quini6);
		Assert.assertEquals(jugador.capitalTotal(), 150000);		
	}
	
	@Test public void testUnJugadorCaeEnQuini6PorSegundaVezYSuCapitalAumentaEn30000() {
		Jugador jugador = new Jugador("Ariel");
		Quini6 quini6 = new Quini6();
		quini6.registrarJugador(jugador);
		jugador.caerEnCasillero(quini6);
		jugador.caerEnCasillero(quini6);
		Assert.assertEquals(180000, jugador.capitalTotal());	
	}
	
	@Test public void testUnJugadorCaeEnQuini6PorTerceraVezYSuCapitalNoAumenta() {
		Jugador jugador = new Jugador("Ariel");
		Quini6 quini6 = new Quini6();
		quini6.registrarJugador(jugador);
		jugador.caerEnCasillero(quini6);
		jugador.caerEnCasillero(quini6);
		jugador.caerEnCasillero(quini6);
		Assert.assertEquals(180000, jugador.capitalTotal());
	}
	
	@Test public void testUnJugadorCaeEnUnTerrenoYAlComprarloSeVuelveElPropietario() {
		Jugador jugador = new Jugador("Ariel");
		BuenosAiresSur bsasSur = new BuenosAiresSur();
		jugador.caerEnCasillero(bsasSur);
		Assert.assertEquals(jugador, bsasSur.propietario());
	}
	
	@Test
	public void testGetCasilleroActualDeUnNuevoJugadorEsSalida() {
		Tablero tablero = new Tablero();
		Casillero salida = tablero.getCasilleroSalida();
		Jugador jugador = new Jugador("Gonza",salida);
		Assert.assertEquals(salida, jugador.getCasilleroActual());
	}
	
	@Test
	public void testJugadorAvanzaUnCasilleroDesdeLaSalidaSeUbicaEnQuini6() {
		Tablero tablero = new Tablero();
		Casillero salida = tablero.getCasilleroSalida();
		Jugador jugador = new Jugador("Gonza",salida);
		Casillero quini6 = tablero.getQuini6();
		jugador.desplazar(1);
		Assert.assertEquals(quini6, jugador.getCasilleroActual());
	}
	
	
}
