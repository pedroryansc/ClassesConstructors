public class Cachorro {
	
	private String nome;
	private float peso;
	private String raca;
	private float tamanho;
	
	// Construtor
	public Cachorro(String nome, int peso, String raca, float tamanho) {
		setNome(nome);
		setPeso(peso);
		setRaca(raca);
		setTamanho(tamanho);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		if(peso > 0)
			this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if(raca.length() > 0)
			this.raca = raca;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		if(tamanho > 0)
			this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [nome=");
		builder.append(nome);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", raca=");
		builder.append(raca);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append("]");
		return builder.toString();
	}
}