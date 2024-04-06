package listaduplamenteencadeada;

public class No {

	private int elemento;
    private No proximo;
    private No anterior;

    public No(int valor){
        this.elemento = valor;
        this.proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public int getElemento() {
        return elemento;
    }

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
}
