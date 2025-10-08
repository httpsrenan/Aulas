package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private static List<Aluno> alunos =  new ArrayList<>();

    public void adicionarAluno(Aluno nome){
        alunos.add(nome);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public static String getAlunoPorRa(Integer ra){
            for (int i = 0; i<alunos.size(); i++){
                if(ra.equals(alunos.get(i).getRa())){
                    System.out.println("Aluno encontrado");
                    System.out.println(alunos.get(i));
                    return alunos.get(i).getNome();
                }
            }
                System.out.println("Aluno não encontrado");
                return null;
    }

    public static List<String> getAlunoPorNome(String nome){
        List<String> alunosEncontrados = new ArrayList<>();
            String nomeBusca = nome.toLowerCase();

            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getNome().toLowerCase().contains(nomeBusca)) {
                    alunosEncontrados.add(alunos.get(i).getNome());
                }
            }
            if(!alunosEncontrados.isEmpty()){
                System.out.println("Aluno encontrado");
                return alunosEncontrados;
            }else {
                return alunosEncontrados;
            }
    }

    public static String getAlunoComMaiorMedia() {
        if (alunos.isEmpty()) {
            return null;
        } else {
            Double maiorMedia = 0.0;
            String alunoComMaiorMedia = "";
            for (int i = 0; i < alunos.size(); i++) {
                Double mediaAtual = alunos.get(i).calcularMedia();
                if (mediaAtual > maiorMedia) {
                    maiorMedia = mediaAtual;
                    alunoComMaiorMedia = alunos.get(i).getNome();
                }
            }
            return alunoComMaiorMedia;
        }
    }

    public static String getAlunoComMenorMedia() {
        if (alunos.isEmpty()) {
            return null;
        } else {
            Double menorMedia = 100.0;
            String alunoComMenorMedia = "";
            for (int i = 0; i < alunos.size(); i++) {
                Double mediaAtual = alunos.get(i).calcularMedia();
                if (mediaAtual < menorMedia) {
                    menorMedia = mediaAtual;
                    alunoComMenorMedia = alunos.get(i).getNome();
                }
            }
            return alunoComMenorMedia;
        }
    }

    public static Double calcularMediaDaTurma(){
        if (alunos.isEmpty()) {
            return 0.0;
        }
        else {
            Double mediaAtual = 0.0;
            for (int i = 0; i < alunos.size(); i++) {
                mediaAtual += alunos.get(i).calcularMedia();
            }
            mediaAtual = mediaAtual / alunos.size();
            return mediaAtual;
        }
    }

    public static Double getMediaPorRa(Integer ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (ra.equals(alunos.get(i).getRa())) {
                return alunos.get(i).calcularMedia();
            }
        }
        return 0.0;
    }

    public static Double getMediana() {
        if (alunos.isEmpty()) {
            return 0.0;
        } else {
            List<Double> medias = new ArrayList<>();
            for (int i = 0; i < alunos.size(); i++) {
                medias.add(alunos.get(i).calcularMedia());
            }
            int n = medias.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 1; j < n - i; j++) {

                    if (medias.get(j - 1) > medias.get(j)) {
                        Double aux = medias.get(j - 1);
                        medias.set(j - 1, medias.get(j));
                        medias.set(j, aux);
                    }
                }
            }
            if (n % 2 != 0) {
                int Mediana = (n - 1) / 2;
                return medias.get(Mediana);
        }
            else  {
                Integer indiceMediana1 = (n - 1) / 2;
                Integer indiceMediana2 = ((n - 1) / 2 ) + 1;

                Double mediana1 = medias.get(indiceMediana1);
                Double mediana2 = medias.get(indiceMediana2);

                Double mediana = (mediana1 + mediana2)/2;
                return mediana;
            }
    }
    }
}
