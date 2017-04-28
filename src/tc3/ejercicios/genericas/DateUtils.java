package tc3.ejercicios.genericas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

	
	/**
	 * Transforma el string en un objeto tipo Date.
	 * El formato de la fecha debe ser "dd-MM-yyyy" (d�a-mes-a�o)
	 * @param strFecha - (String) Fecha a convertir
	 *
	 * 
	 * @return Date or null
	 */
	public static Date crearFechaDesdeString(String strFecha) {
        return crearFechaDesdeString(strFecha, "dd-MM-yyyy");
	}
	
	/**
	 * Transforma el string en un objeto tipo Date.
	 * El formato de la fecha debe ser "dd-MM-yyyy" (d�a-mes-a�o)
	 * 
	 * @param strFecha - (String) Fecha a convertir
	 * @param mascara - (String) M�scara a aplicar para convertir la fecha
	 * 
	 * @return Date or null
	 */
	public static Date crearFechaDesdeString(String strFecha, String mascara) {
		Date fecha;
        try {
            fecha = new SimpleDateFormat(mascara).parse(strFecha);
        } catch (Exception ex) {
        	fecha = null;
        }
        return fecha;
	}
	
	/**
	 * Obtiene la edad de una persona a partir de un string.
	 * El formato de la fecha debe ser "dd-MM-yyyy" (d�a-mes-a�o)
	 * 
	 * @param strFecha - (String) Fecha a convertir
	 * 
	 * @return int
	 */
	public static int getEdad(String strFecha){
		// Transformamos el string de la fecha en un objeto Date
		// NO deber�a dar error porque la carga de la fecha en Socio
		// est� validada
		Date fechaNac=crearFechaDesdeString(strFecha);
		// Creamos los objetos Calendar para calcular la edad
		Calendar fechaNacimiento = Calendar.getInstance();
		Calendar fechaActual = Calendar.getInstance();
		// Cargamos la fecha de nacimiento
		fechaNacimiento.setTime(fechaNac);
		// Restamos entre fechas
		int anio = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
		int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
		int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
		// Se ajusta el a�o si el d�a en lo que va del a�o
	    // es menor al de la fecha de nacimiento
		if(mes<0 || (mes==0 && dia<0)) {
			anio--;
	    }
		// Regresa la edad en base a la fecha de nacimiento
		return anio;
	}
}