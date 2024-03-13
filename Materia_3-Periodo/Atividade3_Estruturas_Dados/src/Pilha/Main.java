package Pilha;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main m = new Main();
		
		PilhaDinamica<Integer> pilhaI = new PilhaDinamica<>();
		PilhaDinamica<String> pilhaS = new PilhaDinamica<>();
		
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		int opcao2;
		int opcao3;
		
		do {
			
			m.menu();
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Deseja adiconar: \n1-numero  \n2-nome \nOpcao:  ");
				opcao3 = scan.nextInt();
				if (opcao3 == 1) {
					System.out.println("Deseja adcionar mais um? \n1-sim \n2-não");
					opcao2 = scan.nextInt();
					while (opcao2 != 2) {
					System.out.print("Informe um Numero: ");
					pilhaI.push(scan.nextInt());
					opcao2 = 2;
					}
				}
				
				if (opcao3 == 2) {
					System.out.println("Deseja adcionar mais um? \n1-sim \n2-não");
					opcao2 = scan.nextInt();
					while (opcao2 != 2) {
						System.out.print("Informe um Nome: ");
						pilhaS.push(scan.next());
						opcao2 = 2;
					}
				}
				
				break;
			case 2:
				System.out.print("Deseja remover: \n1-numero  \n2-nome \nOpcao:  ");
				opcao3 = scan.nextInt();
				
				if (opcao3 == 1) {
					System.out.println("Informe a quantidade de itens que deseja remover pilha 1:");
	                int quant = scan.nextInt();
	                for (int i = 0; i < quant; i++) {
	                    pilhaI.pop();
	                }
				}
                if (opcao3 == 2) {
					System.out.println("Informe a quantidade de itens que deseja remover pilha 2:");
	                int quant2 = scan.nextInt();
	                for (int i = 0; i < quant2; i++) {
	                	pilhaS.pop();
	                }
				}
				break;
			case 3:
				System.out.println("Tamanho da fila Numero: " + pilhaI.tamanho()); 
		        System.out.println("Fila vazia?: " + pilhaI.vazia());
		        
		        System.out.println("Tamanho da fila texto: " + pilhaS.tamanho());
		        System.out.println("Fila vazia?: " + pilhaS.vazia());
				break;
			case 4:
				System.out.println("Pilha numerica");
				pilhaI.imprimir();
				
				System.out.println("Pilha de Nomes");
				pilhaS.imprimir();
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
		System.out.println("1- Inserir elementos na pilha");
		System.out.println("2- Remover elementos da pilha");
		System.out.println("3- Indice");
		System.out.println("4- Imprimir elementos da pilha");
		System.out.println("5- Sair");
	}
}
