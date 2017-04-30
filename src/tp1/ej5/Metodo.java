package tp1.ej5;

import java.io.FileWriter;
import java.io.IOException;

public class Metodo {

	public void methodWithThrow() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException ex) {
			System.out.println("Se captura aca la excepcion NullPointerException");
			throw ex;
		}

	}

	public void metodoChecked() throws IOException{
		FileWriter f = new FileWriter("abc.txt");
		f.write(314);
		f.close();
	}
	public void metodoChecked2(){
		try {
			FileWriter f = new FileWriter("abc.txt");
			f.write(314);
			f.close();
		} catch (IOException e) {
			System.out.println(e);
			
		}
	}

	public void metodoUnchecked() {
		Integer[] arr = new Integer[5];
		System.out.println(arr[5]);
		throw new ArrayIndexOutOfBoundsException();
	}
}
