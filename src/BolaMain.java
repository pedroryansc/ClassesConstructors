public class BolaMain {
	public static void main(String[] args) {
		Bola b = new Bola();
		
		b.setTamanho(23.5f);
		b.setTipo("");
		
		System.out.print(b.getTamanho() + "\n"
						+ b.getTipo());
	}
}
