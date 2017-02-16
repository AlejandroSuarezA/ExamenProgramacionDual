package org.foobarspam.cotxox.testing;
import org.foobarspam.*;
import org.foobarspam.cotxox.carrera.Carrera;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarreraTest {


	
	@Test
	public void testOrigen() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		assertEquals(origen, carrera.getOrigen());
		
	}
	
	@Test
	public void testDestino(){
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		assertEquals(destino, carrera.getDestino());
	}

}
