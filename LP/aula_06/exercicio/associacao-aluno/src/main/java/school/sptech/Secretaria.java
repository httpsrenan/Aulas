package school.sptech;

public class Secretaria {
    private static Integer totalInadimplentes;
    private static Integer totalCancelamentos;
    private static Integer totalPagamentos;

    public Secretaria() {
        totalInadimplentes = 0;
        totalCancelamentos = 0;
        totalPagamentos = 0;
    }

    public static void registraPagamento(Aluno aluno){
        aluno.setInadiplente(false);
        System.out.println("O aluno " + aluno.getNome() + " de ra " + aluno.getRa() +
                " está em dia com o pagamento.");
         setTotalPagamentos(+1);
    }

    public static void registraAtrasoPag(Aluno aluno){
        aluno.setInadiplente(true);
        System.out.println("O aluno " + aluno.getNome() + " de ra " + aluno.getRa() +
                " está inadiplente.");
        setTotalInadimplentes(+1);
    }

    public static void  registraCancelamento(Aluno aluno){
        aluno.setAtivo(false);
        System.out.println("O aluno " + aluno.getNome() + " de ra " + aluno.getRa() +
                " cancelou a matrícula.");
        setTotalCancelamentos(+1);
    }

    public static void verificaAprovacaoAluno(Aluno aluno){
        Double media = (aluno.getNota1() + aluno.getNota2()) /2;

        if (aluno.getAtivo() == true){
            System.out.println("Sitiação -> ATIVO" );
        } else{
            System.out.println("Sitiação -> INATIVO" );
        }
        System.out.println("RA: " + aluno.getRa());
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("NOTA1: " + aluno.getNota1());
        System.out.println("NOTA2: " + aluno.getNota2());
        System.out.println("MEDIA: " + media);
        if (media >= 6){
            System.out.println("STATUS: Aprovado");
        }else{
            System.out.println("STATUS: Reprovado");
        }
        if (aluno.getInadiplente() == true){
            System.out.println("INADIPLENTE: SIM");
        }else {
            System.out.println("INADIPLENTE: NAO");
        }
    }

    public static void exibirRelatorio(){
        System.out.println("__________RELATORIO__________");
        System.out.println("Pagamentos realizados: " + getTotalPagamentos());
        System.out.println("Inadiplentes: " + getTotalInadimplentes());
        System.out.println("Evasões: " + getTotalCancelamentos());
    }

    public static Integer getTotalInadimplentes() {
        return totalInadimplentes;
    }

    public static void setTotalInadimplentes(Integer totalInadimplentes) {
        Secretaria.totalInadimplentes = totalInadimplentes;
    }

    public static Integer getTotalCancelamentos() {
        return totalCancelamentos;
    }

    public static void setTotalCancelamentos(Integer totalCancelamentos) {
        Secretaria.totalCancelamentos = totalCancelamentos;
    }

    public static Integer getTotalPagamentos() {
        return totalPagamentos;
    }

    public static void setTotalPagamentos(Integer totalPagamentos) {
        Secretaria.totalPagamentos = totalPagamentos;
    }
}
