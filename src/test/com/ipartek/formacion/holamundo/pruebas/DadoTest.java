package com.ipartek.formacion.holamundo.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class DadoTest {

	@Test
	public void testGenerarNumero() {
		int numAle = -1;
		for (int i = 0; i < 1000; i++) {
			
			numAle = Dado.generarNumero();
			assertTrue(numAle >= 0 && numAle < Dado.NUMEROS_ALUMNOS);
		}
		
		
	}

}
