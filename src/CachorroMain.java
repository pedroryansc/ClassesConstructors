public class CachorroMain {
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("Stanley", 15, "Vira-lata", 0.75f);
		
		/*
		cao.setNome("Stanley");
		cao.setPeso(15);
		cao.setRaca("Vira-lata");
		cao.setTamanho(0.75f);

		System.out.print(cao.getNome() + "\n"
						+ cao.getPeso() + "\n"
						+ cao.getRaca() + "\n"
						+ cao.getTamanho());
		*/
		
		// System.out.print(cao.toString());
		// ou
		System.out.print(cao);
	}
}