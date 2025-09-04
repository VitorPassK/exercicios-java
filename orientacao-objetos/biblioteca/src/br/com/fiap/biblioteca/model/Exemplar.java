package br.com.fiap.biblioteca.model;

public class Exemplar {
    private int tombo;
    private String estado;
    private Livro livro;
    private boolean isEmprestado;


    public void mostrarDetalhesDoExemplar(){
        System.out.println("Exemplar: " + this.livro.getTitulo());
        System.out.println("Autor: " + this.livro.getAutor());
        System.out.println("Estado: " + this.estado);
        System.out.println("Emprestado: " + this.isEmprestado);
        System.out.println("Tombo: " + this.tombo);
        System.out.println("---------------------------------");

    }


    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public boolean isEmprestado() {
        return isEmprestado;
    }

    public void setEmprestado(boolean emprestado) {
        isEmprestado = emprestado;
    }
}
