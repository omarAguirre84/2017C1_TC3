package tp1.ej4;

class StackInt{
	private int maximo; // Tamaño maximo de la pila se recibe por constructor
	private int[] pila;// arreglo de enteros
	private int tope; // tope de la pila equivale al indice del arreglo

	public StackInt(int maximo) {
		this.maximo = maximo;
		this.pila = new int[this.maximo]; // se crea el arreglo de maximo tamaño
	}

	public void push(int dato) { // primera version sin validar
		///
	}

	public int getTope() { // devuelve el tope de la pila
		return pila[tope];
	}

	public void push1(int dato) { // segunda version, captura error de pila
									// llena
		///
	}

	public void push2(int dato) throws ArrayIndexOutOfBoundsException {
		// tercera version, lanza exception si la pila esta llena
		//
	}

	public void push3(int dato) throws ArrayIndexOutOfBoundsException {
		//
	}

	public int pop() throws ArrayIndexOutOfBoundsException, ExcepcionDesbordamiento {
		return 0;
	}
}