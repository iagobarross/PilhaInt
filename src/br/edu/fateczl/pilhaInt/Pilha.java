package br.edu.fateczl.pilhaInt;

public class Pilha {

	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int count = 0;
		if(!isEmpty()) {
			No aux = topo;
			count = 1;
			while(aux.proximo != null) {
				count++;
				aux = aux.proximo;
			}
		}
		
		return count;
	}
	
	

}
