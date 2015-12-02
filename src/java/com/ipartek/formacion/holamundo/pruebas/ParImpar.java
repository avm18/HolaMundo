package com.ipartek.formacion.holamundo.pruebas;

import com.ipartek.formacion.holamundo.pojo.Alumno;

public class ParImpar {
	//cambio tonto para probar git
	public static void main(String[] args) {
		System.out.println("Primer Ejercicio");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " es par");
			} else {
				System.out.println(i + " es impar");
			}

		}
		System.out.println("Fin del ejercio");

		Alumno a1 = new Alumno("Manolo");
		Alumno a2 = new Alumno("Manolita");
		Alumno a3 = new Alumno("Heufrasio");

		System.out.println(a1.toString());
		System.out.println(a1.getNombre() + " despues de cambiar de nombre y apellidos ");

		a1.setNombre("Manoli");
		a1.setApellidos("Liviston");

		System.out.println(a1.toString());

	}

}
