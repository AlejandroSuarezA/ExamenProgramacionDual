package org.foobarspam.cotxox.testing;

import org.foobarspam.cotxox.carrera.*;
import org.foobarspam.cotxox.conductores.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConductorTest {
	
	Conductor conductor;
	
	@Before
	public void initialize(){
		conductor = new Conductor("Sam");
	}

	@Test
	public void testNombre() {
		
		assertEquals("Sam", conductor.getNombre());
	}
	
	@Test
	public void testMatricula() {
		String matricula = "4ABC123";
		
		conductor.setMatricula(matricula);
		
		assertEquals(matricula, conductor.getMatricula());
	}
	
	@Test
	public void testModelo(){
		String modelo = "Opel Corsa";
		
		conductor.setModelo(modelo);
		
		assertEquals(modelo, conductor.getModelo());
	}

	@Test
	public void testValoracion(){
		int valoracion = 5;
		
		conductor.setValoracion(valoracion);
		
		assertEquals(valoracion, conductor.getValoracionMedia(), 0.001);
	}
	
	@Test
	public void testValoracion2(){
		int valoracion = 4;
		int valoracion2 = 3;
		conductor.setValoracion(valoracion);
		conductor.setValoracion(valoracion2);
		double media = 3.5;
		
		
		assertEquals(media, conductor.getValoracionMedia(), 0.001);
	}
	

	@Test
	public void testConductorOcupado(){
		
		assertTrue(conductor.isOcupado());
		
	}
	
	@Test
	public void testAsignacionConductor(){
		
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
		
		
		ArrayList<Conductor> poolConductores = new ArrayList<>();
		Conductor conductor = null;
		
		String[] nombres = {"Samantha"};
		for(String nombre: nombres){
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}
		
		String[] matricula = {"4ABC123"};
		String[] modelos = {"Chevy Malibu"};
	
		int index = 0;
		for(Conductor conductora: poolConductores){			
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			conductora.setValoracion((byte) 4);
			index++;
		}
		
		
		PoolConductores conductores = new PoolConductores(poolConductores);
		
				
		carrera.asignarConductor(conductores);
		
		
		assertEquals("Samantha" , carrera.getConductor().getNombre());
		assertEquals("4ABC123", carrera.getConductor().getMatricula());
		assertEquals("Chevy Malibu" , carrera.getConductor().getModelo());
	
	
	}
	
}
