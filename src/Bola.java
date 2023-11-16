public class Bola {
	
	private float tamanho = 100;
	private String tipo = "Futebol";
	
	// Pela opção "Source -> Generate Getters and Setters":
	
	public float getTamanho() {
		return tamanho; // Pode ser colocado "this.", mas não é necessário, pois há apenas uma váriavel com o nome "tamanho"
	}
	public void setTamanho(float tamanho) {
		if(tamanho > 0)
			this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length() > 0)
			this.tipo = tipo;
	}
}