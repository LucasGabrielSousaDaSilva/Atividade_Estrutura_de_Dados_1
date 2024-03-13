package PilhaEstatica;

	public class PilhaEstatica {
	    private int tamanhoMaximo;
	    private int topo;
	    private int[] dados;

	    public PilhaEstatica(int tamanhoMaximo) {
	        this.tamanhoMaximo = tamanhoMaximo;
	        this.dados = new int[tamanhoMaximo];
	        this.topo = -1;
	    }

	    public void inserir(int dado) {
	        if (cheia()) {
	            System.out.println("Erro: Pilha cheia");
	            return;
	        }
	        topo++;
	        dados[topo] = dado;
	    }

	    public int remover() {
	        if (vazia()) {
	            System.out.println("Erro: Pilha vazia");
	            return -1; // Valor de retorno de erro
	        }
	        int dadoRemovido = dados[topo];
	        dados[topo] = 0; // Limpa a posição removida
	        topo--;
	        return dadoRemovido;
	    }

	    public int tamanho() {
	        return topo + 1;
	    }

	    public boolean vazia() {
	        return topo == -1;
	    }

	    public boolean cheia() {
	        return topo == tamanhoMaximo - 1;
	    }

	    public void imprimir() {
	        if (vazia()) {
	            System.out.println("Pilha vazia");
	            return;
	        }
	        System.out.println("Elementos da pilha:");
	        for (int i = topo; i >= 0; i--) {
	            System.out.println(dados[i]);
	        }
	    }

	    public static void main(String[] args) {
	        PilhaEstatica pilha = new PilhaEstatica(5);
	        System.out.println("Pilha vazia? " + pilha.vazia());
	        pilha.inserir(1);
	        pilha.inserir(2);
	        pilha.inserir(3);
	        pilha.inserir(4);
	        pilha.inserir(5);
	        pilha.inserir(6); // Tentando inserir em uma pilha cheia
	        System.out.println("Tamanho da pilha: " + pilha.tamanho());
	        System.out.println("Pilha cheia? " + pilha.cheia());
	        pilha.imprimir();
	        System.out.println("Removendo elemento: " + pilha.remover());
	        pilha.imprimir();
	    }
	}

