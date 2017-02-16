package org.foobarspam.cotxox.testing;

import org.foobarspam.cotxox.conductores.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConductorTest {

	@Test
	public void testNombre() {
		Conductor conductor = new Conductor("Sam");
		
		assertEquals("Sam", conductor.getNombre());
	}
	
	@Test
	public void testMatricula() {
		Conductor conductor = new Conductor("Sam");
		String matricula = "4ABC123";
		
		conductor.setMatricula(matricula);
		
		assertEquals(matricula, conductor.getMatricula());
	}

}
