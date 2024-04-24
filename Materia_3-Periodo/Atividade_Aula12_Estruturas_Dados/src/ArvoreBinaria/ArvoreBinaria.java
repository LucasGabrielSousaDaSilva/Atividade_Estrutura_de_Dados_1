package ArvoreBinaria;

public class ArvoreBinaria {
    public No noRaiz;

    public ArvoreBinaria(){
        this.noRaiz = null;
    }
    public void inserirNo(No noAtual, int elemento ){

        if(this.noRaiz == null){
            this.noRaiz = new No(elemento);
        }
        else if (elemento < noAtual.elemento)
        {
            if(noAtual.esquerda == null){
                noAtual.esquerda = new No(elemento);
            }
            else{
                noAtual = noAtual.esquerda;
                inserirNo(noAtual, elemento);
            }
        }
        else if (elemento > noAtual.elemento)
        {
        	if(noAtual.direita == null){
        		noAtual.direita = new No(elemento);
        	}
        	else{
        		noAtual = noAtual.direita;
        		inserirNo(noAtual, elemento);
        	}
        }
    }
    
    public void ordem() {
        ordemRecursivo(noRaiz);
    }

    public void ordemRecursivo(No raiz) {
        if (raiz != null) {
            ordemRecursivo(raiz.esquerda);
            System.out.print(raiz.elemento + " ");
            ordemRecursivo(raiz.direita);
        }
    }

    public void preordem() {
        preordemRecursivo(noRaiz);
    }

    public void preordemRecursivo(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.elemento + " ");
            preordemRecursivo(raiz.esquerda);
            preordemRecursivo(raiz.direita);
        }
    }

    public void postordem() {
        postordemRecursivo(noRaiz);
    }

    public void postordemRecursivo(No raiz) {
        if (raiz != null) {
            postordemRecursivo(raiz.esquerda);
            postordemRecursivo(raiz.direita);
            System.out.print(raiz.elemento + " ");
        }
    }
    
    public void imprimirRecurso(No raiz) {
        if (raiz != null) {
            imprimirRecurso(raiz.esquerda);
            System.out.print(raiz.elemento + " ");
            imprimirRecurso(raiz.direita);
        }
    }

    public void imprimir() {
			imprimirRecurso(noRaiz);
			System.out.println("");
    	
        System.out.println("Travessia em ordem:");
        ordem();
        System.out.println("\nTravessia em pré-ordem:");
        preordem();
        System.out.println("\nTravessia em pós-ordem:");
        postordem();
    }
}