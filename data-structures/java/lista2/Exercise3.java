package lista2;

public class Exercise3 {
	public static void main(String[] args) {
		ListaCaracteres lc = new ListaCaracteres(5);
		
		lc.adicionaNoFinal('a');
		lc.adicionaNoFinal('b');
		lc.adicionaNoFinal('c');

		lc.adicionaEmPosicao('r', 0);
 
		System.out.println(lc.percorre());
	}
}
