package tp1.ej4;

public class Test {
	private static StackInt stack = new StackInt(5);
	
	public static void main(String[] args) {
//		System.out.println("tope: "+stack.getTope());
		loadStack();
		stack.mostrarPila();
	}
	
	public static void loadStack(){
		int[] p = new int[6];
		
		for(int i=0; i < p.length; i++){
			double dato1 = Math.random()*100;
			int dato2 = (int)dato1;
			stack.push(dato2);
		}
	}
}
