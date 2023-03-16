package lista_sequencial_pac;

public class ListaSeq {
	// Vetor que contém os dados da lista
	private int dados[];
	private int tamAtual=0;
	private int tamMax;
	public ListaSeq(int tam){
	tamMax = tam;
	dados = new int[tamMax];
	}
	// Definição das Operações
	/** Verifica se a Lista está vazia */
	public boolean vazia(){
	if (tamAtual == 0 ) return true;
	else return false;
	}
	/**Verifica se a Lista está cheia */
	public boolean cheia(){
	if (tamAtual == tamMax) return true;
	else return false;
	}
	/**Obtém o tamanho da Lista*/
	public int tamanho(){
	return tamAtual;
	}
	/** Obtém o i-ésimo elemento de uma lista.
	Retorna -1 se a posição for inválida. */
	public int elemento(int pos){
	int dado;
	/* Se posição estiver fora dos limites
	<= 0 ou > tamanho da lista */
	if ((pos > tamAtual) || (pos <= 0))
	return -1;
	dado = dados[pos-1];
	return dado;
	}
	/** Retorna a posição de um elemento pesquisado.
	Retorna -1 caso não seja encontrado */
	public int posicao (int dado){
	/* Procura elemento a elemento.
	Se estiver, retorna posição no array+1 */
	for (int i = 0; i < tamAtual; i++){
	if (dados[i] == dado){
	return (i + 1);
	}
	}
	return -1;
	}
	/**Insere um elemento em uma determinada posição.
	Retorna true se a insercao funcionar e
	false caso contrário. */
	public boolean insere (int pos, int dado){
	if (cheia() || (pos > tamAtual+1) || (pos<=0)){
	return false;
	}
	for (int i = tamAtual; i >= pos; i--){
	dados[i] = dados[i-1];
	}
	dados[pos - 1] = dado;
	tamAtual++;
	return true;
	}
	/** Remove um elemento de uma determinada posição
	Retorna o valor do elemento removido e
	-1 caso a remoção falhe */
	public int remove(int pos){
	int dado;
	if ((pos > tamAtual) || (pos < 1 ))
	return -1;
	dado = dados[pos-1];
	for (int i = pos - 1; i < tamAtual - 1; i++){
	dados[i] = dados[i+1];
	}
	tamAtual--;
	return dado;
	}
	public void mostrar() {
		System.out.println("LISTA:\n");
		for(int i = 0; i < tamAtual; i++) {
			System.out.println("posição["+(i+1)+"] elemento: "+dados[i]+"\n");
		}
	}
	}

