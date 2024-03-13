package FilaEstatica;

import java.util.Scanner;


public class Main {
	
	private int posicaoFila;
    private int filaArray[];
    
    private static Scanner scan = new Scanner(System.in);

    public Main(int tamanho) {
        filaArray = new int[tamanho];
        posicaoFila = 0;
    }
    public void inserir(int conteudo){
    	if (cheia()) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        filaArray[posicaoFila] = conteudo;
        posicaoFila ++;
    }
    public void remove(){
    	if (vazia()) {
            System.out.println("Erro: Fila vazia");
            return; // Valor de retorno de erro
        }
        for (int i = 0; i < posicaoFila - 1; i++) {
            filaArray[i] = filaArray[i + 1];
        }
        filaArray[posicaoFila - 1] = 0;
        posicaoFila--;
    }
    
    public boolean vazia() {
        return posicaoFila == 0;
    }

    public boolean cheia() {
        return (posicaoFila == filaArray.length) ;
    }
    
    public void imprimir() {
    	if (vazia()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.println("Elementos da fila:");
        for (int i = 0; i < posicaoFila; i++) {
            System.out.println(filaArray[i]);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Qual o tamanho que deseja da pilha: ");
		int tamanho = scan.nextInt();
		
		Main f = new Main(tamanho);
		
		int opcao;
		
		do {
			f.menu();
			opcao = scan.nextInt();
			
			switch (opcao) {
            case 1:
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Informe um valor para inserir na fila:");
                    f.inserir(scan.nextInt());
                }
                break;
            case 2:
                System.out.println("Informe a quantidade de itens que deseja remover:");
                int quant = scan.nextInt();
                for (int i = 0; i < quant; i++) {
                    f.remove();
                }
                break;
            case 3:
                System.out.println("Opção indisponível: índice não implementado.");
                break;
            case 4:
            		f.imprimir();	
                
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
			}
		} while (opcao != 5);
		
	}
	
	public void menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1- Inserir elementos na fila");
		System.out.println("2- Remover elementos da fila");
		System.out.println("3- Mostar Indice");
		System.out.println("4- Imprimir elementos da fila");
		System.out.println("5- Sair");
	}

}
