import java.util.ArrayList;

public class Sessao {

	private ArrayList<Filme> filmeCartaz = new ArrayList<>();
	private double horarios;
	
	public void listaFilmesSessao() {
		for (Filme filme : filmeCartaz) {
			System.out.println("filmw:" + filme.getTituloPortugues());
		}		
	}
	
	public void registrarPublico() {
		
	}
}
