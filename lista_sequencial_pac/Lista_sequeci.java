package lista_sequencial_pac;
import java.util.Scanner;
 	public class Lista_sequeci  {

 		public static void main(String[] args) {
		
		int tamMax;
		int op=0;
		int posi=0;
		int dado=0;
		
		System.out.println("digite o tamanho max da lista : \n");
		Scanner leitor = new Scanner(System.in);
		tamMax =  leitor.nextInt();
		ListaSeq lista = new ListaSeq(tamMax);
		
		do {
			System.out.println("Digite 1 para verificar se a lista estar vazia!\n");
			System.out.println("Digite 2 para verificar se a lista estar cheia!\n");
			System.out.println("Digite 3 para verificar o tamanho da lista!\n");
			System.out.println("Digite 4 Obtém para obter um elemento da lista!\n"
					+ "	Retorna -1 se a posição for inválida.\n");
			System.out.println("Digite 5 para pesquisar a posição de um elemento!\n"
					+ "	Retorna -1 caso não seja encontrado\n");
			System.out.println("Digite 6 para inserir um elemento em uma determinada posição!\n"
					+ "	Retorna true se a insercao funcionar e false caso contrário.\n");
			System.out.println("Digite 7 para remove um elemento de uma determinada posição!\n"
					+ "	Retorna o valor do elemento removido e -1 caso a remoção falhe.\n");
			System.out.println("Digite 8 para exibir a lista!\n");
			System.out.println("Digite 0 para sair da lista!: \n");
			System.out.println("Digite a opção na lista: \n");
			op = leitor.nextInt();
			
			switch (op){
			
			
			case 1 :
				System.out.println("A lista estar vazia?... : "+lista.vazia()+"!\n");
			
			break;
			
			case 2 :
				System.out.println("A lista estar cheia?... : "+lista.cheia()+"!\n");
				
			break;
			
			case 3 :
				System.out.println("Tamanho atual da lista é : "+lista.tamanho()+"\n");
				
			break;
			
			case 4 :
				System.out.println("Digite a posição do elemento da lista para acesso : \n");
				posi=leitor.nextInt();
				System.out.println("Posição ["+posi+"] elemento : "+lista.elemento(posi)+"\n");
				
			break;
			
			case 5 :
				System.out.println("Digite o dado da posição relacionada: \n");
				dado= leitor.nextInt();
				System.out.println(" dado: "+dado+ "relacionado a posição: "+lista.posicao(dado)+"\n");
				
			break;
			
			case 6 :
				
				 System.out.println("Digite a posição na lista para inserir : \n");
				 posi =  leitor.nextInt();
				 System.out.println("Digite o dado na lista para inserir : \n");
				 dado =  leitor.nextInt();
				 System.out.println("operação foi aceita?... : "+lista.insere(posi,dado)+"\n");
			break;
			
			case 7 :
				System.out.println("Digite a posição na lista para remover : \n");
				 posi =  leitor.nextInt();
				 System.out.println("Operação foi aceita?... : "+lista.remove(posi)+"\n");
				 
				 
			
			break;
			
			case 8:
				lista.mostrar();
				
			break;
			
			case 0:
				System.out.println("Encerrando programa!\n");
			break;
			
			default :
				System.out.println("Opção invalida!\n");
				
			break;		
			}
		    
		
			}while(op!=0);
		
	}

}
