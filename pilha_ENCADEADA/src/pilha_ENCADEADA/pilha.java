package pilha_ENCADEADA;

public class pilha {

	private No topo;
	private int tamanho;
	
	public pilha(){
		
		topo = null;
		tamanho = 0;
	}
	
	public boolean pilha_vazia() {
		if(tamanho==0) {
			return true;
		}else {
			return false;
		}
	}
	public int pilha_tamanho() {
		
		return tamanho;
	}
	public int top() {
		if(pilha_vazia()) {
			return -1;
		}else {
		return topo.getConteudo();
		}
	}
	public boolean push(int valor){
		No novo_no = new No();
		novo_no.setConteudo(valor);
		novo_no.setProximo(topo);
		
		topo = novo_no;
		tamanho++;
		return true;
	}
	
	public int pop() {
		int valor;
		No p = topo;
		valor = p.getConteudo();
		
		topo = p.getProximo();
		tamanho--;
		p = null;
		return valor;
		
		
	}
}
