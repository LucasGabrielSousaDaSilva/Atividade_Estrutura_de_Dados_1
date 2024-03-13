package Pilha;

import Fila.Note;

public class PilhaDinamica<N> {
	private Note<N> topo;
	private int tamanho;
	
	public PilhaDinamica(Note<N> topo, int tamanho) {
		super();
		this.topo = topo;
		this.tamanho = tamanho;
	}

	public PilhaDinamica() {
	}
	
	public void push(N note) {
		Note<N> nNote = new Note(note);
		
		if (topo == null) {
			topo = nNote;
		}else {
			topo.setProximo(nNote);
		}
		
		tamanho ++;
	}
	
	public N pop() {
		if (topo == null) {
			return null;
		}
		N infoRemovida = topo.getNode();
		topo = topo.getProximo();
		
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
		Note<N> cont = topo;
		while (cont != null) {
			System.out.println(cont.getNode());
			cont = cont.getProximo();
		}
	}
	
}
