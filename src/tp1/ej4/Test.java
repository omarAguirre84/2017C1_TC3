package tp1.ej4;

public class Test {
	private static StackInt stack = new StackInt(5);
	
	public static void main(String[] args) {
//		System.out.println("tope: "+stack.getTope());
		loadStack();
		stack.mostrarPila();
		try {
			System.out.println("tope "+stack.getTope());
			System.out.println("pop "+stack.pop());
			System.out.println("pop "+stack.pop());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		stack.mostrarPila();
		System.out.println("tope "+stack.getTope());
	}
	
	public static void loadStack(){
		int[] p = new int[6];
		
		for(int i=0; i < p.length; i++){
			double dato1 = Math.random()*100;
			int dato2 = (int)dato1;
			try {
				stack.push2(dato2);
			} catch (Exception e) {
				System.out.println(e.getMessage()+" goo");
			}
			
		}
	}
}
