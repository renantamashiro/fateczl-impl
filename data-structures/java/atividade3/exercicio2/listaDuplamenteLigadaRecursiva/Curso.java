package atividade3.exercicio2.listaDuplamenteLigadaRecursiva;

public class Curso {

    private int id;
    private String nome;
    private String area;
    private int semestres;
    private String periodo;

    private Curso next;
    private Curso previous;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Curso getNext() {
        return next;
    }

    public void setNext(Curso curso) {
        this.next = curso;
    }

    public Curso getPrevious() {
        return previous;
    }

    public void setPrevious(Curso previous) {
        this.previous = previous;
    }
}