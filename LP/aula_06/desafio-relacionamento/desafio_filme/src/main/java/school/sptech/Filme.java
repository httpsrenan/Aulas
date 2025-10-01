package school.sptech;

public class Filme {
    private Integer id;
    private String nome;
    private String categoria;
    private Double notaImdb;

    public Double getNotaImdb() {
        return notaImdb;
    }

    public void setNotaImdb(Double notaImdb) {
        this.notaImdb = notaImdb;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
