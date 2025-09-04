package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.model.Emprestimo;
import br.com.fiap.biblioteca.model.Exemplar;
import br.com.fiap.biblioteca.model.Leitor;
import br.com.fiap.biblioteca.model.Livro;

public class BibliotecaApp {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setId(1);
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setIsbn("9786586490084");

        Livro livro2 = new Livro();
        livro2.setId(2);
        livro2.setTitulo("O Alquimista");
        livro2.setAutor("Paulo Coelho");
        livro2.setIsbn("9786586490542");

        Exemplar exemplar1 = new Exemplar();
        exemplar1.setEstado("Novo");
        exemplar1.setTombo(1);
        exemplar1.setEmprestado(false);
        exemplar1.setLivro(livro1);

        Exemplar exemplar2 = new Exemplar();
        exemplar2.setEstado("Danificado");
        exemplar2.setTombo(2);
        exemplar2.setEmprestado(false);
        exemplar2.setLivro(livro1);

        Exemplar exemplar3 = new Exemplar();
        exemplar3.setEstado("Novo");
        exemplar3.setTombo(2);
        exemplar3.setEmprestado(false);
        exemplar3.setLivro(livro2);

        exemplar1.mostrarDetalhesDoExemplar();
        exemplar2.mostrarDetalhesDoExemplar();
        exemplar3.mostrarDetalhesDoExemplar();

        Leitor leitor1 = new Leitor();
        leitor1.setId(1);
        leitor1.setNome("Ana Maria");
        leitor1.setTelefone("111-222-3333");

        System.out.println("****************************");

        Emprestimo emprestimo1 = new Emprestimo(leitor1);
        emprestimo1.setId(100);
        emprestimo1.emprestarExemplar(exemplar1);
        emprestimo1.emprestarExemplar(exemplar2);
        emprestimo1.emprestarExemplar(exemplar3);
        emprestimo1.mostrarEmprestimo();
    }
}
