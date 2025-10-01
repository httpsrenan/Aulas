package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prateleira prateleira = new Prateleira();

        prateleira.livros = new ArrayList<>();
        prateleira.limite = 2;
        prateleira.peso = 0.0;

        // CRIANDO LIVRO
        Livro l1 = new Livro();
        l1.setCodigo("A1");
        l1.setNome("Algoritmos");
        l1.setAutor("Cormen");
        l1.setQuantidadePaginas(1000);

        Livro l2 = new Livro();
        l2.setCodigo("B2");
        l2.setNome("Clean Code");
        l2.setAutor("Robert C. Martin");
        l2.setQuantidadePaginas(464);

        Livro l3 = new Livro();
        l3.setCodigo("C3");
        l3.setNome("Domain-Driven Design");
        l3.setAutor("Eric Evans");
        l3.setQuantidadePaginas(560);

        // ADICIONANDO LIVROS
        prateleira.adicionarLivro(l1);
        prateleira.adicionarLivro(l2);
        prateleira.adicionarLivro(l3);

        // VER QUANTIDADE DE LIVROS NA PRATELEIRA
        prateleira.quantidadeLivros();

        // VER PESO DA PRTELEIRA
        prateleira.getPesoTotal();

        // PROCURANDO LIVRO PELO NOME
        prateleira.getLivroPorNome("clean code");

        // REMOVENDO LIVRO PELO CODIGO
        prateleira.removerLivro("B2");

        // VER QUANTIDADE DE LIVROS NA PRATELEIRA
        prateleira.quantidadeLivros();

        // VER PESO DA PRTELEIRA
        prateleira.getPesoTotal();


    }
}