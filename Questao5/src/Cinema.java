
public class Cinema {
	
	private int identificacaoUnica;
	private String nomeFantasia;
	private String cidade;
	private String bairro;
	private String rua;
	private int capacidadeLotacao;
	private int qtdSalasTotal;
	private int qtdSalasDisponiveis;
	private String telefone;
			
	public Cinema(int identificacaoUnica, String nomeFantasia, String cidade, String bairro, String rua,
			int capacidadeLotacao, int qtdSalasTotal, int qtdSalasDisponiveis, String telefone) {
		this.identificacaoUnica = identificacaoUnica;
		this.nomeFantasia = nomeFantasia;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.capacidadeLotacao = capacidadeLotacao;
		this.qtdSalasTotal = qtdSalasTotal;
		this.qtdSalasDisponiveis = qtdSalasDisponiveis;
		this.telefone = telefone;
	}

	public void	abrir() {
		System.out.println("Abrir Cinema");
	}
	
	public void	fechar() {
		System.out.println("Fechar Cinema");
	}
	
	public void	anunciarFilme(Filme filme) {
		System.out.println("Estreia de " + filme);
	}

	public int getIdentificacaoUnica() {
		return identificacaoUnica;
	}

	public void setIdentificacaoUnica(int identificacaoUnica) {
		this.identificacaoUnica = identificacaoUnica;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getCapacidadeLotacao() {
		return capacidadeLotacao;
	}

	public void setCapacidadeLotacao(int capacidadeLotacao) {
		this.capacidadeLotacao = capacidadeLotacao;
	}

	public int getQtdSalasTotal() {
		return qtdSalasTotal;
	}

	public void setQtdSalasTotal(int qtdSalasTotal) {
		this.qtdSalasTotal = qtdSalasTotal;
	}

	public int getQtdSalasDisponiveis() {
		return qtdSalasDisponiveis;
	}

	public void setQtdSalasDisponiveis(int qtdSalasDisponiveis) {
		this.qtdSalasDisponiveis = qtdSalasDisponiveis;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
		
}
