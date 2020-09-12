package lista2;

public class ListaTemperatura {
	
	private double dados[];
	private int tamanho = 0;
			
	public ListaTemperatura(int tamanho) {
		this.dados = new double[tamanho];
	}
	
	/*
	 * Verifica se a lista está vazia
	 */
	public boolean listaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}
	
	/*
	 * Verifica se a lista está cheia
	 */
	public boolean listaCheia() {
		if (tamanho == this.dados.length + 1) {
			return true;
		}
		return false;
	}
	
	/*
	 * Adiciona caractere no início da lista
	 */
	public void adicionaNoInicio(double temperatura) {
		if (this.tamanho == this.dados.length) {
			System.out.println("Lista cheia, operação não pode ser realizada");;
			return;
		}
		
		for (int i = this.tamanho; i > 0; i--) {
			this.dados[i] = this.dados[i-1];
		}
		
		this.dados[0] = temperatura;
		this.tamanho += 1;
	}
	
	/*
	 * Adiciona caractere no início da lista
	 */
	public void adicionaNoFinal(double temperatura) {
		if (this.tamanho == this.dados.length) {
			System.out.println("Lista cheia, operação não pode ser realizada");;
			return;
		}
		
		this.dados[this.tamanho] = temperatura;
		this.tamanho += 1;
	}
	
	/*
	 * Adiciona um elemento em uma determinada posição
	 */
	public void adicionaEmPosicao(double temperatura, int posicao) {
		if (this.tamanho == this.dados.length) {
			System.out.println("Lista cheia, operação não pode ser realizada");;
			return;
		} else if ((posicao >= this.dados.length) || (posicao < 0)) {
			System.out.println("Posição inexistente, operação não pode ser realizada");;
			return;
		}
		
		for (int i = this.tamanho; i > posicao; i--) {
			this.dados[i] = this.dados[i-1];
		}
		
		this.dados[posicao] = temperatura;
		this.tamanho += 1;
	}
	
	/*
	 * Remove o primeiro elemento da lista
	 */
	public double removeInicioLista() {
		if (this.tamanho == 0) {
			System.out.println("Lista vazia. Sem elementos para remover");
			return 0.;
		}
		
		double elementoRemovido = this.dados[0];
		
		for (int i = 0; i < this.tamanho; i++) {
			this.dados[i] = this.dados[i+1];
		}
		
		this.tamanho -= 1;
		
		return elementoRemovido;
	}
	
	/*
	 * Remove o último elemento da lista
	 */
	public double removeFinalLista() {
		if (this.tamanho == 0) {
			System.out.println("Lista vazia. Sem elementos para remover");
			return 0.;
		}
		
		double elementoRemovido = this.dados[this.tamanho-1];
		this.dados[this.tamanho-1] = ' ';
		
		this.tamanho -= 1;
		
		return elementoRemovido;
	}
	
	/*
	 * Remove um elemento em uma determinada posição
	 */
	public double removeEmPosicao(int posicao) {
		if (this.tamanho == 0) {
			System.out.println("Lista vazia. Sem elementos para remover");
			return 0.;
		} else if ((posicao >= this.dados.length) || (posicao < 0)) {
			System.out.println("Posição inexistente, operação não pode ser realizada");
			return 0.;
		}
		
		double elementoRemovido = this.dados[posicao];
		
		for (int i = posicao; i < this.tamanho; i++) {
			this.dados[i] = this.dados[i+1];
		}
		
		this.tamanho -= 1;
		
		return elementoRemovido;
	}
	
	
	public String percorre() {
		String elementos = String.valueOf(this.dados[0]);
		for (int i = 1; i < this.tamanho; i++) {
			elementos += "\n" + String.valueOf(this.dados[i]);
		}
		return elementos;
	}
	
}
