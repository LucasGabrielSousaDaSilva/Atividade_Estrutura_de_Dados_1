package listaencadeada;

public class ListaEncadeada {

	private No inicio;
	private No fim;
	private int posicao;
	
	public ListaEncadeada(No inicio, No fim) {
		this.inicio = inicio;
		this.fim = fim;
		this.posicao = 0;
	}

	public ListaEncadeada() {
	}
	
	public void inserirInicio(int elemento) {
		No novo = new No(elemento);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			inicio.setProximo(novo);
		}
		
		posicao++;
	}
	
	public void inserirFim(int elemento) {
		No novo = new No(elemento);
		
		if (inicio == null) {
			fim = novo;
		} else {
			fim.setProximo(novo);
		}
		
		posicao++;
	}
	
	public void inserirMeio(int elemento) {
			inserirInicio(elemento);
	}
	
	public int removerInicio() {
		if (inicio == null) {
            return -1; // Lista vazia
        }
        int dadoRemovido = inicio.getElemento();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        posicao--;
        return dadoRemovido;
	}
	
	public int removerFim() {
	    if (inicio == null) {
	        return -1; // Lista vazia
	    }
	    int dadoRemovido;
	    if (inicio == fim) {
	        dadoRemovido = inicio.getElemento();
	        inicio = null;
	        fim = null;
	    } else {
	        No atual = inicio;
	        while (atual.getProximo() != fim) {
	            atual = atual.getProximo();
	        }
	        dadoRemovido = fim.getElemento();
	        atual.setProximo(null);
	        fim = atual;
	    }
	    posicao--;
	    return dadoRemovido;
	}
	
	public int removerMeio(int elemento) {
        if (inicio == null) {
            return -1; // Lista vazia
        }
        if (inicio.getElemento() == elemento) {
            return removerInicio();
        }
        No atual = inicio;
        while (atual.getProximo() != null && atual.getElemento() != elemento) {
            atual.setProximo(atual);
        }
        if (atual.getProximo() == null) {
            return -1; // Elemento não encontrado
        }
        int dadoRemovido = atual.getProximo().getElemento();
        atual.setProximo(atual.getProximo().getProximo());
        if (atual.getProximo() == null) {
            fim = atual;
        }
        posicao--;
        return dadoRemovido;
    }
	
	public int posicao() {
		return posicao;
	}
	

    public boolean estaVazia() {
        return posicao == 0;
    }
    
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
