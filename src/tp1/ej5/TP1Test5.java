package tp1.ej5;

public class TP1Test5 {

	public static void main(String[] args) {
		Metodo m = new Metodo();

		m.methodWithThrow();	
		
		m.metodoChecked2();
		m.metodoUnchecked();
		
		try {
			m.metodoChecked();
		} catch (Exception e) {
			System.out.println("capturado en el main " + e);
		}
	}

}
