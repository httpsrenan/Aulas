package school.sptech;

public class Aluno {
    private Integer ra;
    private String nome;
    private Boolean ativo;
    private Boolean inadiplente;
    private Double nota1;
    private Double nota2;

    public Aluno(Integer ra,  String nome, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.ativo = true;
        this.inadiplente = false;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(Double nota1, Double nota2) {
        Double media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getInadiplente() {
        return inadiplente;
    }

        public void setInadiplente(Boolean inadiplente) {
        this.inadiplente = inadiplente;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}
