package lista_encadeada;


public class Lista_en {
	//definindo os atributos.
	private No cabeca;
	
	private int tamanho;
	
	public Lista_en() {
		//fazendo com que a variavel No cabeca aponte para null e que a lista receba tamanho 0.
		this.cabeca = null;
		this.tamanho = 0;
		
	}
	
	//se tamanho da lista for igual a 0 então retorna true se for diferente retorna false.
	public boolean Lista_vazia() {
		if(this.tamanho == 0) 
				return true;
		  else 	return false;
	}
	
	//retorna o tamanho da lista.
	public int Tamanho(){
		
		No p = this.cabeca;
		
		int contador = 0;
		
		while(p != null) {
			
			p = p.getProximo();
			
			contador++;
			
		}
		
		return contador;
		
		
	}
	
	/*
	 * verifica se a lista esta vazia, se estiver, retorna -1, caso contrario
	 * verifica se a posição é valida, se tambem não for, retorna - 1, caso também não ocorra
	 * percorre a lista até achar a posição inserida, enquanto isso faz a variavel No p
	 * ir andando de No em No.
	 * Quando a posição requerida é encontrada, retorna-se o conteudo contido na variavel auxiliar;
	 */
	public int Elemento(int pos) {
		
		No p = this.cabeca;
		int contador = 1;
		
		if(Lista_vazia())
			return -1;
		
		if((pos < 1) || (this.tamanho < pos)) 
			return -1;
		
		while(pos > contador) {
			
			p = p.getProximo();
			
			contador++;
		}
		
		return p.getConteudo();
		
	}
	
	/*verifica se a lista esta vazia, se estiver, retorna -1, caso contrario
	 * verifica se a posição é valida, se tambem não for, retorna - 1, caso também não ocorra
	 * percorre a lista até achar a posição inserida, enquanto isso faz a variavel No p
	 * ir andando de No em No.
	 * Quando a posição requerida é encontrada, a variavel aux recebe o conteudo desse No, 
	 * logo em seguida o No recebe o novo dado  retorna-se o conteudo contido na variavel auxiliar.
	 * 
	*/
public int Elemento_mod(int pos, int dado) {
		
		No p = this.cabeca;
		int contador = 1;
		int aux;
		
		
		if(Lista_vazia()) {
			return -1;
		
		}else if((pos < 1) || (this.tamanho < pos)) {
			return -1;
		} else	while(pos > contador) {
			
			p = p.getProximo();
			
			contador++;
		}
		
		aux = p.getConteudo();
		
		p.setConteudo(dado);
		
		return aux;
		
	}
/*primeiro verifica se a lista está vazia, se estiver, o método é encerrado,
* caso contrário, percorre a lista até achar o conteudo inserido, enquanto isso
* ocorre a varial No p vai andando de No em No. Quando o conteúdo é por
* fim achado, é retornado o a posição na qual ele se encontra.
* */
	public int Posicao(int dado) {
		
		No p = this.cabeca;
		
		int contador = 1;
		
		if (Lista_vazia()) {
		return 0;
		
		} else while( p != null) {
			
			if(p.getConteudo() == dado) { 
				return contador;
			} else p = p.getProximo();
				 contador++;
		}  return -1;
		
	}
	/*
	 * primeiro testa se a lista esta vazia e se a posição é diferente de 1, se for o caso
	 * nos é retornado falso, se não testa se o dado inserido será acrescentado no começo, 
	 * no meio ou no fim da lista chamando assim o método referente.
	 */
	public boolean Insecao(int pos,int dado) {
		if(Lista_vazia() && (pos !=1)) {
			return false;
		}else if(pos == 1) {
		return	insecao_ini(dado);
		}else if(pos == tamanho + 1) {
		return	insecao_final(dado);
		}else {
		return	insecao_meio(pos,dado);
		} 
		
		
		
		
	}
	/*
	 * faz um novoNo receber o valor inserido, em seguida faz esse mesmo No apontar para o No
	 * para o qual a cebeca estava apontando. Em seguida faz cabeca receber o novoNo, fazendo assim
	 * ela receber tanto o conteúdo do No como também seu ponteiro apomtando para null que antes
	 * lhe pertencia. Por fim o tamanho da lista é acrecentado em 1 e true é retornado
	 */
	public boolean insecao_ini(int dado) {
		No novo_no = new No();
		
		novo_no.setConteudo(dado);
		novo_no.setProximo(this.cabeca);
		
		this.cabeca = novo_no;
		
		this.tamanho++;
		
		return true;
	
	}
	/*
	 * cria um novoNo e o faz receber o dado inserido, em seguida cria um No auxiliar
	 * que recebe a cabeca. Logo mais percorremos a lista até que se encontre a posição
	 * antecessora à inserida e fazemos o No auxiliar ficar nela e apontar para a que queremos.
	 * Em seguida fazemos o novoNo que está com o conteudo novo apontar para a posição que queremos e
	 * depois fazemos o No auxiliar apontar para o novoNo, fazendo com a que a lista receba o novoNo
	 * como parte da lista. Para melhor entendimento o novoNo vai estar com o conteudo que queremos 
	 * inserir na posição e por meio de todo esse proesso ele acaba recebendo a posição que inserimos.
	 * Por fim, o tamanho da lista é acrescido em 1 e true é retornado
	 */
	public boolean insecao_meio(int pos, int dado) {
		No novo_no = new No();
		novo_no.setConteudo(dado);
		int contador = 1;
		No aux = this.cabeca;
		while((contador < pos-1) && (aux != null)) {
			aux = aux.getProximo();
			contador++;
		} if(aux == null) return false;
		
		
		
		novo_no.setProximo(aux.getProximo());
		aux.setProximo(novo_no);
		this.tamanho++;
		return true;
		
	}
	/*
	 * cria um novoNo atribuindo-lhe o valor inserido pelo usuário, logo após cria um
	 * No auxiliar que servirá para andar de No em No até achar o ultimo, ou seja, achar
	 * o No que aponta para null. Quando o ultimo é encontrado o No auxiliar passa a apontar
	 * para o novoNo e o novoNo, por sua vez, é induzido a apontar para null. Por fim o tamanho
	 * da lista é incrementada e true é retornado
	 */
	public boolean insecao_final(int dado) {
		No novo_no = new No();
		novo_no.setConteudo(dado);
		
		No aux = this.cabeca;
		
		while(aux.getProximo() != null) {
			
			aux = aux.getProximo();
		}
		
		novo_no.setProximo(null);
		aux.setProximo(novo_no);
		this.tamanho++;
		return true;
		
	}
	/*
	 * primeiro testa se a lista está vazia, se estiver retonar -1. Caso contrário
	 * verifica se a posição a ser removida se trata da primeira ou de outra no meio ou fim da lista, executando
	 * assim um dos dois métodos criados
	 */
	public int Remover(int pos) {
		
		if(Lista_vazia()) {
			return -1;
		}else if(pos == 1) {
		return	remover_ini();
		}else{ return remover_meio_final(pos);
		
	} 
	
	}
	/*
	 * declara um No p que irá receber o dado contido na primeira posição da lista, depois faz a cabeca apontar
	 * para o elemento na segunda posição da lista, logo em seguida atibuindo o valor null ao No p, que detém
	 * a posição 1. Por fim, nos é retornaod o dado
	 */
	public int remover_ini() {
		No p = this.cabeca;
		int dado = p.getConteudo();
		
	     this.cabeca = p.getProximo();
	     this.tamanho--;
	     
	     p = null;
	     
	     return dado;
		
	}
	/*
	 * cria dois No's um w e um v. Depois percorre toda a lista até o No v ficar na posição
	 * inserida. Enquanto isso, o No w sempre ficará um passo atrás do v. Quando a posição é encontrada
	 * é testado se o No v está na ultima posição apontando para null, se estiver, nos é retornado -1 e método é encerrado. 
	 * Caso contrário, a variável dado recebe o conteúdo do No v e o No w passa a apontar para o No
	 * após o v, o tamanho da lista é incrementado em -1 e o No v recebe null.
	 * Por fim dado é retornado
	 */
	public int remover_meio_final(int pos) {
		No v = null;
		No w = null;
		int contador = 1;
		int dado= -1;
		v = this.cabeca;
		
		while((v != null) && (pos > contador)) {
			w = v;
			v = v.getProximo();
			contador++;
		}
		
		if(v == null) return -1;
		
		 dado = v.getConteudo();
		w.setProximo(v.getProximo());
		this.tamanho--;
		
		v= null;
		
		return dado;
		
	}
	
}

