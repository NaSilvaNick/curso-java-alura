
public class TesteFinally {

	public static void main(String[] args) {
	
		Conexao con = null;
		
		try {
			
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			
			System.out.println(ex.getMessage());
		} finally {
			
//			con.fecha();
		}
	}
}