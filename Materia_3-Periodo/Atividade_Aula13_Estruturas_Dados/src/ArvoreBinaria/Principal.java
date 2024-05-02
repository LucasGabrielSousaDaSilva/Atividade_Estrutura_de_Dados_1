package ArvoreBinaria;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserirNo(arvore.noRaiz, 10);
        arvore.inserirNo(arvore.noRaiz, 5);
        arvore.inserirNo(arvore.noRaiz, 3);
        arvore.inserirNo(arvore.noRaiz, 15);
        arvore.inserirNo(arvore.noRaiz, 20);
        
        arvore.busca(5);
        
        arvore.imprimir();
        
        arvore.excluir(5);
        
        arvore.imprimir();
    }
}