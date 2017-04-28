package tp1.ej2;

public class Empleado {
	private final String nombre;
	private final int edad;
	private static final int Edad_Minima = 18;
	private static final int Edad_Maxima = 65;

	public Empleado(String nombre, int edad){
		if ((edad >= Edad_Minima && edad <= Edad_Maxima) && (nombre != null)) {
			this.edad = edad;
			this.nombre = nombre;
			System.out.println("creado " + this.toString());
		} else {
			throw new IllegalArgumentException("No creado");
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
