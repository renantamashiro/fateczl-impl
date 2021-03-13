package lote2;

import java.lang.Math;


public class Emprestimo {

    private String banco;
    private String categoria;
    private double valor;
    private double taxaJuros;
    private int periodoCapitalizacao;

    public Emprestimo(String banco, String categoria,
                      double valor, double taxaJuros,
                      int periodoCapitalizacao) {
        this.banco = banco;
        this.categoria = categoria;
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.periodoCapitalizacao = periodoCapitalizacao;
    }

    public double valorFuturoSimples() {
        return (this.taxaJuros * this.periodoCapitalizacao + 1) * this.valor;
    }

    public double valorFuturoComposto() {
        return Math.pow(1+this.taxaJuros, this.periodoCapitalizacao) * this.valor;
    }

    public void imprimirDados() {
        System.out.printf("\nSimulador de Empréstimos\n"
                        + "Banco: %s - categoria: %s\n"
                        + "Valor Emprestado: %.2f - Taxa de Juros: %.2f - Capitalização: %d\n"
                        + "Valor Futuro (simples): %.2f - Valor Futuro (composto): %.2f\n",
                this.banco, this.categoria, this.valor, this.taxaJuros,
                this.periodoCapitalizacao, this.valorFuturoSimples(), this.valorFuturoComposto());
    }
}
