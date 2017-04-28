package tp0.horarioDeClases;

public class Hora {
	private String codMateria;
	private String profesor;
	/**
	 * @param codMateria
	 * @param codProfesor
	 */
	public Hora(String codigo, String nombre) {
		this.codMateria = codigo;
		this.profesor = nombre;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public String getCodigo() {
		return codMateria;
	}
	@Override
	public String toString() {
		return "Hora [codMateria=" + codMateria + ", profesor=" + profesor + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (codMateria == null) {
			if (other.codMateria != null)
				return false;
		} else if (!codMateria.equals(other.codMateria))
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		return true;
	}

}
