package lista_encadeada;
import java.util.Scanner; 
public class Lista_encadeadamain {

	public static void main(String[] args) {
		int pos;
		int dados = 0;
		int in=0;
		int op=1;
		
		Scanner leitor = new Scanner(System.in);
		
		do {
		System.out.println("digite 1 para criar lista vazia! \n ");
		
		in = leitor.nextInt();
		
		}while(in!=1);
		
		Lista_en lista = new Lista_en();
		
		do {
		System.out.println("digite 1 para verificar se a lista estar vazia!\n ");
		System.out.println("digite 2 para obter o tamanho da lista!\n ");
		System.out.println("digite 3 para obter o valor de um elemento de uma determinada posição na lista!\n ");
		System.out.println("digite 4 para modificar o valor de um elemento de uma determinada posição na lista!\n ");
		System.out.println("digite 5 para obter a posição de um elemento da lista!\n ");
		System.out.println("digite 6 para inserir um elemento em uma determinada posição na lista!\n ");
		System.out.println("digite 7 para remover um elemento em uma determinada posição na lista!\n ");
		System.out.println("digite 0 para sair do programa!\n ");
		System.out.println("Escolha uma das opções!: \n ");
		op = leitor.nextInt();		
		
		
	
		
		switch (op) {
		
		case 1 :
			System.out.println("A lista estar vazia ? "+lista.Lista_vazia()+"\n");
			
			
		break;
		
		case 2 :
			System.out.println("o tamanho da lista é :"+lista.Tamanho()+"\n");
			
		break ;
		
		case 3 :
			
			System.out.println("digite a posição do elemento na lista! \n");
			pos = leitor.nextInt();
			
			System.out.println("o elemento da posição é: "+lista.Elemento(pos)+"\n");
			
		break;
		
		case 4 :
		
			System.out.println("digite a posição do elemento na lista! \n");
			pos = leitor.nextInt();
			System.out.println("digite o novo conteudo: \n");
			dados = leitor.nextInt();
			System.out.println("o elemento que foi alterado é: "+lista.Elemento_mod(pos,dados)+"\n");
				
		break;
		
		case 5 :
			
		        System.out.println("digite um elemento da lista : \n");
		        pos = leitor.nextInt();
		        
		        System.out.println("a posição correspondente ao elemento é: "+lista.Posicao(pos));
		break;
		
		case 6 :
			
			System.out.println("digite a posição que vai inserir na lista: \n");
			pos = leitor.nextInt();
			
			System.out.println("digite o elemento que vai inserir na lista: \n");
			dados = leitor.nextInt();
			
			System.out.println("inseção foi realizar ? "+lista.Insecao(pos,dados)+"\n");
			
		break;
		
		case 7 :
			
			System.out.println("-1 sgninifica operação invalida.\n");
			System.out.println("digite a posição que vai remover na lista: \n");
			pos = leitor.nextInt();
			
			System.out.println("o elemento removido é: "+lista.Remover(pos)+"\n");
			
		break;	
		
		default :
			
		System.out.println("opção invalida!\n");	
		}
		
		}while(op != 0);
		
		leitor.close();
		
		
		
}
}