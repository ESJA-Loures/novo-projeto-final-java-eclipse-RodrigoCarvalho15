import java.util.ArrayList;

public class Videoteca {
	private String nome = "Os meus filmes";
	private ArrayList<Filme> filmes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public int totalFilmes() {
		return filmes.size();
	}

	public void listarFilmes() {
		// mostra o nome da videoteca
		System.out.println("=== " + ("Os meus filmes") + " ===");
		// Testa primeiro se a videoteca tem filmes
		if(filmes.isEmpty()) {
			System.out.println("A videoteca está vazia!");
		} else {
			for (int i = 0; i < filmes.size(); i++) {
				System.out.println((i + 1) + ". " + filmes.get(i));
			}
		}
		System.out.println("======");
	}
	
	
	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
		// Completa o método para adicionar o filme
	}

	public void apagarFilme(int numero) {
		filmes.remove(numero - 1);
		// Completa o método para apagar o filme
	}
	
	public void editarFilme(int numero, String novoTitulo, int novoAno) {
		// Falta acrescentar o atributo ano
		filmes.get(numero - 1).setFilme(novoTitulo, novoAno);
		
		
	}
}
