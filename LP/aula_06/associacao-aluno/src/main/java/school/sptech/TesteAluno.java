package school.sptech;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno
                (42511017, "Renan Antonini", 7.0, 7.5);
        Aluno a2 = new Aluno
                (42511117, "Anna Luiza", 10.0, 9.5);
        Aluno a3 = new Aluno
                (42511217, "João Pedro", 4.5, 5.5);

        System.out.println("\n");
        Secretaria.registraPagamento(a1);
        System.out.println("\n");
        Secretaria.registraAtrasoPag(a2);
        System.out.println("\n");
        Secretaria.registraCancelamento(a3);
        System.out.println("\n");

        Secretaria.verificaAprovacaoAluno(a1);
        System.out.println("\n");
        Secretaria.verificaAprovacaoAluno(a2);
        System.out.println("\n");
        Secretaria.verificaAprovacaoAluno(a3);
        System.out.println("\n");

        Secretaria.exibirRelatorio();
    }
}
