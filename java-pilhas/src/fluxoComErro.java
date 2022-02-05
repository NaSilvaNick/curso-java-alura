
public class fluxoComErro {
	
	public static void main (String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();			
		} catch(ArithmeticException | NullPointerException | StackOverflowError error) {
			String msg = error.getMessage();
			System.out.println("Exception " + msg);
			error.printStackTrace();
		}
		
		System.out.println("Fim do Main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio do método 2");
		
		metodo2();
			
		System.out.println("Fim do método 2");
	}
}
