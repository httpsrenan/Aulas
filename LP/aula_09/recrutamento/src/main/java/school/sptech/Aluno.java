package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer ra;

    private List<Double> notas =  new ArrayList<>();

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public void  adicionarNota(Double nota){
        notas.add(nota);
    }

    public Double calcularMedia(){
        Double media = 0.0;
        for (int i = 0; i<notas.size(); i++){
            media += notas.get(i);
        }
        if(notas.size()>0){
            media = media/notas.size();
            return media;
        } else{
            return 0.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno = " +
                "nome='" + nome + '\'' +
                "| ra=" + ra +
                '}';
    }
}
