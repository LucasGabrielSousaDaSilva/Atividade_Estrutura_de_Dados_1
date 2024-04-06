package listaduplamenteencadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();
		
		lista.inserir(0);
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(15);
		lista.inserir(90);
		
		lista.imprimirLista();
		
		lista.remover(10);
		lista.remover(0);
		
		lista.imprimirLista();
	}

}
