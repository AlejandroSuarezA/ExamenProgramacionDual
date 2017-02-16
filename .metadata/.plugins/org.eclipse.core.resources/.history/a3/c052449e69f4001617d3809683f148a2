package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TarifaTest {

	@Test
	public void precioDistanciaTest() {
		
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		
		double precioEsperado = 10.4625;
		assertEquals(precioEsperado, Tarifa.getCosteDistancia(distancia), 0.001);
		
	}
	
	@Test
	public void precioTiempotest(){
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		
		double precioEsperado = 3.5;
		assertEquals(precioEsperado , Tarifa.getCosteTiempo(tiempoEsperadoMinutos), 0.001);
		
		
	}
	
	@Test
	public void precioTotal(){
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		
		double precioEsperado = 13.9625;
		
		assertEquals(precioEsperado, Tarifa.getCosteTotalEsperado(tiempoEsperadoMinutos, distancia), 0.001);
	}

}
