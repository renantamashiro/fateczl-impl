package lote2;

public class TesteInvestimento {
    public static void main(String[] args) {
        Emprestimo simulacaoPessoal = new Emprestimo("Itaú",
                "pessoal", 140000, 0.11, 40);
        simulacaoPessoal.imprimirDados();

        Emprestimo simulacaoCasa = new Emprestimo("Caixa",
                "SFH", 140000, 0.06, 60);
        simulacaoCasa.imprimirDados();
    }
}
