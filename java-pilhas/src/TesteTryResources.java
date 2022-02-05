
public class TesteTryResources {

	public static void main(String[] args) {
	
		try (Conexao conect = new Conexao()) {
			conect.leDados();
		} catch (IllegalStateException ex) {
			System.out.println(ex.getMessage());
		}
		
		//--------------------------------------//
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println(ex.getMessage());
//		} finally {
//			System.out.println("Bloco do Finally!");
//			if(con != null) {				
//				con.fecha();
//			}
//		}
	}
}