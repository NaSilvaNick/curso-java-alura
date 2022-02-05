
public class fluxo {
	
	public static void main (String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();			
		} catch(Exception error) {
			String msg = error.getMessage();
			System.out.println("Exception " + msg);
			error.printStackTrace();
		}
		
		System.out.println("Fim do Main");
	}
	
	private static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}
	
	private static void metodo2() throws MinhaExcecao{
		System.out.println("Inicio do método 2");
		
		throw new MinhaExcecao("Deu ruin filhão!");
		
//		System.out.println("Fim do método 2");
	}
}
