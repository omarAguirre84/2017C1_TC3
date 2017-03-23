package tc3.horarioDeClases;

public class HorarioDeClases {
	private static Curso curso;
	
	public static void main(String args[]) {
		
		cargarDatos();
		System.out.println(curso.getNombre());
		curso.mostrarHorario();
		System.out.println(curso.addProfesor("pepe"));
		System.out.println(curso.addProfesor("pepe"));
		curso.mostrarDia(3);
		
	}
	
	private static void cargarDatos() {
		curso = new Curso(2, 1, 'C');
		curso.addMateria("POO", "POOOOO");
	}
}