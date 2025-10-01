package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Streaming {
    List<Filme> filmes;

    public void adicionarFilme(Filme filme){
        filmes.add(filme);
        System.out.println("Filme adicionado com sucesso!");
    }
    public void removerFilme(Integer id){
        for(int i = 0; i<filmes.size(); i++){
            if(filmes.get(i).getId() == id){
                filmes.remove(i);
                System.out.println("Filme removido com sucesso!");
            }
        }
    }

    public Integer getQuantidadeDeFilmes(){
        System.out.println("Quantidade de filmes: " + filmes.size());
        return filmes.size();
    }

    public Double getMediaFilmes(){
        Double media = 0.0;
        for(int i = 0; i<filmes.size(); i++){
            media += filmes.get(i).getNotaImdb();
        }
        media = media / filmes.size();
        System.out.println("Media de notas: " + media);
        return media;
    }

    public Filme getFilmePeloNome(String nome) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("Filme encontrado com sucesso!");
                return filmes.get(i);
            }
        }
        return null;
    }

    public List<Filme> getFilmesPorCategoria(String categoria){
        List<Filme> filmesapoio = new ArrayList<>();
        for(int i = 0; i<filmes.size(); i++){
            if(filmes.get(i).getCategoria().equalsIgnoreCase(categoria)){
                filmesapoio.add(filmes.get(i));
            }
        }
        System.out.println("Filmes encontrados: ");
        for (int j = 0; j < filmesapoio.size(); j++){
            System.out.println(filmesapoio.get(j).getNome());
        }
        return filmesapoio;
    }

    public Filme getFilmeMaiorNota() {
        if (filmes == null || filmes.isEmpty()) {
            return null;
        }
        Filme maior = filmes.get(0);
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getNotaImdb() > maior.getNotaImdb()) {
                maior = filmes.get(i);
            }
        }
        System.out.println("Filme maior nota: " + maior.getNome());
        return maior;
    }

    public Filme sortearFilme(){
        Integer sorteio = (int) (Math.random() * (filmes.size() - 1 ));
        System.out.println("Filme sorteado: "  + filmes.get(sorteio).getNome());
        return filmes.get(sorteio);
    }
}
