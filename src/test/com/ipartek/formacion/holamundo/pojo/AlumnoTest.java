package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
		
		Alumno a = new Alumno();
		assertTrue("No coincide nombre",Alumno.NOMBRE_ANONIMO.equals(a.getNombre() ) ) ;
		assertTrue("El apellido debe ser vacio", "".equals( a.getApellidos() ));
		assertTrue("El becado debe ser falso" , a.isBecado() == false);
		assertTrue("La edad debe ser 0" ,a.getEdad() == 0 );
		assertTrue("El sexo debe ser indefinido", a.getSexo() == a.SEXO_INDEFINIDO );
		
	}

	@Ignore
	public void testAlumnoString() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
	}

}
