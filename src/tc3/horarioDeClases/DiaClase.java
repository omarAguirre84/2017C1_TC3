package tc3.horarioDeClases;
/*
 * Ejemplo de enumerado con atributos.
 * Esto viene muy bien, por ejemplo, para llenar "combos"
 * u otros elementos de pantalla donde se muestren
 * pares de datos "clave-valor".
 * N�tese la estructura "de clase", con un constructor privado
 * y un m�todo "getC�digo" para obtener el c�digo
 * (el nombre se obtiene directamente o a trav�s de ".name()")
 * */
public enum DiaClase {
	LUNES("LU"), MARTES("MA"), MIERCOLES("MI"), JUEVES("JU");
	private String codigo;
	
	private DiaClase(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo() {
		return this.codigo;
	}
	public String toDisplay() {
		return this.codigo + "-" + this;
	}
}
