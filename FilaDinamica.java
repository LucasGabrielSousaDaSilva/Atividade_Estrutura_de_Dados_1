package Fila;
public class FilaDinamica<T> {
    private Node<T> inicio;
    private Node<T> fim;
    private int tamanho;

    private class Node<T> {
        T dado;
        Node<T> proximo;

        public Node(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserir(T dado) {
        Node<T> novoNode = new Node<>(dado);
        if (inicio == null) {
            inicio = novoNode;
        } else {
            fim.proximo = novoNode;
        }
        fim = novoNode;
        tamanho++;
    }

    public T remover() {
        if (inicio == null) {
            return null; // Fila vazia
        }
        T dadoRemovido = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return dadoRemovido;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void imprimir() {
        Node<T> temp = inicio;
        while (temp != null) {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaDinamica<Integer> fila = new FilaDinamica<>();
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.imprimir(); // Saída: 1 2 3
        System.out.println("Tamanho da fila: " + fila.tamanho()); // Saída: 3
        System.out.println("Fila vazia? " + fila.estaVazia()); // Saída: false

        fila.remover();
        fila.imprimir(); // Saída: 2 3
        System.out.println("Tamanho da fila: " + fila.tamanho()); // Saída: 2

        fila.remover();
        fila.remover();
        System.out.println("Fila vazia? " + fila.estaVazia()); // Saída: true
    }
}
