package Pilha;

public class Note<N> {

	private N node;
	private Note<N> proximo;
	
	public Note(N node) {
		this.node = node;
		this.proximo = null;
	}
	
	public Note<N> getProximo() {
		return proximo;
	}
	public void setProximo(Note<N> proximo) {
		this.proximo = proximo;
	}
	public N getNode() {
		return node;
	}
	
}
