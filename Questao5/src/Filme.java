import java.util.ArrayList;

public class Filme {
	
	private String tituloOriginal;
	private String tituloPortugues;
	private String genero;
	private double duracao;
	private int faixaEtaria;
	private String paisOrigem;
	private ArrayList<Ator> listaAtores = new ArrayList<>();
	private String diretor;
	private TipoExibicao tipoExibicao;
	
	public Filme(String tituloOriginal, String tituloPortugues, String genero, double duracao, int faixaEtaria,
			String paisOrigem, ArrayList<Ator> listaAtores, String diretor, TipoExibicao tipoExibicao) {
		this.tituloOriginal = tituloOriginal;
		this.tituloPortugues = tituloPortugues;
		this.genero = genero;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
		this.paisOrigem = paisOrigem;
		this.listaAtores = listaAtores;
		this.diretor = diretor;
		this.tipoExibicao = tipoExibicao;
	}
	
	public void adicionarAtor(Ator ator) {
		listaAtores.add(ator);		
	}
	
	public void listarAtores() {
		for (Ator ator : listaAtores) {
			System.out.println("Nome: " + ator.getNome());
			System.out.println("Nacionalidade: " + ator.getNacionalidade());
		}
	}
	
	public void reproduzir() {
		System.out.println("Reproduzir Filme");
	}
	
	public void paraReproducao() {
		System.out.println("Para de Reproduzir Filme");
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloPortugues() {
		return tituloPortugues;
	}

	public void setTituloPortugues(String tituloPortugues) {
		this.tituloPortugues = tituloPortugues;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public ArrayList<Ator> getListaAtores() {
		return listaAtores;
	}

	public void setListaAtores(ArrayList<Ator> listaAtores) {
		this.listaAtores = listaAtores;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public TipoExibicao getTipoExibicao() {
		return tipoExibicao;
	}

	public void setTipoExibicao(TipoExibicao tipoExibicao) {
		this.tipoExibicao = tipoExibicao;
	}
		
}
