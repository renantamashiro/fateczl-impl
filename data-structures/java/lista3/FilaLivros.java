package lista3;

public class FilaLivros {

    private Livro dados[];
    private int tamanho;

    public FilaLivros(int tamanho) {
        this.dados = new Livro[tamanho];
        this.tamanho = tamanho;
    }

    public void setLivros(Livro[] livros) {
        this.dados = livros;
    }

    public void enqueue(Livro livro) {
        this.dados[this.tamanho] = livro;
        this.tamanho += 1;
    }

    public Livro dequeue() {
        Livro livro = this.dados[0];

        for (int i = 1; i < this.tamanho; i++) {
            this.dados[i-1] = this.dados[i];
        }

        this.dados[this.tamanho-1] = null;

        return livro;
    }

    public StringBuffer show() {
        StringBuffer sb = new StringBuffer();

        sb.append("Fila de Livros");
        for (Livro livro : this.dados) {
            sb.append(livro.getTitulo() + ", exemplares: " + livro.getExemplares());
        }
        return sb;
    }
}
