package unitTests;

import org.junit.Test;

import org.junit.Assert;
import modelo.Jugador;
import modelo.Quini6;

public class JugadorTest {
	
	@Test
	public void testFoo() {
		Jugador jugador = new Jugador();
		Assert.assertEquals(0, jugador.foo());
	}

	@Test
	public void testUnJugadorSeCreaConUnCiertoNombrePasadoComoParametro() {
		Jugador jugador = new Jugador("Ariel");
		Assert.assertEquals(jugador.tuNombreEs(), "Ariel");
	}
	
	@Test
	public void testUnJugadorSeCreaConCienMilPesosDeDineroDisponible() {
		Jugador jugador = new Jugador("Ariel");
		Assert.assertEquals(jugador.dineroDisponible(), 100000);
	}
	
	@Test
	public void testUnJugadorCaeEnQuini6PorPrimeraVezYSuCapitalAumentaEn50000() {
		Jugador jugador = new Jugador("Ariel");
		Quini6 quini6 = new Quini6();
		jugador.caerEnCasillero(quini6);
		Assert.assertEquals(jugador.dineroDisponible(), 150000);		
	}
	
	@Test public void testUnJugadorCaeEnQuini6PorSegundaVezYSuCapitalAumentaEn30000() {
		Jugador jugador = new Jugador("Ariel");
		Quini6 quini6 = new Quini6();
		quini6.registrarJugador(jugador);
		jugador.caerEnCasillero(quini6);
		jugador.caerEnCasillero(quini6);
		Assert.assertEquals(jugador.dineroDisponible(), 180000);	
	}
}
