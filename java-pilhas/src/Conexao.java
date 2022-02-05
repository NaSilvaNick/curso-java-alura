
public class Conexao implements AutoCloseable{

	public Conexao() {
        System.out.println("Abrindo conexao");
//        throw new IllegalStateException("Problemas com a conexão!");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
            throw new IllegalStateException("Problemas com a conexão!");
    }

	@Override
	public void close(){
		System.out.println("Fechando conexao");
	}
}