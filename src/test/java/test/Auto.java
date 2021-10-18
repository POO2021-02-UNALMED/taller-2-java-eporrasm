package test;
public class Auto {
	String modelo;
	int precio;
	Array[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cont = 0;
		for (elemento : asientos) {
			if (elemento instanceof Asiento) {
				cont ++;
			}
		return cont;
		}
		
	public String verificarIntegridad() {
		for (elemento : asientos) {
			if (elemento instanceof Asiento) {
				if (! (registro == motor.registro && motor.registro == elemento.registro)) {
					return "Las piezas no son originales"
				}
		return "Auto original"
				}
			}
	}
	}
}
