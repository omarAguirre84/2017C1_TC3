package tc3.horarioDeClases;

import java.util.ArrayList;
import java.util.Iterator;

public class Curso {
	private int anio;
	private int cuatrimestre;
	private char cursada;
	private ArrayList<Materia> materias;
	private ArrayList<String> profesores;
	private Hora horario[][];

	public Curso(int anio, int cuatrimestre, char cursada) {
	// Debe inicializar correctamente todos sus atributos
	// independientemente de los parametros que recibe.
	// Pensar bien como se va a inicializar la matriz de horario.
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
		this.cursada = cursada;
		this.materias = new ArrayList<Materia>();
		this.profesores = new ArrayList<String>();
		this.horario = new Hora[DiaClase.values().length][HoraClase.values().length];
	}

	public String getNombre() {
		return String.format("%sº%sº%s", Integer.toString(this.anio, 10), this.cuatrimestre, this.cursada);
	}

	public boolean addProfesor(String nombre) {
		// Debe verificar que el profesor a agregar no exista,
		// solo entonces debe agregarlo.
		// Devuelve si pudo o no agregar un nuevo profesor.
		
		boolean res = false;
		
		if (this.buscarProfesor(nombre) == -1) { //CONTAINS SOLO RECIBE OBJETOS
			profesores.add(nombre);
			res=true;
		}
		return res;
	}

	private int buscarProfesor(String nombre) {
		// Busca el nombre pasado por parametro en la lista.
		// Devuelve -1 si no lo encuentra.
		int p = profesores.size()-1;
		while (p > -1 && !profesores.get(p).equals(nombre)) {
			p--;
		}
		return p;
	}

	public void listarProfesores() {
		// Lista todos los profesores cargados.
		for (String prof : profesores){
			System.out.println(prof);
		}
	}

	public boolean addMateria(String codigo, String nombre) {
		// Debe verificar que la materia a agregar no exista
		// (buscandola por codigo) y sï¿½lo entonces debe agregarlo.
		// Devuelve si pudo o no agregar una nueva materia.
		boolean res = false;
		
		if (this.buscarMateria(codigo) == -1) { //CONTAINS SOLO RECIBE OBJETOS
			Materia mat = new Materia(codigo, nombre);
			materias.add(mat);
			res=true;
		}
		return false;
	}

	private int buscarMateria(String codigo) {
		// Busca la materia el codigo pasado por parametro.
		// Devuelve -1 si no la encuentra.
		int p = materias.size()-1;
		while (p > -1 && !materias.get(p).getCodigo().equals(codigo)) {
			p--;
		}
		
		return p;
	}

	public void listarMaterias() {
		Iterator<Materia> itMat = materias.iterator();
		Materia aux;
		
		while (itMat.hasNext()) {
			aux = itMat.next();
			System.out.println(aux.toString());
		}
	}

	public void listarDiasClase() {
		for (int d = 0; d < DiaClase.values().length; d++) {
			System.out.println(DiaClase.values()[d].toDisplay());
		}
	}
	
	private boolean bloqueLibre(DiaClase dia, HoraClase horaComienzo, HoraClase horaFin) {
		boolean isOK = false;
		int numdia = dia.ordinal();
		int hc = horaComienzo.ordinal();
		int hf = horaFin.ordinal();
		int ht = HoraClase.values().length;
		if (hc >= 0 && hc < ht) {
			if (hf > hc && hf < ht) {
				int h=hc;
				while( h <= hf && horario[numdia][h] == null) {
					h++;
				}
				isOK = h > hf;
			}
		}
		return isOK;
	}
	
	public boolean addBloque(DiaClase dia, HoraClase horaComienzo, HoraClase horaFin, String codMat, String profesor) {
		boolean pude = false;
		if (bloqueLibre(dia, horaComienzo, horaFin) && buscarMateria(codMat) != -1 && buscarProfesor(profesor)!= -1) {
			for (int hora=horaComienzo.ordinal(); hora <= horaFin.ordinal(); hora++) {
				cargarHora(dia, hora, codMat, profesor);
			}
			pude = true;
		}
		return pude;
	}

	public boolean cargarHora(DiaClase dia, int hora, String codMateria, String profesor) {
		boolean pude = false;
		int numdia = dia.ordinal();
		int h = hora;
		if (horario[numdia][h] == null) {
			horario[numdia][h] = new Hora(codMateria, profesor);
			pude = true;
		}
		return pude;
	}
	// Aqui se procesa la misma informacion que en la rutina superior
	// pero aplicando *Corte de Control* para mostrar las horas
	// agrupadas por materia.
	public void mostrarHorario() {
		// Mostrar los datos de la matriz
		// recorriendola por dia de la semana.
		// Debe mostrarse en formato, por ejemplo
		// LU-LUNES
		// 1-3 : T3 - Taller 3
		// 4-6 : PO - Programacion Orientada a Objetos
		// (usar la mostrarDia para hacer esta parte)
		System.out.println(horario.length);
		System.out.println(horario[0][0].getProfesor());
		System.out.println(horario[0].length);
		for(int i=0; i < horario.length; i++){
			for (int j = 0; j < horario[i].length; j++) {
				//System.out.println(horario[i].getClass());
				
			}
		}
	}
	
	public void mostrarDia(int dia) {
		// Debe mostrar por pantalla, dinamicamente,
		// las materias del dia, agrupando por materia
		// Ejemplo:
		// 1-3 : T3 - Taller 3
		// 4-6 : PO - Programacion Orientada a Objetos
		// Investigar, si no se conoce, tecnica de
		// "corte de control"
		
	}

	private boolean sonLaMisma(Hora hora1, Hora hora2) {
		// Devuelve true o false comparando los valores
		// de hora1 y hora2.
		boolean res;
		if(hora1.equals(null) || hora2.equals(null)){
			res = hora1 == hora2;
		}else{
			res = hora1.equals(hora2);
		}
		return res;
	}
}