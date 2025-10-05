package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer ra;

    List<Aluno> notas =  new ArrayList<>();

    public void  adicionarNota(Double nota){
        notas.add(nota);
    }
}
