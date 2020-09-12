package lista2;

public class Exercise2 {

	public static void main(String[] args) {
		Lista ls  = new Lista();
		
		for (int i = 0; i < 5; i++) {
			ls.AdicionaFinal(i);
		}
		
		int removido = ls.removeElementoPosicao(4);
		
		System.out.println(removido);
		System.out.println(ls.percorre());
	}
}
