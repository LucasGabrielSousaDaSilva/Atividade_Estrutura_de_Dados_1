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
    
    public No busca(int elemento) {
    	No nobusca = buscarRecursivo(noRaiz, elemento);
    	if (nobusca != null) {
    		 System.out.println("Elemento " + elemento + " encontrado na árvore.");
		}else {
            System.out.println("Elemento " + elemento + " não encontrado na árvore.");
        }
    	
        return buscarRecursivo(noRaiz, elemento);
        
    }

    private No buscarRecursivo(No noAtual, int elemento) {
        if (noAtual == null || noAtual.elemento == elemento) {
            return noAtual;
        }

        if (elemento < noAtual.elemento) {
            return buscarRecursivo(noAtual.esquerda, elemento);
        }

        return buscarRecursivo(noAtual.direita, elemento);
    } 
    
    public void excluir(int elemento) {
        noRaiz = excluirRecursivo(noRaiz, elemento);
    }

    private No excluirRecursivo(No no, int elemento) {
        if (no == null) {
            return null;
        }

        if (elemento < no.elemento) {
            no.esquerda = excluirRecursivo(no.esquerda, elemento);
        } else if (elemento > no.elemento) {
            no.direita = excluirRecursivo(no.direita, elemento);
        } else {
            if (no.esquerda == null && no.direita == null) {
                no = null;
            }
            else if (no.esquerda == null) {
                no = no.direita;
            } else if (no.direita == null) {
                no = no.esquerda;
            }
            else {
                No temp = encontrarMenorNo(no.direita);
                no.elemento = temp.elemento;
                no.direita = excluirRecursivo(no.direita, temp.elemento);
            }
        }
        return no;
    }

    private No encontrarMenorNo(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        } 
        return no;
    }
    
    public int altura() {
        return calcularAltura(noRaiz);
    }

    private int calcularAltura(No no) {
    	int esquerda = 0;
    	int direita = 0;
        if (no == null) {
            return 0;
        } 
        if (no.esquerda != null) {
			esquerda = calcularAltura(no.esquerda);
		}
        if (no.direita != null) {
        	direita = calcularAltura(no.direita);
        }
        if (no.esquerda == null && no.direita == null) {
			return 1;
		}
        
        if (no.elemento == noRaiz.elemento) {
			if (esquerda > direita) {
				return esquerda;
			}else {
				return direita;
			}	
		}else if (esquerda > direita) {
			if (esquerda > direita) {
				return esquerda + 1 ;
			}else {
				return direita + 1;
			}
		}
        return Math.max(esquerda, direita)+1;
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
    }
    
    public boolean isEstritamenteBinaria() {
        return verificarEstritamenteBinaria(noRaiz);
    }

    private boolean verificarEstritamenteBinaria(No no) {
        if (no == null) {
            return true;
        }
        if (no.esquerda == null && no.direita == null) {
            return true;
        }
        if (no.esquerda != null && no.direita != null) {
            return verificarEstritamenteBinaria(no.esquerda) && verificarEstritamenteBinaria(no.direita);
        }
        return false;
    }

    public boolean isCompleta() {
        return verificarCompleta(noRaiz, 0, altura());
    }

    private boolean verificarCompleta(No no, int index, int altura) {
        if (no == null) {
            return true;
        }
        if (index >= altura) {
            return false;
        }
        return (verificarCompleta(no.esquerda, 2 * index + 1, altura)
                && verificarCompleta(no.direita, 2 * index + 2, altura));
    }

    public boolean isCheia() {
        int altura = altura();
        return verificarCheia(noRaiz, altura, 0);
    }

    private boolean verificarCheia(No no, int altura, int nivel) {
        if (no == null) {
            return true;
        }
        if (no.esquerda == null && no.direita == null) {
            return (altura == nivel + 1);
        }
        if (no.esquerda != null && no.direita != null) {
            return (verificarCheia(no.esquerda, altura, nivel + 1) && verificarCheia(no.direita, altura, nivel + 1));
        }
        return false;
    }
}