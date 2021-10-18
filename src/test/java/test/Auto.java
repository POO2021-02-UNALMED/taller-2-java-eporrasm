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
		return asientos.length;
		}
		
	public String verificarIntegridad() {
		for (Asiento elemento : asientos) {
				if (! (registro == motor.registro && motor.registro == elemento.registro)) {
					return "Las piezas no son originales";
					return "Auto original";
				}
		}
	}
}

