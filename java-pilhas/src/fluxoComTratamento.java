
public class fluxoComTratamento {
	
	public static void main (String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();			
		} catch(ArithmeticException | NullPointerException error) {
			String msg = error.getMessage();
			System.out.println("Exception " + msg);
//			error.printStackTrace();
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
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
//			Conta c = null;
//			c.deposita();
		}
		System.out.println("Fim do método 2");
	}
}
