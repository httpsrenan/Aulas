package school.sptech;
import java.util.List;

public class Prateleira {
    List<Livro> livros;
    Integer limite;
    Double peso;

    public void adicionarLivro(Livro livro){
        if(limite >= livros.size()){
            livros.add(livro);
            peso += livro.calcularPeso();
            System.out.println("Livro adicionado com sucesso!");
        }else{
            System.out.println("Prateleira cheia");
        }
    }

    public void removerLivro(String codigo){
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getCodigo().equals(codigo)){
                livros.remove(i);
                peso -= livros.get(i).calcularPeso();
                System.out.println("Livro removido com sucesso!");
            }
        }
    }

    public Integer quantidadeLivros(){
        System.out.println("Quantidade de livros: " + livros.size());
        return livros.size();
    }

    public Double getPesoTotal(){
        System.out.println("Peso Total: " + peso);
        return peso;
    }

    public Livro getLivroPorNome(String nome){
        for(int i = 0; i < livros.size(); i++){
            if (livros.get(i).getNome().equalsIgnoreCase(nome)){
                System.out.println("Livro encontrado com sucesso!");
                return livros.get(i);
            }
        }
        return null;
    }
}
