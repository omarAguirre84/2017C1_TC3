package tc3.horarioDeClases;

public class HorarioDeClases {
	private static Curso curso;
	
	public static void main(String args[]) {
		curso = new Curso(2, 1, 'C');
		cargarDatos();
		System.out.println(curso.getNombre());
		curso.mostrarHorario();
		System.out.println(curso.addProfesor("pepe"));
		System.out.println(curso.addProfesor("pepe"));
	}
	
	private static void cargarDatos() {
		
	}
}