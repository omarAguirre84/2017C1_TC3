package tp0.horarioDeClases;

public class HorarioDeClases {
	private static Curso curso;
	
	public static void main(String args[]) {
		
		cargarDatos();
		System.out.println(curso.getNombre());
		curso.mostrarHorario();
		curso.mostrarDia(3);
		
	}
	
	private static void cargarDatos() {
		curso = new Curso(2, 1, 'C');
		curso.addMateria("PO", "Prog orientada a obj");
		curso.addMateria("T3", "Taller 3");
		curso.addMateria("MN", "Modelo");
		curso.addMateria("ET", "Etica");
		curso.addMateria("DB", "Bases de datos");
		curso.addMateria("TD", "Tecnicas de almac");
		
		curso.addProfesor("pepe1");
		curso.addProfesor("pepe2");
		curso.addProfesor("pepe3");
		curso.addProfesor("pepe4");
		curso.addProfesor("pepe5");
		curso.addProfesor("pepe6");
		
		curso.addBloque(DiaClase.LUNES, HoraClase.PRIMERA, HoraClase.TERCERA, "PO", "pepe1");
		curso.addBloque(DiaClase.LUNES, HoraClase.CUARTA, HoraClase.SEXTA, "T3", "pepe2");
		
		curso.addBloque(DiaClase.MARTES, HoraClase.PRIMERA, HoraClase.TERCERA, "MN", "pepe3");
		curso.addBloque(DiaClase.MARTES, HoraClase.CUARTA, HoraClase.SEXTA, "ET", "pepe4");
		
		curso.addBloque(DiaClase.MIERCOLES, HoraClase.PRIMERA, HoraClase.SEXTA, "PO", "pepe1");
		
		curso.addBloque(DiaClase.JUEVES, HoraClase.PRIMERA, HoraClase.CUARTA, "DB", "pepe5");
		curso.addBloque(DiaClase.JUEVES, HoraClase.QUINTA, HoraClase.SEXTA, "TD", "pepe6");
	}
}

