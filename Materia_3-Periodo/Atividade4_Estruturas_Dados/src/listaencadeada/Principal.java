package listaencadeada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Principal p = new Principal();
		ListaEncadeada lista = new ListaEncadeada();
		
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		int opcao2;
		int opcao3;
		
		do {
			
			p.menu();
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Deseja adiconar: \n1-Inserir no inicio  \n2-Inserir no Fim  \n3-Inserir no Meio \nOpcao:  ");
				opcao3 = scan.nextInt();
				if (opcao3 == 1) {
					System.out.println("Deseja adcionar mais um? \n1-sim \n2-não");
					opcao2 = scan.nextInt();
					while (opcao2 != 2) {
					System.out.print("Informe um Numero: ");
					lista.inserirInicio(scan.nextInt());
					opcao2 = 0;
					}
				}
				
				if (opcao3 == 2) {
					System.out.println("Deseja adcionar mais um? \n1-sim \n2-não");
					opcao2 = scan.nextInt();
					while (opcao2 != 2) {
						System.out.print("Informe um Nome: ");
						lista.inserirFim(scan.nextInt());
						opcao2 = 0;
					}
				}
				
				if (opcao3 == 3) {
					System.out.println("Deseja adcionar mais um? \n1-sim \n2-não");
					opcao2 = scan.nextInt();
					while (opcao2 != 2) {
						System.out.print("Informe um Nome: ");
						lista.inserirMeio(scan.nextInt());
						opcao2 = 0;
					}
				}
				
				break;
			case 2:
				System.out.print("Deseja adiconar: \n1-Inserir no inicio  \n2-Inserir no Fim  \n3-Inserir no Meio \nOpcao:  ");
				opcao3 = scan.nextInt();
				
				if (opcao3 == 1) {
					System.out.println("Informe a quantidade de itens que deseja remover:");
	                int quant = scan.nextInt();
	                for (int i = 0; i < quant; i++) {
	                    lista.removerInicio();
	                }
				}
				
                if (opcao3 == 2) {
					System.out.print("Informe a quantidade de itens que deseja remover:");
	                int quant2 = scan.nextInt();
	                for (int i = 0; i < quant2; i++) {
	                	lista.removerFim();
	                }
				}
                
                if (opcao3 == 2) {
                	System.out.print("Informe a quantidade de itens que deseja remover:");
                	int quant2 = scan.nextInt();
                	
                	System.out.print("Informe a posicao que deseja começar: ");
                	int quant3 = scan.nextInt();
                	
                	for (int i = 0; i < quant2; i++) {
                		lista.removerMeio(quant3);
                	}
                }
                
				break;
			case 3:
				System.out.println("Tamanho da lista Numero: " + lista.posicao()); 
		        System.out.println("Fila vazia?: " + lista.estaVazia());
				break;
			case 4:
				System.out.println("lista numerica");
				lista.imprimir();
				break;
			case 5:
				System.out.println("Saindo no programa.");
				break;

			default:
				System.out.println("Informacao nao encontrada.");
				break;
			}
			
			
		} while (opcao != 5);


	}

	public void menu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1- Inserir elementos na Lista Encadeada");
		System.out.println("2- Remover elementos da Lista Encadeada");
		System.out.println("3- Indice da Lista Encadeada");
		System.out.println("4- Imprimir elementos da Lista Encadeada");
		System.out.println("5- Sair");
	}
}
