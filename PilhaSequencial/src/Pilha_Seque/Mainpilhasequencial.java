package Pilha_Seque;
import java.util.Scanner;
public class Mainpilhasequencial {

	public static void main(String[] args) {
		
		int op=1;
		int tam;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o tamanho maximo da pilha: \n");
		tam = leitor.nextInt();
		
		Pilha_Sequencial pilha = new Pilha_Sequencial(tam);
		
		do {
			System.out.println("digite 1 para verificar se a pilha esta vazia!\n");
			System.out.println("digite 2 para verificar se a pilha esta cheia!\n");
			System.out.println("digite 3 para verificar o tamanho da pilha!\n");
			System.out.println("digite 4 para receber o elemento no topo da pilha!\n");
			System.out.println("digite 5 para inserir um elemento no topo da pilha!\n");
			System.out.println("digite 6 para remover um elemento no topo da pilha!\n");
			System.out.println("digite 0 para sair da pilha!\n");
			System.out.println("Escolha uma das opções: \n");
			op = leitor.nextInt();
			
			switch (op) {
			
			case 1 :
				System.out.println("a pilha estar vazia? "+ pilha.pilha_vazia()+"\n");
				break;
				
			case 2 :
				System.out.println("a pilha estar cheia? "+ pilha.pilha_cheia()+"\n");
				break;
				
			case 3 :
				System.out.println("o tamnho da pilha é: "+ pilha.tamanho()+"\n");
				break;
				
			case 4 : 
				System.out.println("-1 significa operação não realizada.\n");
				System.out.println("o elemento no topo da pilha é: "+ pilha.top()+"\n");
				break;
				
			case 5 :
				int aux;
				System.out.println("digite o valor do elemento para inserir no topo da pilha: \n");
				aux = leitor.nextInt();
				System.out.println("a operação foi realizada? "+ pilha.push(aux)+"\n");
				break;
				
			case 6 :
				System.out.println("-1 significa operação não realizada.\n");
				System.out.println("o elemento que foi removido do topo da lista é: \n"+ pilha.pop()+"\n");
				break;
				
			case 0 :
				System.out.println("saindo da pilha!\n"+ pilha.pilha_vazia()+"\n");
				break;
				
			default :
				
				System.out.println("operação invalida! \n"+ pilha.pilha_vazia()+"\n");
			}
			
		}while(op!=0);
		leitor.close();
	}

}
