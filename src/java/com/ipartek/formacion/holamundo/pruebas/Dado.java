package com.ipartek.formacion.holamundo.pruebas;

/**
 * Clase Java para simular un dado y sacar un alumno de modo aleatorio
 * 
 * @author Curso
 *
 */

public class Dado {
	/*
	 * Variable para representar el numero de alumnos static: solo se reserva en
	 * memoria una vez final: No es modificable int: Tipo integer, numero entero
	 */
	public static final int NUMEROS_ALUMNOS = 15;

	public static final String NOMBRES_ALUMNOS[] = { "David Ibarzabal", "Oscar", "Gorka", "Ariane", "Gontzal", "Aitor",
			"Santi", "Raul", "David Ortiz", "Sergio", "David Barbudo", "Edorta", "Asier", "Alberto", "Iñigo"

	};

	/**
	 * Muestra por consola todos los alumnos del array
	 * <code>NOMBRES_ALUMNOS</code>.<br>
	 * ejemplo:
	 * <ul>
	 * <li>[0] David Ibarzabal</li>
	 * <li>[1] Oscar</li>
	 * <li>[x] ...</li>
	 * <li>[x] ...</li>
	 * <li>[14] Iñigo</li>
	 * </ul>
	 */
	
	//cambio para prueba de git
	
	
	public static void mostrarAlumnos() {

		System.out.println("NOMBRES ALUMNOS");
		for (int i = 0; i < NOMBRES_ALUMNOS.length; i++) {
			System.out.println("[" + i + "] " + NOMBRES_ALUMNOS[i]);

		}

	}

	/*
	 * Genera numero aleatorio entre 0 y <code>NUMERO_ALUMNOS</code>
	 * 
	 * @return numero entero, si falla -1
	 */
	public static int generarNumero() {
		int resul = -1;
		resul = (int) (Math.random() * NUMEROS_ALUMNOS);
		return resul;
	}
	
	/*
	 * Genera el nombre de un alumno dependiendo del numero aleatorio que le llegue a la funcion
	 * @return un string , en caso de fallo devuelve
	 */
	public static String mostrarAfortunado(){
		String nombre = "No hay alumno";
		int alumnoAfortunado = generarNumero();
	    nombre = NOMBRES_ALUMNOS[alumnoAfortunado];
		
		return nombre;
		
		
	}
	
	

	/*
	 * Genera el nombre de un alumno dependiendo del numero aleatorio que le llegue a la funcion
	 * @param Numero aleatorio <code>int</code>numero aleatorio q debe de estar dentro del rango 0 -( <code>NUMEROS_ALUMNOS</code>-1)
	 * @return un string , en caso de fallo devuelve
	 */
	public static String mostrarAfortunado(int numeroAleatorio){
		String nombre = "No hay alumno";
		
	    nombre = NOMBRES_ALUMNOS[numeroAleatorio];
		
		return nombre;
		
		
	}

	public static void main(String[] args) {
		mostrarAlumnos();
		int alumnoAfortunado = generarNumero();
		System.out.println("El afortunado en leer es: " + NOMBRES_ALUMNOS[alumnoAfortunado]);
		//System.out.println(mostrarAfortunado(alumnoAfortunado));
	}

}
