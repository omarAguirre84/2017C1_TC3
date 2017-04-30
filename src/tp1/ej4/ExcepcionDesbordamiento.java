package tp1.ej4;

@SuppressWarnings("serial")
public class ExcepcionDesbordamiento extends Exception{

	public ExcepcionDesbordamiento(String msg){
		super(msg);
	}
	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}
	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}
	
}
