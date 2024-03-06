package Fila;

public class FilaDinamica2<N>{
	private Note<N> inicio;
	private Note<N> fim;
	private int tamanho;
	
	public FilaDinamica2(Note<N> inicio, Note<N> fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.tamanho = 0;
	}
	
	public FilaDinamica2() {
		
	}
	
	public void inserir(N note) {
		Note<N> nNote = new Note(note);
		
		if (inicio == null) {
			inicio = nNote;
		} else {
			fim.setProximo(nNote);
		}
		
		fim = nNote;
		tamanho ++;
	}
	
	
	public N remover() {
		if (inicio == null) {
			return null;
		}
		
		N infoRemovida = inicio.getNode();
		inicio = inicio.getProximo();
		
		if (inicio == null) {
			fim = null;
		}
		
		tamanho --;
		return infoRemovida;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public boolean vazia() {
		return tamanho == 0;
	}
	
	public void imprimir() {
		Note<N> cont = inicio;
		while (cont != null) {
			System.out.println(cont.getNode());
			cont = cont.getProximo();
		}
	}
	
}
