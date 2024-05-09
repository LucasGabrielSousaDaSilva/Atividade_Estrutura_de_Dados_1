package ArvoreBinaria;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserirNo(arvore.noRaiz, 10);
        arvore.inserirNo(arvore.noRaiz, 5);
        arvore.inserirNo(arvore.noRaiz, 15);
        arvore.inserirNo(arvore.noRaiz, 3);
        arvore.inserirNo(arvore.noRaiz, 7);
        arvore.inserirNo(arvore.noRaiz, 12);
        arvore.inserirNo(arvore.noRaiz, 20);
        arvore.inserirNo(arvore.noRaiz, 25);
        
        arvore.imprimir();
        
        arvore.busca(5);
        
        System.out.println("Altura da árvore: " + arvore.altura());
        
        arvore.excluir(25);
        
        arvore.imprimir();
        
        System.out.println("Altura da árvore: " + arvore.altura());
        
        // Verifica se a árvore é estritamente binária
        if (arvore.isEstritamenteBinaria()) {
            System.out.println("A árvore é estritamente binária.");
        } else {
            System.out.println("A árvore não é estritamente binária.");
        }
        
        // Verifica se a árvore é completa
        if (arvore.isCompleta()) {
            System.out.println("A árvore é completa.");
        } else {
            System.out.println("A árvore não é completa.");
        }
        
        // Verifica se a árvore é cheia
        if (arvore.isCheia()) {
            System.out.println("A árvore é cheia.");
        } else {
            System.out.println("A árvore não é cheia.");
        }
    }
}