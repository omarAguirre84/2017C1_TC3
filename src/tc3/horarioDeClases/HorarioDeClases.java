package tc3.horarioDeClases;

public class HorarioDeClases {
	private static Curso curso;
	
	public static void main(String args[]) {
		
		cargarDatos();
		System.out.println(curso.getNombre());
//		curso.listarProfesores();
//		curso.listarDiasClase();
//		curso.listarMaterias();
		curso.mostrarDia(1);
	}
	
	private static void cargarDatos() {
		curso = new Curso(2, 1, 'C');
		
		curso.addMateria("PO", "Prog Obj Oriented");
		curso.addMateria("BD", "Bases de datos");
		curso.addMateria("MN", "Modelo estrategico de negocios");
		curso.addMateria("TD", "Tecnica de almacenamiento de datos");
		curso.addMateria("T3", "Taller 3");
		curso.addMateria("ET", "Etica de deontologia");
		curso.addMateria("SO", "Sistemas operativos");
		
		curso.addProfesor("pepe1");curso.addProfesor("pepe2");curso.addProfesor("pepe3");
		curso.addProfesor("pepe4");curso.addProfesor("pepe5");curso.addProfesor("pepe6");
		curso.addProfesor("pepe7");
		
		curso.addBloque(DiaClase.LUNES, HoraClase.PRIMERA, HoraClase.SEGUNDA, "BD", "pepe1");
		curso.addBloque(DiaClase.LUNES, HoraClase.TERCERA, HoraClase.SEXTA, "MN", "pepe2");
		curso.addBloque(DiaClase.MARTES, HoraClase.PRIMERA, HoraClase.SEXTA, "PO", "pepe3");
		curso.addBloque(DiaClase.MIERCOLES, HoraClase.PRIMERA, HoraClase.CUARTA, "TD", "pepe4");
		curso.addBloque(DiaClase.MIERCOLES, HoraClase.QUINTA, HoraClase.SEXTA, "BD", "pepe1");
		curso.addBloque(DiaClase.JUEVES, HoraClase.PRIMERA, HoraClase.CUARTA, "T3", "pepe5");
		curso.addBloque(DiaClase.JUEVES, HoraClase.QUINTA, HoraClase.SEXTA, "ET", "pepe6");
	}
}