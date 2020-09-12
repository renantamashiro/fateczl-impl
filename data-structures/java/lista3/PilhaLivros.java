package lista3;

public class PilhaLivros {

    private Livro dados[];
    private int tamanho;

    public PilhaLivros(int tamanho) {
        this.dados = new Livro[tamanho];
        this.tamanho = tamanho;
    }

    public void setLivros(Livro[] livros) {
        this.dados = livros;
    }

    public void push(Livro livro) {
        this.dados[this.tamanho] = livro;
        this.tamanho += 1;
    }

    public Livro pop() {
        Livro livro = this.dados[this.tamanho-1];

        this.dados[this.tamanho-1] = null;
        this.tamanho -= 1;

        return livro;
    }

    public StringBuffer show() {
        StringBuffer sb = new StringBuffer();

        sb.append("Pilha de Livros");
        for (Livro livro : this.dados) {
            sb.append(livro.getTitulo() + ", exemplares: " + livro.getExemplares());
        }
        return sb;
    }
}
