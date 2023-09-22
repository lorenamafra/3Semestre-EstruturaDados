package br.senac.aula06;

public class No <T>{
	private T elemento;
	private No<T> proximo;
	
	//elemento = informação
	public No (T elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}
	
	//passa a informação (elemento) e o elo de ligação (proximo)
	public No(T elemento, No<T> proximo) {
		
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
	//tudo escrito após @Override é o que conta.
	//ex: se no pc está abc e eu quiser lmn, uso override para subescrever o que eu quero
	@Override
	public String toString() {
		return "No {" + "elemento: " + elemento + ", proximo " + proximo + '}';
	}
	
	
	

}
