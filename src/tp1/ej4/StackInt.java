package tp1.ej4;

class StackInt {
	private int maximo; // tamaño máximo de la pila se recibe por constructor
	private Integer[] pila; // la pila de enteros
	private Integer tope; // número de elementos actualmente en la pila

	public StackInt(int maximo) {
		this.maximo = maximo;
		this.pila = new Integer[this.maximo]; // se crea el arreglo de maximo
												// tamaño
		this.tope = this.actualizarTope();
	}

	// primera version sin validar
	public void push(int dato) {
		int i = 0;
		boolean done = false;

		do {
			if (pila[i] == null) {
				pila[i] = dato;
				done = true;
			}
			if (i == maximo - 1 && done == false) {
				done = true;
				System.out.println("no hay lugar para: " + dato);
			}
			i++;
		} while (!done);
	}

	// segunda version, captura error de pila llena
	public void push1(int dato) throws ExcepcionDesbordamiento {
		int i = 0;
		boolean done = false;

		do {
			if (pila[i] == null) {
				pila[i] = dato;
				done = true;
			}
			if (i == maximo - 1 && done == false) {
				done = true;
				throw new ExcepcionDesbordamiento("No hay lugar para: " + dato);
			}
			i++;
		} while (!done);
	}

	// tercera version, lanza exception si la pila esta llena
	public void push2(int dato) throws ArrayIndexOutOfBoundsException {
		int i = 0;
		boolean done = false;

		do {
			if (pila[i] == null) {
				pila[i] = dato;
				done = true;
			}
			if (i == maximo - 1 && done == false) {
				done = true;
				throw new ArrayIndexOutOfBoundsException("Array lleno: " + dato);
			}
			i++;
		} while (!done);
	}

	public void push3(int dato) throws ArrayIndexOutOfBoundsException {
		//
	}

	public Integer pop() throws ArrayIndexOutOfBoundsException, ExcepcionDesbordamiento {
		/**
		 * @throws ExcepcionDesbordamiento
		 *             se lanza cuando se produzca [...] condición
		 */
		this.tope = actualizarTope();
		Integer dato = pila[this.tope];
		
		if(dato != null){
			pila[tope]=null;
		}
		
		return dato;
	}

	public Integer getTope() { // devuelve el tope de la pila
		this.tope = this.actualizarTope();
		return pila[tope];
	}

	public void mostrarPila() {
		for (int i = pila.length - 1; i >= 0; i--) {
			System.out.println("[" + i + "]" + " " + pila[i]);
		}
	}

	private Integer actualizarTope() {
		int i = 0;
		int res = 0;
		boolean found = false;

		while (!found) {
			if (pila[i] == null) { // the current position is available
				res = i;
				found = true;
			}
			if (i != 0 && found == true) {
				// if the current position is available and
				// it is the second or onwards position available
				res = i - 1;
			}
			if (i == maximo - 1 && found != true) { // if there is no more place
													// available
				res = maximo - 1;
				found = true;
			}
			i++;
		}
		this.tope = res;
		return res;
	}
}