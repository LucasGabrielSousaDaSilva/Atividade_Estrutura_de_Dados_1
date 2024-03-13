package FilaEstatica;

import java.util.Scanner;

public class FilaEstatica {
    private int tamanhoMaximo;
    private int inicio;
    private int fim;
    private int[] dados;

    public FilaEstatica(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.dados = new int[tamanhoMaximo];
        this.inicio = -1;
        this.fim = -1;
    }

    public void inserir(int dado) {
        if (cheia()) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        if (inicio == -1) {
            inicio = 0;
        }
        fim = (fim + 1) % tamanhoMaximo;
        dados[fim] = dado;
    }

    public int remover() {
        if (vazia()) {
            System.out.println("Erro: Fila vazia");
            return -1; // Valor de retorno de erro
        }
        int dadoRemovido = dados[inicio];
        if (inicio == fim) {
            inicio = -1;
            fim = -1;
        } else {
            inicio = (inicio + 1) % tamanhoMaximo;
        }
        return dadoRemovido;
    }

    public int tamanho() {
        if (inicio == -1) {
            return 0;
        }
        if (inicio <= fim) {
            return fim - inicio + 1;
        } else {
            return tamanhoMaximo - inicio + fim + 1;
        }
    }

    public boolean vazia() {
        return inicio == -1;
    }

    public boolean cheia() {
        return (fim + 1) % tamanhoMaximo == inicio;
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.println("Elementos da fila:");
        int i = inicio;
        while (i != fim) {
            System.out.println(dados[i]);
            i = (i + 1) % tamanhoMaximo;
        }
        System.out.println(dados[fim]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tamanho que deseja da fila: ");
        int tamanho = scan.nextInt();

        FilaEstatica fila = new FilaEstatica(tamanho);

        int opcao;
        
        do {
			 fila.menu();
	        opcao = scan.nextInt();
	        
	        switch (opcao) {
	        case 1:
	            for (int i = 0; i < tamanho; i++) {
	                System.out.println("Informe um valor para inserir na fila:");
	                fila.inserir(scan.nextInt());
	            }
	            break;
	        case 2:
	            System.out.println("Informe a quantidade de itens que deseja remover:");
	            int quant = scan.nextInt();
	            for (int i = 0; i < quant; i++) {
	                fila.remover();
	            }
	            break;
	        case 3:
	            fila.imprimir();
	            break;
	        default:
	            System.out.println("Opção inválida.");
	            break;
	        }
		} while (opcao !=4);
        scan.close();
    }

    public void menu() {
        System.out.println("Escolha uma das opções:");
        System.out.println("1- Inserir elementos na fila");
        System.out.println("2- Remover elementos da fila");
        System.out.println("3- Imprimir elementos da fila");
    }
}

