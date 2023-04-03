package Pilha_Seque;

public class Pilha_Sequencial {
	
private int dados[];
private int topo;
private int tamanho_max;

public Pilha_Sequencial(int tamanho) {
	
	tamanho_max = tamanho;
	dados = new int[tamanho_max];
	topo= -1;
}

public boolean pilha_vazia() {
	
	if(topo == -1) {
		return true;
	}else return false;
}

public boolean pilha_cheia() {
	
	if(topo == tamanho_max -1) {
		return true;
	}else return false;
}
public int tamanho() {
	return topo+1;
}
public int top() {
	
	if(pilha_vazia()) {
		return -1; 		// lista vazia!
	}else return dados[topo];
}
public boolean push(int valor) {

	if(pilha_cheia()) {
		return false;
}else
	topo++;
	dados[topo] = valor;
	return true;
}
public int pop() {
	
	if(pilha_vazia()) {
		return -1;	    // lista vazia!
	}else{ 
		int valor = dados[topo];
		topo--;
		return valor;
		}
	}
}
