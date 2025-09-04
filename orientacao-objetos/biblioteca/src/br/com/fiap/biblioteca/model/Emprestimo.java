package br.com.fiap.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private int id;
    private Leitor leitor;
    private List<Exemplar> exemplares;

    public Emprestimo(Leitor leitor) {
        this.leitor = leitor;
        this.exemplares = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public List<Exemplar> getLivros() {
        return exemplares;
    }

    public void emprestarExemplar(Exemplar exemplar){
        if(exemplar.isEmprestado()){
            System.out.println("Livro indisponível");
        }else {
            exemplar.setEmprestado(true);
            exemplares.add(exemplar);
        }
    }

    public void devolverExemplar(Exemplar exemplar){
        System.out.println("Devolvendo o Exemplar: " + exemplar.getLivro().getTitulo());
        exemplares.remove(exemplar);
        exemplar.setEmprestado(false);
    }

    public void mostrarEmprestimo(){
        System.out.println("Id do Emprestimo: " + this.id);
        System.out.println("Nome do Leitor: " + this.leitor.getNome());
        for (Exemplar exemplar: exemplares){
            System.out.println("Título: " + exemplar.getLivro().getTitulo());
        }
        System.out.println("-------------------------------------------");
    }


}
