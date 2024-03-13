package PilhaEstatica;

import java.util.Scanner;

public class Main {
	
	    private int topo;
	    private int pilhaArray[];

	    private static Scanner scan = new Scanner(System.in);
	    
	    public Main(int tamanho) {
	        topo = -1;
	        pilhaArray = new int[tamanho];
	    }
	    public void push(int conteudo){
	    	 if (cheia()) {
	             System.out.println("Erro: Pilha cheia");
	             return;
	         }
	        topo ++;
	        pilhaArray[topo] = conteudo;
	    }
	    public void pop(){
	    	if (vazia()) {
	            System.out.println("Erro: Pilha vazia");
	            return; // Valor de retorno de erro
	        }
	        pilhaArray[topo] = 0;
	        topo --;
	    }
	    
	    public boolean vazia() {
	        return topo == -1;
	    }

	    public boolean cheia() {
	        return topo == pilhaArray.length - 1;
	    }
	    
	    public void imprimir(){
	    	if (vazia()) {
	            System.out.println("Pilha vazia");
	            return;
	        }
	        System.out.println("Elementos da pilha:");
	        for (int i = topo; i >= 0; i--) {
	            System.out.println(pilhaArray[i]);
	        }
	        
//	        for(int i=0;i<pilhaArray.length; i++){
//	            System.out.println(pilhaArray[i]);
//	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Qual o tamanho que deseja da pilha: ");
		int tamanho = scan.nextInt();
		
		Main p = new Main(tamanho);
		
		int opcao;
		
		do {
			p.menu();
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				for (int i = 0; i < tamanho; i++) {
					System.out.println("Informe um valor da casa natural:");
					p.push(scan.nextInt());
				}
				
				break;
			case 2:
				System.out.println("Informe a quantidade de itens que desja remover");
				int quant = scan.nextInt();
				for (int i = 0; i < quant; i++) {
					p.pop();
				}
				
				break;
			case 3:
				for (int i = 0; i < p.pilhaArray.length; i++) {
					if (i == p.pilhaArray.length) {
						System.out.println(i-1);
					}
				break;
				}
			case 4:
				p.imprimir();
				break;
	
			default:
				System.out.println("Finalizando");
				break;
			}
		} while (opcao != 5);
		
		
	}
	
	public void menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1- Inserir elementos na pilha");
		System.out.println("2- Remover elementos da pilha");
		System.out.println("3- Indice");
		System.out.println("4- Imprimir elementos da pilha");
		System.out.println("5- Sair");
	}

}
