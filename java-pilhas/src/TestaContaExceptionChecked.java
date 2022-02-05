
public class TestaContaExceptionChecked {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		try {
			
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("Olha a merda ai, seu coco...");
		}
		
	}
}
