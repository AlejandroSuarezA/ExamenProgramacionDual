package org.foobarspam.cotxox.testing;
import org.foobarspam.*;
import org.foobarspam.cotxox.carrera.Carrera;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {
	String tarjetaCredito;
	String origen;
	String destino;
	double distancia;
	int tiempoEsperadoMinutos;
	Carrera carrera;
	
	@Before
	public void intialize(){
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		
		carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
	}

	

	
	@Test
	public void testOrigen() {

		origen = "Aeroport Son Sant Joan";
		
		assertEquals(origen, carrera.getOrigen());
		
	}
	
	@Test
	public void testDestino(){

		destino = "Magaluf";
		
		assertEquals(destino, carrera.getDestino());
	}
	
	@Test
	public void testTarjetaCredito(){

		tarjetaCredito = "4916119711304546";
		
		assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
	}
	
	@Test
	public void testDistancia(){

		distancia = 7.75;
		
		assertEquals(distancia, carrera.getDistancia(), 0.0);
	}
	
	@Test
	public void testPrecio(){

		
		double precioEsperado = 13.9625;
		
		assertEquals(precioEsperado, carrera.getCosteEsperado(), 0.001);
		
	}
	
	@Test
	public void testPrecioMinimo(){
		

		double distancia = 1.00;
		int tiempoEsperadoMinutos = 1;

		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		double precioEsperado = 5.00;
		
		assertEquals(precioEsperado, carrera.getCosteEsperado(), 0.001);
		
	}
	
	
	@Test
	public void testPagoRealizado(){

		

		
		double precioEsperado = 13.9625;
		carrera.realizarPago(carrera.getCosteEsperado());
		
		assertEquals(precioEsperado, carrera.getCosteTotal(), 0.001);
		
		
	}
	
	@Test
	public void testPropina(){

		
		double precioEsperado = 5;
		carrera.recibirPropina(5);
		
		assertEquals(precioEsperado, carrera.getPropina(), 0.001);
		
		
	}


}
