package test;

import java.lang.reflect.Array;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i<asientos.length; i++) {
			if (asientos[i] != null);
			cont ++;
		}
		}
		
	public String verificarIntegridad() {
		for (int i = 0; i<asientos.length; i++) {
				if (asientos[i] != null && !(registro == motor.registro && motor.registro == asientos[i].registro)) {
					return "Las piezas no son originales";
				}
		}
		return "Auto original";
	}
}

