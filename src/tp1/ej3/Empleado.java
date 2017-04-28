package tp1.ej3;

public class Empleado {
	private final String nombre;
	private final int edad;
	private static final int Edad_Minima = 18;
	private static final int Edad_Maxima = 65;

	public Empleado(String nombre, int edad) throws RangoEdadInvalidException, IllegalArgumentException{
		if (nombre != null) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("Nombre es null");
		}
		
		if (edad < Edad_Minima) {
			throw new RangoEdadInvalidException(nombre + " es menor edad.");
		}else if(edad > Edad_Maxima){
			throw new RangoEdadInvalidException(nombre + " es jubilado.");
		}else{
			this.edad = edad;
			System.out.println("creado "+this.toString());
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
