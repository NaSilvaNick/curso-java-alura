
public class TesteContas {

	public static void main(String[] args) {
					
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(300.0);
		System.out.println(c.getSaldo());
		
		try {			
			c.saca(350);
		} catch(SaldoInsuficienteException ex) {
			String message = ex.getMessage();
			System.out.println(message);
		}
		
		
		
		System.out.println("Esse é o saldo final: " + c.getSaldo());
	}

}
