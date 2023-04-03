package pilha_ENCADEADA;
import java.util.Scanner;

public class Mainpilha_encadeada {

	public static void main(String[] args) {
		
		
		int op;
		int valor;
		Scanner leitor = new Scanner(System.in);
		pilha pe = new pilha();
		do {
			System.out.println("digite 1 para verificar se a pilha esta vazia! \n");
			System.out.println("digite 2 para verificar o tamanho da pilha! \n");
			System.out.println("digite 3 para retorna o elemento no topo da pilha! \n");
			System.out.println("digite 4 para inserir um elemento no topo da pilha! \n");
			System.out.println("digite 5 para remover o elemento no topo da pilha! \n");
			System.out.println("digite 0 para sair do programa! \n");
			System.out.println("escolha uma das opções! \n");
			op = leitor.nextInt();
			
			switch (op) {
			
			case 1 :
				
				System.out.println("A pilha estar vazia? "+pe.pilha_vazia()+"\n");
				
				break;
				
			case 2 :
				
				System.out.println("O tamanho da pilha é: "+pe.pilha_tamanho()+"\n");
				
				break;
				
			case 3 :
				
				System.out.println(" o elemento no topo da pilha: "+pe.top()+"\n");
				
				break;
				
			case 4 :
				
				System.out.println("digite o valor que vc vai inserir no topo da pilha: \n");
				valor =leitor.nextInt();
				
				System.out.println("a operação foi realizada? "+pe.push(valor)+"\n");
				
			break;
			
			case 5 :
				
				System.out.println("o elemento removido do topo da lista foi: ? "+pe.pop()+"\n");
				
			break;	
			
			case 0 :
				System.out.println("saindo do programa! \n");
				
			break;
			
			default :
				
				System.out.println("opção invalida! \n");
				
				break;
			}
			
			
		}while(op!=0);
		
		leitor.close();

	}

}
