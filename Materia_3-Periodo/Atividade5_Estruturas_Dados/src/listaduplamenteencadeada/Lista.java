package listaduplamenteencadeada;

public class Lista {

	 private No inicio;
	    private No fim;
	    private int tamanho;

	   public Lista(){
	      this.inicio = null;
	      this.fim = null;
	      this.tamanho = 0;
	   }
	   
	   public void inserir(int elemento) {
		   if(listaVazia()|| elemento < this.inicio.getElemento()) {
			   inserirInicio(elemento);
		   }
		   else if(elemento > fim.getElemento()) {
			   inserirFim(elemento);
		   }
		   else {
			   inserirMeio(elemento);
		   }
	   }
	   
	   public void remover(int elemento){
	        if(elemento == this.inicio.getElemento()){
	            removerInicio();
	        }
	        else if(elemento == this.fim.getElemento()){
	            removerFim();
	        }
	        else {
	            removerMeio(elemento);
	        }
	    }

	   
	   public void inserirInicio(int elemento) {
		   No noAux = new No(elemento);
		   if (listaVazia()) {
			this.fim = noAux;
		}else {
			noAux.setProximo(this.inicio);
			this.inicio.setAnterior(noAux);
		}
		  this.inicio = noAux;
		  tamanho++;
	   }
	   
	   public void inserirFim(int elemento) {
		   No noAux = new No(elemento);
		   if (listaVazia()) {
			  this.inicio = noAux;
		   }else {
			   this.fim.setProximo(noAux);
			   noAux.setAnterior(this.fim);
		   }
		   this.fim = noAux;
		   tamanho++;
	   }
	   
	   public void inserirMeio(int elemento) {
		   No noAux = new No(elemento);
		   No noAtual = this.inicio;
		   No noAtual1 = this.fim;
		   
		   while (elemento > noAtual.getElemento() && elemento > noAtual.getProximo().getElemento()) {
			noAtual = noAtual.getProximo();
		}
		   while (elemento < noAtual1.getElemento() && elemento < noAtual1.getAnterior().getElemento()) {
			noAtual1 = noAtual1.getAnterior();
		}
		   
		   noAux.setAnterior(noAtual1.getAnterior());
		   noAux.setProximo(noAtual.getProximo());
		   noAtual1.setAnterior(noAux);
		   noAtual.setProximo(noAux);
		   
		   this.tamanho++;
	   }
	   
	   private void removerInicio() {
		   No noAux = this.inicio;
		   this.inicio = noAux.getProximo();
		   noAux.setProximo(null);
		   this.inicio.setAnterior(null);
		   this.tamanho--;
	   }
	   
	   private void removerFim() {
		   No noAux = this.inicio;
		   for (int i = 0; i < tamanho-1; i++) {
			noAux = noAux.getProximo();
		}
		   noAux.setProximo(null);
		   noAux.setAnterior(fim);
		   this.fim = noAux;
		   this.tamanho--;
	   }
	   
	   private void removerMeio(int elemento) {
		   No noAtual = this.inicio;
		   No noAtual1 = this.fim;
		   
		   while (elemento > noAtual.getElemento() && elemento > noAtual.getProximo().getElemento()) {
			noAtual = noAtual.getProximo();
		   }
		   while (elemento < noAtual1.getElemento() && elemento < noAtual1.getAnterior().getElemento()) {
			noAtual1 = noAtual1.getAnterior();
		   }
		   
		   No noAux = noAtual.getProximo().getProximo();
		   No noAux1 = noAtual1.getAnterior().getAnterior();
		   noAtual.getProximo().setProximo(null);
		   noAtual1.getAnterior().setAnterior(null);
		   
		   noAtual.setProximo(noAux);
		   noAtual1.setAnterior(noAux1);
	   }
	   
	   
	   public void imprimirLista() {
		   No noAtual = this.inicio;
		   No noAtual1 = this.fim;
		   
		   while (noAtual != null) {
			System.out.print("(" + noAtual.getElemento() + ")");
			noAtual = noAtual.getProximo();
		}
		   System.out.println();
		   while (noAtual1 != null) {
			   System.out.print("(" + noAtual1.getElemento() + ")");
			   noAtual1 = noAtual1.getAnterior();
		   }
		   System.out.println();
	   }
	   
	    public boolean listaVazia(){
	        return this.inicio == null ? true : false;
	    }
	    
	    
}
