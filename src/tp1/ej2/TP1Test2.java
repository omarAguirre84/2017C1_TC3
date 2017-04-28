package tp1.ej2;

public class TP1Test2 {
	static int cont =0;
	
	public static void main(String[] args) {
		
//		Empleado emp1 = new Empleado("Jose", 17);
//		Empleado emp2 = new Empleado("Pedro", 66);
//		Empleado emp3 = new Empleado("Pedro", 40);
//		Empleado emp4 = new Empleado(null, 20);
		Empleado emp1 = crear("Jose", 17);
		Empleado emp2 = crear("Pedro", 66);
		Empleado emp3 = crear("Pedro", 40);
		Empleado emp4 = crear(null, 20);
	}

	public static Empleado crear(String name, int age) {
		Empleado emp = null;
		try {
			emp = new Empleado(name,age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return emp;
	}
}
