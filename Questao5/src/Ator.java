public class Ator {
	
	private int numeroIdentificacao;
	private String nome;
	private String nacionalidade;
	private int idade;
	
	public Ator(int numeroIdentificacao, String nome, String nacionalidade, int idade) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}
	
	public void receberCache() {
		System.out.println("Receber chache por atuação");
	}
	
	public void atuar() {
		System.out.println("Atuar");
	}

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
		
}
