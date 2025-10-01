package school.sptech;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;

public class TesteLivraria {
    public static void main(String[] args) {
        Boolean continuar = true;
        Connection connection = new Connection();

        JdbcTemplate con = new JdbcTemplate(connection.getDataSource());

        con.execute("CREATE TABLE IF NOT EXISTS livros(" +
                "id int primary key auto_increment," +
                "nome varchar(100)," +
                "preco double);");

        Scanner leitor = new Scanner(System.in);

        while (continuar) {
            System.out.println("+------------------------------+");
            System.out.println("| Livraria SPTECH              |");
            System.out.println("+------------------------------+");
            System.out.println("| 1) Cadastrar Livro           |");
            System.out.println("| 2) Exibir Livros             |");
            System.out.println("| 3) Atualizar Livro           |");
            System.out.println("| 4) Remover Livro             |");
            System.out.println("| 5) Buscar por nome           |");
            System.out.println("| 6) Sair                      |");
            System.out.println("+------------------------------+");

            System.out.println("Selecione uma opção:");
            Integer opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do livro:");
                String nome = leitor.next();
                System.out.println("Digite o preco do livro:");
                Double preco = leitor.nextDouble();
                con.update("INSERT INTO livros (nome, preco) VALUES " +
                        "('nome',preco);");
                System.out.println("Livro cadastrado com sucesso!");
            }

            if (opcao == 2) {
                for (int i = 0; i<livro; i++)
            }
        }
    }
}
