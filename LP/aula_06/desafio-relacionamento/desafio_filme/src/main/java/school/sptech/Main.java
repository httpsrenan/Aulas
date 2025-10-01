package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // CRIANDO LIST PRA O STREAMING
        Streaming st = new Streaming();

        // INICIALIZAÇÃO NECESSARIA
        st.filmes = new ArrayList<>();

        // CRIAR FILMES
        Filme f1 = new Filme();
        f1.setId(1);
        f1.setNome("Inception");
        f1.setCategoria("Ficção");
        f1.setNotaImdb(8.8);

        Filme f2 = new Filme();
        f2.setId(2);
        f2.setNome("The Dark Knight");
        f2.setCategoria("Ação");
        f2.setNotaImdb(9.0);

        Filme f3 = new Filme();
        f3.setId(3);
        f3.setNome("Interestelar");
        f3.setCategoria("Ficção");
        f3.setNotaImdb(8.6);

        // ADICIONANDO
        st.adicionarFilme(f1);
        st.adicionarFilme(f2);
        st.adicionarFilme(f3);

        // VER QUANTIDADE
        st.getQuantidadeDeFilmes();

        // VER NOTA MEDIA
        st.getMediaFilmes();

        // BUSCAR POR NOME
        st.getFilmePeloNome("interestelar");

        // LiISTAR POR CATEGORIA
        st.getFilmesPorCategoria("ficção");

        // MAIOR NOTA
        st.getFilmeMaiorNota();

        // SORTEIO
        st.sortearFilme();

        // REMOVER
        st.removerFilme(2);

        // VER QUANTIDADE
        st.getQuantidadeDeFilmes();

        // VER NOTA MEDIA
        st.getMediaFilmes();
    }
}